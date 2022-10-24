
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

object game extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<body>

<h1>Checkers</h1>

<form action="/action_page.php">
    <label for="TUI">Input:</label>
    <input type="text" id="TUI" name="TUI"><br><br>
    <input type="submit" value="Enter">
</form>

<p>Enter your moves to play the game.<br>
    Type "help" to get information on possible inputs.
</p>

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
                  DATE: 2022-10-22T21:22:09.738
                  SOURCE: C:/Users/petri/Desktop/Checkers_WA/app/views/test.scala.html
                  HASH: d9d591595016c2b02d88a44d7643eba77b530d62
                  MATRIX: 810->0
                  LINES: 26->1
                  -- GENERATED --
              */
          