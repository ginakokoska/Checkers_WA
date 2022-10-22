package controllers

import checkers.Checkers
import checkers.controller.controllerComponent.ControllerInterface

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
  def index: Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def checkersAsText: String = gameController.gameBoardToString


  def instructions = Action {
    Ok(views.html.instructions())
  }

  def test = Action {
    Ok(views.html.test())
  }

  def notFound = NotFound(<h1>Page not found</h1>)
  def checkers_game: Action[AnyContent] = Action {
    Ok(views.html.checkers_game(gameController))
  }
  def new8Grid: Action[AnyContent] = Action {
    gameController.createGameBoard(8)
    Ok(views.html.checkers_game(gameController))
  }

  def new10Grid: Action[AnyContent] = Action {
    gameController.createGameBoard(10)
    Ok(views.html.checkers_game(gameController))
  }
}
