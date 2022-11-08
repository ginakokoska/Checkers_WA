
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

def /*3.2*/size/*3.6*/ = {{controller.gameBoardSize }};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.36*/("""

"""),_display_(/*5.2*/main("HTWG Sudoku")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
"""),format.raw/*6.1*/("""<head>
  <title>Checkers Game</title>
  <link rel="icon" type="image/x-icon" href='"""),_display_(/*8.47*/routes/*8.53*/.Assets.versioned("images/icon.png")),format.raw/*8.89*/("""'>
  <link rel="stylesheet" href='"""),_display_(/*9.33*/routes/*9.39*/.Assets.versioned("stylesheets/say.css")),format.raw/*9.79*/("""' />
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


  <div class="gamecontainer">
    <div class="game">
      """),_display_(/*38.8*/for(row <- 0 until size) yield /*38.32*/ {_display_(Seq[Any](format.raw/*38.34*/("""
        """),format.raw/*39.9*/("""<div class="fieldrow"> <!--Maybe think of a different name, might not make sense?-->
          """),_display_(/*40.12*/for(col <- 0 until size) yield /*40.36*/ {_display_(Seq[Any](format.raw/*40.38*/("""
            """),_display_(/*41.14*/if((row+col) % 2 == 0)/*41.36*/ {_display_(Seq[Any](format.raw/*41.38*/("""
              """),format.raw/*42.15*/("""<span class="field_red">
                """),_display_(/*43.18*/if(controller.field(row, col).isSet)/*43.54*/ {_display_(Seq[Any](format.raw/*43.56*/("""
                  """),_display_(/*44.20*/if(controller.field(row, col).getPiece.get.getColor == "black")/*44.83*/ {_display_(Seq[Any](format.raw/*44.85*/("""
                    """),format.raw/*45.21*/("""<span class='"""),_display_(/*45.35*/{"piece_black"}),format.raw/*45.50*/("""'>
                      """),_display_(/*46.24*/{controller.field(row, col).toString}),format.raw/*46.61*/("""
                    """),format.raw/*47.21*/("""</span>
                  """)))}/*48.21*/else/*48.26*/{_display_(Seq[Any](format.raw/*48.27*/("""
                    """),format.raw/*49.21*/("""<span class='"""),_display_(/*49.35*/{"piece_white"}),format.raw/*49.50*/("""'>
                      """),_display_(/*50.24*/{controller.field(row, col).toString}),format.raw/*50.61*/("""
                    """),format.raw/*51.21*/("""</span>
                  """)))}),format.raw/*52.20*/("""
                """)))}/*53.19*/else/*53.24*/{_display_(Seq[Any](format.raw/*53.25*/("""
                  """),format.raw/*54.19*/("""<span class='"""),_display_(/*54.33*/{"piece_was_never_an_option"}),format.raw/*54.62*/("""'>
                    """),_display_(/*55.22*/{" "}),format.raw/*55.27*/("""
                  """),format.raw/*56.19*/("""</span>
                """)))}),format.raw/*57.18*/("""
              """),format.raw/*58.15*/("""</span>
            """)))}/*59.15*/else/*59.20*/{_display_(Seq[Any](format.raw/*59.21*/("""
                """),format.raw/*60.17*/("""<span class="field_black"></span> <!-- If the code breaks, just copy from above-->
            """)))}),format.raw/*61.14*/("""
          """)))}),format.raw/*62.12*/("""
        """),format.raw/*63.9*/("""</div>
        <div class="clear"></div> <!--idk about this...-->
      """)))}),format.raw/*65.8*/("""
    """),format.raw/*66.5*/("""</div>
  </div>
""")))}),format.raw/*68.2*/("""
"""),format.raw/*69.1*/("""</body>"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface): play.twirl.api.HtmlFormat.Appendable = apply(controller)

  def f:((checkers.controller.controllerComponent.ControllerInterface) => play.twirl.api.HtmlFormat.Appendable) = (controller) => apply(controller)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-25T10:30:25.738
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/checkers_game.scala.html
                  HASH: 986f9cfeade87a49ba9d42f3e32d53417668e78f
                  MATRIX: 790->1|940->76|951->80|1011->74|1039->110|1067->113|1094->132|1133->134|1160->135|1270->219|1284->225|1340->261|1401->296|1415->302|1475->342|2209->1050|2249->1074|2289->1076|2325->1085|2448->1181|2488->1205|2528->1207|2569->1221|2600->1243|2640->1245|2683->1260|2752->1302|2797->1338|2837->1340|2884->1360|2956->1423|2996->1425|3045->1446|3086->1460|3122->1475|3175->1501|3233->1538|3282->1559|3328->1587|3341->1592|3380->1593|3429->1614|3470->1628|3506->1643|3559->1669|3617->1706|3666->1727|3724->1754|3761->1773|3774->1778|3813->1779|3860->1798|3901->1812|3951->1841|4002->1865|4028->1870|4075->1889|4131->1914|4174->1929|4214->1951|4227->1956|4266->1957|4311->1974|4438->2070|4481->2082|4517->2091|4620->2164|4652->2169|4699->2186|4727->2187
                  LINES: 21->1|25->3|25->3|26->2|27->3|29->5|29->5|29->5|30->6|32->8|32->8|32->8|33->9|33->9|33->9|62->38|62->38|62->38|63->39|64->40|64->40|64->40|65->41|65->41|65->41|66->42|67->43|67->43|67->43|68->44|68->44|68->44|69->45|69->45|69->45|70->46|70->46|71->47|72->48|72->48|72->48|73->49|73->49|73->49|74->50|74->50|75->51|76->52|77->53|77->53|77->53|78->54|78->54|78->54|79->55|79->55|80->56|81->57|82->58|83->59|83->59|83->59|84->60|85->61|86->62|87->63|89->65|90->66|92->68|93->69
                  -- GENERATED --
              */
          