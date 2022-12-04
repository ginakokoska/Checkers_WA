package controllers

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import akka.stream.Materializer
import checkers.Checkers
import checkers.Checkers.controller.gameState
import checkers.controller.controllerComponent.{ControllerInterface, FieldChanged, GBSizeChanged}
import checkers.controller.controllerComponent.GameState.{BLACK_TURN, GameState, WHITE_TURN}
import checkers.controller.controllerComponent.controllerBaseImpl.PrintTui
import checkers.model.gameBoardComponent.FieldInterface
import play.api.libs.json.{JsObject, Writes}
import play.api.libs.streams.ActorFlow

import scala.swing.Reactor
//import checkers.controller.controllerComponent.ControllerInterface
import checkers.model.gameBoardComponent.gameBoardBaseImpl.{Field, GameBoard, Piece}

import javax.inject._
import play.api._
import play.api.libs.json.{JsNull, JsNumber, JsString, JsValue, Json, Writes}
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents)(implicit system: ActorSystem, mat: Materializer) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

  val gameController = Checkers.controller
  var message: String = ""

  def checkersAsText: String = gameController.gameBoardToString

  def notFound = NotFound(<h1>Page not found</h1>)

  def instructions = Action {
    Ok(views.html.instructions())
  }

  def home() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.home())
  }

  def test = Action {
    Ok(views.html.test(gameController))
  }

  def checkers_game: Action[AnyContent] = Action {
    Ok(views.html.checkers_game(gameController, message))
  }
  def new8Grid: Action[AnyContent] = Action {
    message = ""
    gameController.createGameBoard(8)
    Ok(views.html.checkers_game(gameController, message))
  }

  def new10Grid: Action[AnyContent] = Action {
    message = ""
    gameController.createGameBoard(10)
    Ok(views.html.checkers_game(gameController, message))
  }

  def newBoard(size:String): Unit = {
    gameController.createGameBoard(Integer.parseInt(size))
  }

  def jsMove(mv:String): Unit = {
    try {
      val start = mv.split(" ")(0)
      val dest = mv.split(" ")(1)
      if (gameController.movePossible(start, dest).getBool) {
        val row = Integer.parseInt(dest.tail) - 1
        val col = dest.charAt(0).toInt - 65
        var rem = false
        var which = ""
        if (gameController.movePossible(start, dest).getRem.nonEmpty && gameController.gameState.toString.charAt(0).toString.toLowerCase == gameController.getPiece(Integer.parseInt(start.tail) - 1, start.charAt(0).toInt - 65).get.getColor.charAt(0).toString) rem = true;
        which = gameController.movePossible(start, dest).getRem
        if (gameController.movePossible(start, dest).getQ && gameController.gameState.toString.charAt(0).toString.toLowerCase == gameController.getPiece(Integer.parseInt(start.tail) - 1, start.charAt(1).toInt - 65).get.getColor.charAt(0).toString) {
          gameController.move(start, dest)
          gameController.set(row, col, Piece("queen", row, col, gameController.getPiece(row, col).get.getColor))
          if (rem) gameController.remove(Integer.parseInt(which.tail) - 1, which.charAt(0).toInt - 65)
        } else gameController.gameBoard.message = "";
        gameController.move(start, dest)
      } else gameController.gameBoard.message = "Move not possible"

    } catch {
      case e: Exception => gameController.gameBoard.message = "Invalid Input"
        gameController.gameBoard
    }
    gameController.gameBoard


  }


  def error(any:String) = Action {
    Ok(views.html.error(any))
  }

  def toJson() = Action {
    Ok(gameController.toJson)
  }

  def current = Action {
    Ok(Json.obj(
      "game" -> GameBoard()
      )
    )
  }


  def processCommand(cmd: String, data: String): String = {
    if (cmd.equals("\"newBoard\"")) {
      newBoard(data.replace("\"", ""))
    } else if (cmd.equals("\"jsMove\"")) {
      jsMove(data.replace("\"", ""))
    }
    "Ok"
  }




  def allRoutes = {
    """
      GET  /
      GET  / new8Grid
      GET  / new10Grid
      GET  / instructions
      GET  / test
      GET  / status
      POST / command
      GET  / errors / notfound
      """
  }

  implicit val fieldWrites: Writes[FieldInterface] = new Writes[FieldInterface] {
    def writes(field: FieldInterface) = Json.obj(
      "pos" -> field.getPos,
      "piece" -> pieceWrites.writes(field.getPiece)
    )
  }

  implicit val pieceWrites: Writes[Option[Piece]] = new Writes[Option[Piece]] {
    def writes(piece: Option[Piece]): JsValue = piece match {
      case Some(t) => Json.obj(
        "state" -> t.state,
        "prow" -> t.row,
        "pcol" -> t.col,
        "color" -> t.getColor,
      )
      case None => Json.obj(
        "state" -> "",
        "prow" -> "",
        "pcol" -> "",
        "color" -> "",
      )
    }
  }

  case class GameBoard()
  implicit val gameBoardWrites: Writes[GameBoard] = new Writes[GameBoard] {
    def writes(gameBoard: GameBoard): JsObject = Json.obj(
      "gameState" -> gameState.toString,
      "gameBoard" -> Json.obj(
        "size" -> JsNumber(gameController.gameBoardSize),
        "fields" -> Json.toJson(
          for {
            row <- 0 until gameController.gameBoardSize
            col <- 0 until gameController.gameBoardSize
          } yield {
            Json.obj(
              "row" -> row,
              "col" -> col,
              "field" -> Json.toJson(gameController.gameBoard.field(row, col))
            )
          }
        )
      )
    )
  }



// -------------------------------------------------------- WEBSOCKETS
// warum das secret array

  def processRequest: Action[AnyContent] = Action {
    implicit request => {
      val req = request.body.asJson
      val result = processCommand(req.get("cmd").toString(), req.get("data").toString())
      if (result.contains("Error")) {
        BadRequest(result)
      } else {
        Ok(Json.obj(
          "game" -> GameBoard()
        ))
      }
    }
  }

  def controllerToJson(reset: Int = 0) = {
    Json.obj(
      "game" -> GameBoard()
    ).toString
  }


  def socket = WebSocket.accept[String, String] { request =>
    ActorFlow.actorRef { out =>
      println("Connect received")
      CheckersSocketActorFactory.create(out)
    }
  }

  object CheckersSocketActorFactory {
    def create(out: ActorRef) = {
      Props(new CheckersSocketActorFactory(out))
    }
  }

  def wsCommand(cmd: String, data: String): String = {
    if (cmd.equals("newBoard")) {
      println("newBoard")
      newBoard(data)

    } else if (cmd.equals("jsMove")) {
      println("jsMove")
      jsMove(data)
    }
    "Ok"
  }

  class CheckersSocketActorFactory(out: ActorRef) extends Actor with Reactor {
    listenTo(gameController)

    def receive = {
      case msg: String =>
        val split_msg = msg.split('|')
        if (split_msg.length == 2) {
          val cmd = split_msg(0)
          val data = split_msg(1)
          wsCommand(cmd, data)
          out ! controllerToJson()
          println("Sent Json to Client " + msg)
        }
    }

    reactions += {
      case event: FieldChanged => out ! controllerToJson()
      case event: PrintTui => out ! controllerToJson()
      case event: GBSizeChanged => out ! controllerToJson()
    }

    def sendJsonToClient = {
      println("Received event from Controller")
      out ! (gameController.toJson.toString)
    }
  }


}
