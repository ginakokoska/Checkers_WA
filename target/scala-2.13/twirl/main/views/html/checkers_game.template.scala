
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

def /*2.2*/size/*2.6*/ = {{ controller.gameBoardSize }};
Seq[Any](format.raw/*2.37*/("""
"""),format.raw/*3.1*/("""<html>
<head>
  <title>Checkers Game</title>
  <link rel=icon" type="image/x-icon" href=""""),_display_(/*6.46*/routes/*6.52*/.Assets.versioned("images/icon.png")),format.raw/*6.88*/("""">
  <link rel="stylesheet" href=""""),_display_(/*7.33*/routes/*7.39*/.Assets.versioned("stylesheets/say.css")),format.raw/*7.79*/("""">
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
          <a href="http://localhost:9000/new10Grid#">10x10</a>
        </div>
      </div>
    </div>
  </div>
</div>

"""),_display_(/*32.2*/main("HTWG Sudoku")/*32.21*/ {_display_(Seq[Any](format.raw/*32.23*/("""
  """),format.raw/*33.3*/("""<div class="gamecontainer">
    <div class="game">
      """),_display_(/*35.8*/for(row <- 0 until size) yield /*35.32*/ {_display_(Seq[Any](format.raw/*35.34*/("""
        """),format.raw/*36.9*/("""<div class="fieldrow"> <!--Maybe think of a different name, might not make sense?-->
          """),_display_(/*37.12*/for(col <- 0 until size) yield /*37.36*/ {_display_(Seq[Any](format.raw/*37.38*/("""
            """),_display_(/*38.14*/if((row+col) % 2 == 0)/*38.36*/ {_display_(Seq[Any](format.raw/*38.38*/("""
              """),format.raw/*39.15*/("""<span class="field_red">
                """),_display_(/*40.18*/if(controller.field(row, col).isSet)/*40.54*/ {_display_(Seq[Any](format.raw/*40.56*/("""
                  """),_display_(/*41.20*/if(controller.field(row, col).getPiece.get.getColor == "black")/*41.83*/ {_display_(Seq[Any](format.raw/*41.85*/("""
                    """),format.raw/*42.21*/("""<span class='"""),_display_(/*42.35*/{"piece_black"}),format.raw/*42.50*/("""'>
                      """),_display_(/*43.24*/{controller.field(row, col).toString}),format.raw/*43.61*/("""
                    """),format.raw/*44.21*/("""</span>
                  """)))}/*45.21*/else/*45.26*/{_display_(Seq[Any](format.raw/*45.27*/("""
                    """),format.raw/*46.21*/("""<span class='"""),_display_(/*46.35*/{"piece_white"}),format.raw/*46.50*/("""'>
                      """),_display_(/*47.24*/{controller.field(row, col).toString}),format.raw/*47.61*/("""
                    """),format.raw/*48.21*/("""</span>
                  """)))}),format.raw/*49.20*/("""
                """)))}/*50.19*/else/*50.24*/{_display_(Seq[Any](format.raw/*50.25*/("""
                  """),format.raw/*51.19*/("""<span class='"""),_display_(/*51.33*/{"piece_was_never_an_option"}),format.raw/*51.62*/("""'>
                    """),_display_(/*52.22*/{" "}),format.raw/*52.27*/("""
                  """),format.raw/*53.19*/("""</span>
                """)))}),format.raw/*54.18*/("""
              """),format.raw/*55.15*/("""</span>
            """)))}/*56.15*/else/*56.20*/{_display_(Seq[Any](format.raw/*56.21*/("""
                """),format.raw/*57.17*/("""<span class="field_black"></span> <!-- If the code breaks, just copy from above-->
            """)))}),format.raw/*58.14*/("""
          """)))}),format.raw/*59.12*/("""
        """),format.raw/*60.9*/("""</div>
        <div class="clear"></div> <!--idk about this...-->
      """)))}),format.raw/*62.8*/("""
    """),format.raw/*63.5*/("""</div>
  </div>
""")))}),format.raw/*65.2*/("""

"""),format.raw/*67.1*/("""</body>"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface): play.twirl.api.HtmlFormat.Appendable = apply(controller)

  def f:((checkers.controller.controllerComponent.ControllerInterface) => play.twirl.api.HtmlFormat.Appendable) = (controller) => apply(controller)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-25T09:16:24.242
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/checkers_game.scala.html
                  HASH: 465299d892547a126a9b5310d10c9879b05c70be
                  MATRIX: 790->1|940->75|951->79|1013->110|1040->111|1156->201|1170->207|1226->243|1287->278|1301->284|1361->324|2033->970|2061->989|2101->991|2131->994|2215->1052|2255->1076|2295->1078|2331->1087|2454->1183|2494->1207|2534->1209|2575->1223|2606->1245|2646->1247|2689->1262|2758->1304|2803->1340|2843->1342|2890->1362|2962->1425|3002->1427|3051->1448|3092->1462|3128->1477|3181->1503|3239->1540|3288->1561|3334->1589|3347->1594|3386->1595|3435->1616|3476->1630|3512->1645|3565->1671|3623->1708|3672->1729|3730->1756|3767->1775|3780->1780|3819->1781|3866->1800|3907->1814|3957->1843|4008->1867|4034->1872|4081->1891|4137->1916|4180->1931|4220->1953|4233->1958|4272->1959|4317->1976|4444->2072|4487->2084|4523->2093|4626->2166|4658->2171|4705->2188|4734->2190
                  LINES: 21->1|25->2|25->2|26->2|27->3|30->6|30->6|30->6|31->7|31->7|31->7|56->32|56->32|56->32|57->33|59->35|59->35|59->35|60->36|61->37|61->37|61->37|62->38|62->38|62->38|63->39|64->40|64->40|64->40|65->41|65->41|65->41|66->42|66->42|66->42|67->43|67->43|68->44|69->45|69->45|69->45|70->46|70->46|70->46|71->47|71->47|72->48|73->49|74->50|74->50|74->50|75->51|75->51|75->51|76->52|76->52|77->53|78->54|79->55|80->56|80->56|80->56|81->57|82->58|83->59|84->60|86->62|87->63|89->65|91->67
                  -- GENERATED --
              */
          