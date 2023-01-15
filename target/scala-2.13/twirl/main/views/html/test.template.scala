
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

object test extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[checkers.controller.controllerComponent.ControllerInterface,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(controller:checkers.controller.controllerComponent.ControllerInterface):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/size/*3.6*/ = {{controller.gameBoardSize}};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.35*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
    <title>Checkers Testpage</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/x-icon" href='"""),_display_(/*11.49*/routes/*11.55*/.Assets.versioned("images/icon.png")),format.raw/*11.91*/("""'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
    <link rel="stylesheet" href='"""),_display_(/*14.35*/routes/*14.41*/.Assets.versioned("stylesheets/nav.css")),format.raw/*14.81*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*15.35*/routes/*15.41*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.82*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*16.35*/routes/*16.41*/.Assets.versioned("stylesheets/say.css")),format.raw/*16.81*/("""'>
    <link type="text/css" rel="stylesheet" href="https://unpkg.com/bootstrap/dist/css/bootstrap.min.css"/>
    <link type="text/css" rel="stylesheet" href="https://unpkg.com/bootstrap-vue@latest/dist/bootstrap-vue.min.css"/>
    <script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/vue@3/dist/vue.global.js"></script>
    </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
        <div id="checkers">
            <gamecontainer></gamecontainer>
            """),format.raw/*26.110*/("""
        """),format.raw/*27.9*/("""</div>

        <script src='"""),_display_(/*29.23*/routes/*29.29*/.Assets.versioned("javascripts/vue2.js")),format.raw/*29.69*/("""' type="text/javascript"></script>
    </body>

</html>


"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface): play.twirl.api.HtmlFormat.Appendable = apply(controller)

  def f:((checkers.controller.controllerComponent.ControllerInterface) => play.twirl.api.HtmlFormat.Appendable) = (controller) => apply(controller)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-01-11T22:09:18.013
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/test.scala.html
                  HASH: 9297a77eb2e43dd22d6c68cf3f4a68d35413791b
                  MATRIX: 781->1|931->76|942->80|1001->74|1029->109|1057->111|1313->340|1328->346|1385->382|1777->747|1792->753|1853->793|1917->830|1932->836|1994->877|2058->914|2073->920|2134->960|2950->1846|2986->1855|3043->1885|3058->1891|3119->1931
                  LINES: 21->1|25->3|25->3|26->2|27->3|29->5|35->11|35->11|35->11|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|50->26|51->27|53->29|53->29|53->29
                  -- GENERATED --
              */
          