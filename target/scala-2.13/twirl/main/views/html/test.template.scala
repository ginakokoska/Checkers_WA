
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
Seq[Any](format.raw/*1.74*/("""

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
                  DATE: 2022-12-09T20:30:24.335
                  SOURCE: C:/Users/Yannick/IdeaProjects/Checkers_WA/app/views/test.scala.html
                  HASH: cd36e88cab7320ba59456430285011ffc7c28a85
                  MATRIX: 781->1|931->78|942->82|1002->73|1033->111|1063->115|1325->350|1340->356|1397->392|1792->760|1807->766|1868->806|1933->844|1948->850|2010->891|2075->929|2090->935|2151->975|2977->1871|3014->1881|3073->1913|3088->1919|3149->1959
                  LINES: 21->1|25->3|25->3|26->1|28->3|30->5|36->11|36->11|36->11|39->14|39->14|39->14|40->15|40->15|40->15|41->16|41->16|41->16|51->26|52->27|54->29|54->29|54->29
                  -- GENERATED --
              */
          