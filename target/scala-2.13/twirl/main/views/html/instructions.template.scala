
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


Seq[Any](format.raw/*1.1*/("""<html>
<body>
<style>
h1 """),format.raw/*4.4*/("""{"""),format.raw/*4.5*/("""text-align: center;"""),format.raw/*4.24*/("""}"""),format.raw/*4.25*/("""
"""),format.raw/*5.1*/("""h1 """),format.raw/*5.4*/("""{"""),format.raw/*5.5*/("""color: darkred;"""),format.raw/*5.20*/("""}"""),format.raw/*5.21*/("""
"""),format.raw/*6.1*/("""</style>
<style>
h3 """),format.raw/*8.4*/("""{"""),format.raw/*8.5*/("""color: darkred;"""),format.raw/*8.20*/("""}"""),format.raw/*8.21*/("""
"""),format.raw/*9.1*/("""</style>
<article>
  <h1>
    Checkers Instruction
  </h1>
  <header>
    <h3>
      OBJECT
    </h3>
    <p>
      The objective is to remove all of your opponent's
      checkers from the gameboard by capturing them.
    </p>
  </header>
  <header>
    <h3>
      GAME SETUP
    </h3>
    <p>
      You will find 8 or 10 checkers already placed on
      the boards black squares.
    </p>
  </header>
  <header>
    <h3>
      HOW TO PLAY ?
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
      HOW TO WIN
    </h3>
    <p>
      The first player to capture all opposing checkers
      from the gameboard wins the game!
    </p>
  </header>
</article>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-22T21:17:45.387
                  SOURCE: C:/Users/petri/Desktop/Checkers_WA/app/views/instructions.scala.html
                  HASH: 061a467bcebd05b3512eec86963c7550488ddd3d
                  MATRIX: 818->0|872->28|899->29|945->48|973->49|1001->51|1030->54|1057->55|1099->70|1127->71|1155->73|1203->95|1230->96|1272->111|1300->112|1328->114
                  LINES: 26->1|29->4|29->4|29->4|29->4|30->5|30->5|30->5|30->5|30->5|31->6|33->8|33->8|33->8|33->8|34->9
                  -- GENERATED --
              */
          