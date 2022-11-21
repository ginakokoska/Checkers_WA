package controllers

import checkers.Checkers
import checkers.controller.controllerComponent.ControllerInterface
import checkers.model.gameBoardComponent.gameBoardBaseImpl.Piece

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  val gameController: ControllerInterface = Checkers.controller
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

  def move(start:String, dest:String)= Action {


    try {

      if (gameController.movePossible(start, dest).getBool) {
        val row = Integer.parseInt(dest.tail) - 1
        val col = dest.charAt(0).toInt - 65
        var rem = false
        var which = ""
        if (gameController.movePossible(start, dest).getRem.nonEmpty && gameController.gameState.toString.charAt(0).toString.toLowerCase == gameController.getPiece(Integer.parseInt(start.tail) - 1, start.charAt(0).toInt - 65).get.getColor.charAt(0).toString) rem = true;
        which = gameController.movePossible(start, dest).getRem
        if (gameController.movePossible(start, dest).getQ && gameController.gameState.toString.charAt(0).toString.toLowerCase == gameController.getPiece(Integer.parseInt(start.tail) - 1, start.charAt(1).toInt - 65).get.getColor.charAt(0).toString) {
          print(gameController.getPiece(Integer.parseInt(start.tail) - 1, start.charAt(0).toInt - 65).get.getColor.charAt(0).toString)
          gameController.move(start, dest)
          gameController.set(row, col, Piece("queen", row, col, gameController.getPiece(row, col).get.getColor))
          if (rem) gameController.remove(Integer.parseInt(which.tail) - 1, which.charAt(0).toInt - 65)
        } else message = ""; gameController.move(start, dest)
      } else message = "Move not possible"

    } catch {
      case e: Exception => message = "Invalid input"; Ok(views.html.checkers_game(gameController, message))
    }

    //gameController.move(start, dest)
    Ok(views.html.checkers_game(gameController, message))

  }

  def error(any:String) = Action {
    Ok(views.html.error(any))
  }



}
