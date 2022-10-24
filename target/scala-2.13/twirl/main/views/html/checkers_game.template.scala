
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

"""),format.raw/*7.1*/("""<link rel="stylesheet" href='"""),_display_(/*7.31*/routes/*7.37*/.Assets.versioned("stylesheets/say.css")),format.raw/*7.77*/("""' />
  <div class="gamecontainer">
    <div class="game">
      """),_display_(/*10.8*/for(row <- 0 until size) yield /*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""
        """),format.raw/*11.9*/("""<div class="fieldrow"> <!--Maybe think of a different name, might not make sense?-->
          """),_display_(/*12.12*/for(col <- 0 until size) yield /*12.36*/ {_display_(Seq[Any](format.raw/*12.38*/("""
            """),_display_(/*13.14*/if((row+col) % 2 == 0)/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
              """),format.raw/*14.15*/("""<span class="field_red">
                """),_display_(/*15.18*/if(controller.field(row, col).isSet)/*15.54*/ {_display_(Seq[Any](format.raw/*15.56*/("""
                  """),_display_(/*16.20*/if(controller.field(row, col).getPiece.get.getColor == "black")/*16.83*/ {_display_(Seq[Any](format.raw/*16.85*/("""
                    """),format.raw/*17.21*/("""<span class='"""),_display_(/*17.35*/{"piece_black"}),format.raw/*17.50*/("""'>
                      """),_display_(/*18.24*/{controller.field(row, col).toString}),format.raw/*18.61*/("""
                    """),format.raw/*19.21*/("""</span>
                  """)))}/*20.21*/else/*20.26*/{_display_(Seq[Any](format.raw/*20.27*/("""
                    """),format.raw/*21.21*/("""<span class='"""),_display_(/*21.35*/{"piece_white"}),format.raw/*21.50*/("""'>
                      """),_display_(/*22.24*/{controller.field(row, col).toString}),format.raw/*22.61*/("""
                    """),format.raw/*23.21*/("""</span>
                  """)))}),format.raw/*24.20*/("""
                """)))}/*25.19*/else/*25.24*/{_display_(Seq[Any](format.raw/*25.25*/("""
                  """),format.raw/*26.19*/("""<span class='"""),_display_(/*26.33*/{"piece_was_never_an_option"}),format.raw/*26.62*/("""'>
                    """),_display_(/*27.22*/{" "}),format.raw/*27.27*/("""
                  """),format.raw/*28.19*/("""</span>
                """)))}),format.raw/*29.18*/("""
              """),format.raw/*30.15*/("""</span>
            """)))}/*31.15*/else/*31.20*/{_display_(Seq[Any](format.raw/*31.21*/("""
                """),format.raw/*32.17*/("""<span class="field_black"></span> <!-- If the code breaks, just copy from above-->
            """)))}),format.raw/*33.14*/("""
          """)))}),format.raw/*34.12*/("""
        """),format.raw/*35.9*/("""</div>
        <div class="clear"></div> <!--idk about this...-->
      """)))}),format.raw/*37.8*/("""
    """),format.raw/*38.5*/("""</div>
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
                  DATE: 2022-10-24T21:12:58.035
                  SOURCE: C:/Users/petri/Desktop/Checkers_WA/app/views/checkers_game.scala.html
                  HASH: b835c8572977308f462817d6101e5d3f2e28a956
                  MATRIX: 790->1|940->78|951->82|1013->73|1044->113|1074->118|1101->137|1140->139|1170->143|1226->173|1240->179|1300->219|1394->287|1434->311|1474->313|1511->323|1635->420|1675->444|1715->446|1757->461|1788->483|1828->485|1872->501|1942->544|1987->580|2027->582|2075->603|2147->666|2187->668|2237->690|2278->704|2314->719|2368->746|2426->783|2476->805|2523->834|2536->839|2575->840|2625->862|2666->876|2702->891|2756->918|2814->955|2864->977|2923->1005|2961->1025|2974->1030|3013->1031|3061->1051|3102->1065|3152->1094|3204->1119|3230->1124|3278->1144|3335->1170|3379->1186|3420->1209|3433->1214|3472->1215|3518->1233|3646->1330|3690->1343|3727->1353|3832->1428|3865->1434
                  LINES: 21->1|25->3|25->3|26->1|28->3|30->5|30->5|30->5|32->7|32->7|32->7|32->7|35->10|35->10|35->10|36->11|37->12|37->12|37->12|38->13|38->13|38->13|39->14|40->15|40->15|40->15|41->16|41->16|41->16|42->17|42->17|42->17|43->18|43->18|44->19|45->20|45->20|45->20|46->21|46->21|46->21|47->22|47->22|48->23|49->24|50->25|50->25|50->25|51->26|51->26|51->26|52->27|52->27|53->28|54->29|55->30|56->31|56->31|56->31|57->32|58->33|59->34|60->35|62->37|63->38
                  -- GENERATED --
              */
          