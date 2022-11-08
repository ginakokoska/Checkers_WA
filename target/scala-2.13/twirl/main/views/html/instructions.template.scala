
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


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>Checkers Instructions</title>
    <link rel="icon" type="image/x-icon" href='"""),_display_(/*5.49*/routes/*5.55*/.Assets.versioned("images/icon.png")),format.raw/*5.91*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("stylesheets/main.css")),format.raw/*6.82*/("""'>
</head>
<body>

<div class="navbar">
    <a href="http://localhost:9000/">Home</a>
    <a href="https://github.com/ginakokoska/Checkers_WA" target="_blank">GitHub</a>
    <a href="http://localhost:9000/instructions">Instructions</a>
    <div class="dropdown">
        <button class="dropbtn">Play
            <i class="fa fa-caret-down"></i>
        </button>
        <div class="dropdown-content">
            <div class="row">
                <div class="column">
                    <h3>Checkers Versions</h3>
                    <a href="http://localhost:9000/new8Grid">8x8</a>
                    <a href="http://localhost:9000/new10Grid">10x10</a>
                </div>
            </div>
        </div>
    </div>
</div>


<div style="padding:15px 15px 2500px;font-size:30px">
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

</div>

<script>
// When the user scrolls down 20px from the top of the document, slide down the navbar
window.onscroll = function() """),format.raw/*140.30*/("""{"""),format.raw/*140.31*/("""scrollFunction()"""),format.raw/*140.47*/("""}"""),format.raw/*140.48*/(""";

function scrollFunction() """),format.raw/*142.27*/("""{"""),format.raw/*142.28*/("""
  """),format.raw/*143.3*/("""if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) """),format.raw/*143.80*/("""{"""),format.raw/*143.81*/("""
    """),format.raw/*144.5*/("""document.getElementById("navbar").style.top = "0";
  """),format.raw/*145.3*/("""}"""),format.raw/*145.4*/(""" """),format.raw/*145.5*/("""else """),format.raw/*145.10*/("""{"""),format.raw/*145.11*/("""
    """),format.raw/*146.5*/("""document.getElementById("navbar").style.top = "-50px";
  """),format.raw/*147.3*/("""}"""),format.raw/*147.4*/("""
"""),format.raw/*148.1*/("""}"""),format.raw/*148.2*/("""
"""),format.raw/*149.1*/("""</script>

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
                  DATE: 2022-10-25T09:55:44.261
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/instructions.scala.html
                  HASH: 343e7ce4ac3bc893e4fd838bf599fa8d73f1e416
                  MATRIX: 818->0|963->119|977->125|1033->161|1096->198|1110->204|1171->245|5296->4341|5326->4342|5371->4358|5401->4359|5459->4388|5489->4389|5520->4392|5626->4469|5656->4470|5689->4475|5770->4528|5799->4529|5828->4530|5862->4535|5892->4536|5925->4541|6010->4598|6039->4599|6068->4600|6097->4601|6126->4602
                  LINES: 26->1|30->5|30->5|30->5|31->6|31->6|31->6|165->140|165->140|165->140|165->140|167->142|167->142|168->143|168->143|168->143|169->144|170->145|170->145|170->145|170->145|170->145|171->146|172->147|172->147|173->148|173->148|174->149
                  -- GENERATED --
              */
          