
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


Seq[Any](format.raw/*7.32*/("""

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
                  DATE: 2022-10-24T22:32:12.074
                  SOURCE: C:/Users/petri/Desktop/Checkers_WA/app/views/main.scala.html
                  HASH: 0eb7545bca7b0acee51ef1555d5f962d49c5327c
                  MATRIX: 992->266|1117->296|1147->300|1213->391|1250->401|1285->409|1311->414|1401->477|1416->483|1479->524|1568->586|1583->592|1644->631|1711->761|1749->772|1777->779|1814->789|1855->803|1870->809|1931->849
                  LINES: 26->7|31->7|33->9|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|42->19|43->20|43->20|45->22|45->22|45->22|45->22
                  -- GENERATED --
              */
          