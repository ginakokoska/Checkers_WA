
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object instructions extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html lang="en">
<head>
    <title>Checkers Instructions</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/x-icon" href='"""),_display_(/*7.49*/routes/*7.55*/.Assets.versioned("images/icon.png")),format.raw/*7.91*/("""'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
    <link rel="stylesheet" href='"""),_display_(/*10.35*/routes/*10.41*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.82*/("""'>
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<nav class="navbar navbar-dark bg-dark fixed-top">
    <div class="container-fluid">
        <a class="navbar-brand" href="http://localhost:9000/"> <i class="fa-solid fa-chess"></i> Checkers</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
            <div class="offcanvas-header">
                <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Checkers Menu</h5>
                <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
            </div>
            <div class="offcanvas-body">
                <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                    <li class="nav-item">
                        <a class="nav-link active"  aria-current="page" href="http://localhost:9000/"> <i class="fa-solid fa-igloo"></i> Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="https://github.com/ginakokoska/Checkers_WA"> <i class="fa-brands fa-github-alt"></i> GitHub</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            <i class="fa-solid fa-chess-board"></i> Boardsize
                        </a>
                        <ul class="dropdown-menu dropdown-menu-dark">
                            <li><a class="dropdown-item" href="http://localhost:9000/new8Grid" > <i class="fa-solid fa-chess-queen"></i> 8x8</a></li>
                            <li><a class="dropdown-item" href="http://localhost:9000/new10Grid"> <i class="fa-regular fa-chess-queen"></i> 10x10</a></li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="http://localhost:9000/instructions"> <i class="fa-solid fa-clipboard-list"></i> User Manual</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</nav>


<div data-bs-spy="scroll" data-bs-target="#navbar-example2" data-bs-root-margin="0px 0px -40%" data-bs-smooth-scroll="true" class="scrollspy-example bg-light p-3 rounded-2" tabindex="0">
    <article>
        <div style="padding:100px">
        <h1>
                CHECKERS INSTRUCTION
        </h1>
            <p></p>
        <header>
            <h3>
                Object
            </h3>
            <p>
                The objective is to remove all of your opponent's
                checkers from the gameboard by capturing them.
            </p>
        </header>
        <header>
            <h3>
                Game Setup
            </h3>
            <p>
                You will find 8 or 10 checkers already placed on
                the boards black squares.
            </p>
        </header>
        <header>
            <h3>
                How to play
            </h3>
            <p>
                Choose a player to go first. On your turn, move
                any of your checkers. Follow the movement rules described
                below. After you move one checker, your turn is over. The
                game continues with players taking alternating turns.
            </p>
        </header>
        <header>
            <h3>
                Movement Rules
            </h3>
            <li>
                Always move your checker diagonally
                <i>
                    forward
                </i>
                , toward your opponent's side of the
                boardgame.
                <i>
                    Note:
                </i>
                After a checker becomes a "King",
                he can move diagonally forward or backward.
            </li>
            <li>
                Move your checker one space diagonbally, to an
                open adjacent to the checker you jumped. When you jump
                over an oppenent's checker, you
                <i>
                    capture
                </i>
                it (see
                <i>
                    Capturing an Opponent's Checker
                </i>
                ).
            </li>
            <li>
                If all squares adjacent to your checker are
                occupied, your checker is blocked and cannot move.
            </li>
            <p></p>
        </header>
        <header>
            <h3>
                Capturing an Opponent's Checker
            </h3>
            <p>
                If you jump an opponent's checker, you capture it.
                Remove it from the gameboard and place it in front of
                you.
            </p>
        </header>
        <header>
            <h3>
                Becoming a "King"
            </h3>
            <p>
                As soon a one of your checkers reachers the first
                row on your ipponent's side of the gameboard, he becomes
                a King. Place another checker of the same color on top of
                it. Now this double-decker checker can move forward
                <i>
                    or
                </i>
                backward on the gameboard.
            </p>
        </header>
        <header>
            <h3>
                How to win
            </h3>
            <p>
                The first player to capture all opposing checkers
                from the gameboard wins the game!
            </p>
        </header>
    </article>

</div>



</body>
</html>

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-01-17T08:21:54.718
                  SOURCE: C:/Users/petri/Desktop/Checkers_WA/app/views/instructions.scala.html
                  HASH: 4de0fbb7f65ef07e54d16b5e6b3133edb7fa1a32
                  MATRIX: 818->0|1079->235|1093->241|1149->277|1544->645|1559->651|1621->692
                  LINES: 26->1|32->7|32->7|32->7|35->10|35->10|35->10
                  -- GENERATED --
              */
          