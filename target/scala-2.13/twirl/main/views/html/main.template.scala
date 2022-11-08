
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<html lang="en">
    <head>
        """),format.raw/*11.62*/("""
        """),format.raw/*12.9*/("""<title>"""),_display_(/*12.17*/title),format.raw/*12.22*/("""</title>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*13.54*/routes/*13.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.101*/("""'>
        <link rel="shortcut icon" type="image/png" href='"""),_display_(/*14.59*/routes/*14.65*/.Assets.versioned("images/favicon.png")),format.raw/*14.104*/("""'>

    </head>
    <body>
        """),format.raw/*19.32*/("""
        """),_display_(/*20.10*/content),format.raw/*20.17*/("""

      """),format.raw/*22.7*/("""<script src='"""),_display_(/*22.21*/routes/*22.27*/.Assets.versioned("javascripts/main.js")),format.raw/*22.67*/("""' type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-25T09:55:44.237
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/main.scala.html
                  HASH: 48f3e537aae34e5215be644879ea87ba1463047e
                  MATRIX: 987->260|1111->291|1138->292|1202->381|1238->390|1273->398|1299->403|1388->465|1403->471|1466->512|1554->573|1569->579|1630->618|1693->743|1730->753|1758->760|1793->768|1834->782|1849->788|1910->828
                  LINES: 26->7|31->8|32->9|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|41->19|42->20|42->20|44->22|44->22|44->22|44->22
                  -- GENERATED --
              */
          