
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

object navbar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>


    <link rel="icon"type="image/x-icon" href=""""),_display_(/*6.48*/routes/*6.54*/.Assets.versioned("images/icon.png")),format.raw/*6.90*/("""">
    <link rel="stylesheet" href=""""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.82*/("""">
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
                    <a href=http://localhost:9000/new10Grid">10x10</a>
                </div>
            </div>
        </div>
    </div>
</div>

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
                  DATE: 2022-11-08T10:15:01.438
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/navbar.scala.html
                  HASH: c6da5e8010f65f9ee8664f84f1985936173077cc
                  MATRIX: 812->0|917->79|931->85|987->121|1050->158|1064->164|1125->205
                  LINES: 26->1|31->6|31->6|31->6|32->7|32->7|32->7
                  -- GENERATED --
              */
          