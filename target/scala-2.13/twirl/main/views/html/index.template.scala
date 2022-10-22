
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<head>
  <style>
div """),format.raw/*6.5*/("""{"""),format.raw/*6.6*/("""text-align: center;"""),format.raw/*6.25*/("""}"""),format.raw/*6.26*/("""
"""),format.raw/*7.1*/("""</style>

  <title>Page Title</title>
</head>
<body>


<div class="vertical-center">
  <h1><p style="font-family:verdana">Welcome to Checkers</p></h1><br>
  <button onclick=window.location.href='"""),_display_(/*16.42*/routes/*16.48*/.Assets.versioned("views/instructions.scala.html")),format.raw/*16.91*/("""';"> Start Game </button><br>
  <br>
  <button onclick=window.location.href='"""),_display_(/*18.42*/routes/*18.48*/.Assets.versioned("views/instructions.scala.html")),format.raw/*18.91*/("""';"> Instructions </button> <!-- Check quotations?-->
  <br>
</div>
</body>
""")))}),format.raw/*22.2*/("""

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
                  DATE: 2022-10-22T17:05:08.411
                  SOURCE: C:/Users/petri/Desktop/Checkers_WA/app/views/index.scala.html
                  HASH: a5e710543b9db5705857170cae99ca3eecd6e5b2
                  MATRIX: 722->1|818->3|848->8|879->31|918->33|946->35|995->58|1022->59|1068->78|1096->79|1124->81|1356->286|1371->292|1435->335|1542->415|1557->421|1621->464|1732->545
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|31->6|31->6|31->6|31->6|32->7|41->16|41->16|41->16|43->18|43->18|43->18|47->22
                  -- GENERATED --
              */
          