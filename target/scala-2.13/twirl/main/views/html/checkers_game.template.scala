
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

object checkers_game extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[checkers.controller.controllerComponent.ControllerInterface,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(controller:checkers.controller.controllerComponent.ControllerInterface):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/size/*3.6*/ = {{ controller.gameBoardSize }};
Seq[Any](format.raw/*1.74*/("""

"""),format.raw/*3.37*/("""

"""),_display_(/*5.2*/main("HTWG Sudoku")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
  """),format.raw/*6.3*/("""<div class="gamecontainer">
    <div class="game">
      """),_display_(/*8.8*/for(row <- 0 until size) yield /*8.32*/ {_display_(Seq[Any](format.raw/*8.34*/("""
        """),format.raw/*9.9*/("""<div class="fieldrow"> <!--Maybe think of a different name, might not make sense?-->
          """),_display_(/*10.12*/for(col <- 0 until size) yield /*10.36*/ {_display_(Seq[Any](format.raw/*10.38*/("""
            """),format.raw/*11.13*/("""<span class="field">
              <span class=""""),_display_(/*12.29*/{"piece"}),format.raw/*12.38*/(""""> <!--Using single quotes here... But watch out!-->
              """),_display_(/*13.16*/{if(controller.field(row, col).isSet) {controller.field(row, col).toString} else "_"}),format.raw/*13.101*/(""" """),format.raw/*13.102*/("""<!--Perhaps replace "_" with " ", could look cleaner-->
              </span>
            </span>
          """)))}),format.raw/*16.12*/("""
        """),format.raw/*17.9*/("""</div>
        <div class="clear"></div> <!--idk about this...-->
      """)))}),format.raw/*19.8*/("""
    """),format.raw/*20.5*/("""</div>
  </div>
""")))}))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface): play.twirl.api.HtmlFormat.Appendable = apply(controller)

  def f:((checkers.controller.controllerComponent.ControllerInterface) => play.twirl.api.HtmlFormat.Appendable) = (controller) => apply(controller)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-22T20:28:04.764
                  SOURCE: C:/Users/petri/Desktop/Checkers_WA/app/views/checkers_game.scala.html
                  HASH: bf95daeb6514788db864323f82a2347d8e694829
                  MATRIX: 790->1|940->78|951->82|1013->73|1044->113|1074->118|1101->137|1140->139|1170->143|1255->203|1294->227|1333->229|1369->239|1493->336|1533->360|1573->362|1615->376|1692->426|1722->435|1818->504|1925->589|1955->590|2098->702|2135->712|2240->787|2273->793
                  LINES: 21->1|25->3|25->3|26->1|28->3|30->5|30->5|30->5|31->6|33->8|33->8|33->8|34->9|35->10|35->10|35->10|36->11|37->12|37->12|38->13|38->13|38->13|41->16|42->17|44->19|45->20
                  -- GENERATED --
              */
          