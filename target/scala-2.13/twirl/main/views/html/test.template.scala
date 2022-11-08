
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

object test extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
    <script src='"""),_display_(/*4.19*/routes/*4.25*/.Assets.versioned("javascripts/input.js")),format.raw/*4.66*/("""' type="text/javascript"></script>
</head>
<body>

<h1>Checkers</h1>

<form name="input">
    <label for="userInput">Input:</label>
    <input type="text" id="userInput" name="userInput"><br><br>
    <input type="button" onclick="getInput()" value="Enter">
</form>

<p>Enter your moves to play the game.<br>
    Type "help" to get information on possible inputs.
</p>

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
                  DATE: 2022-10-25T09:55:44.244
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/test.scala.html
                  HASH: 5fb4a806d5ae7f95f4c9b68f65109b632cb0f2e2
                  MATRIX: 810->0|884->48|898->54|959->95
                  LINES: 26->1|29->4|29->4|29->4
                  -- GENERATED --
              */
          