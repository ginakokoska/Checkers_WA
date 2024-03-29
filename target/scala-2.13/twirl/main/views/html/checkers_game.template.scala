
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

object checkers_game extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[checkers.controller.controllerComponent.ControllerInterface,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(controller:checkers.controller.controllerComponent.ControllerInterface, message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/size/*3.6*/ = {{controller.gameBoardSize}};def /*4.2*/color/*4.7*/ = {{"#000000"}};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.35*/("""
"""),format.raw/*4.21*/("""

"""),format.raw/*6.1*/("""<html lang="en">
<head>
  <title>Checkers Game</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href='"""),_display_(/*11.47*/routes/*11.53*/.Assets.versioned("images/icon.png")),format.raw/*11.89*/("""'>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  <link rel="stylesheet" href='"""),_display_(/*13.33*/routes/*13.39*/.Assets.versioned("stylesheets/say.css")),format.raw/*13.79*/("""'>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
  <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
  <script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/vue@next"></script>

</head>
  <body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
    <div id="checkers">
      <navbar></navbar>
      <gamecontainer></gamecontainer>
      <form-group></form-group>
    </div>
    <script src='"""),_display_(/*29.19*/routes/*29.25*/.Assets.versioned("javascripts/checkers_vue.js")),format.raw/*29.73*/("""' type="text/javascript"></script>
  </body>




"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface,message:String): play.twirl.api.HtmlFormat.Appendable = apply(controller,message)

  def f:((checkers.controller.controllerComponent.ControllerInterface,String) => play.twirl.api.HtmlFormat.Appendable) = (controller,message) => apply(controller,message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-01-15T20:10:51.397
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/checkers_game.scala.html
                  HASH: 6f49571150280302aa3ecba686b3bf0dd4d4b239
                  MATRIX: 797->1|963->92|974->96|1017->127|1029->132|1073->90|1101->125|1129->146|1157->148|1381->345|1396->351|1453->387|1732->639|1747->645|1808->685|3002->1853|3017->1859|3086->1907
                  LINES: 21->1|25->3|25->3|25->4|25->4|26->2|27->3|28->4|30->6|35->11|35->11|35->11|37->13|37->13|37->13|53->29|53->29|53->29
                  -- GENERATED --
              */
          