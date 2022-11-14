
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

object test extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href='"""),_display_(/*10.35*/routes/*10.41*/.Assets.versioned("stylesheets/nav.css")),format.raw/*10.81*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*11.35*/routes/*11.41*/.Assets.versioned("stylesheets/main.css")),format.raw/*11.82*/("""'>
</head>
<body>

<div class="container">
    <h2>Start Browsing Mister Checkerrrr !! </h2>
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
            <li data-target="#myCarousel" data-slide-to="3"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox" style=" width:500px; height: 500px !important;" >
            <div class="item active">
                <img src="""),_display_(/*29.27*/routes/*29.33*/.Assets.versioned("images/queen.png")),format.raw/*29.70*/(""" """),format.raw/*29.71*/("""style="width:100%;">
            </div>
            <div class="item">
                <img src="""),_display_(/*32.27*/routes/*32.33*/.Assets.versioned("images/queen.png")),format.raw/*32.70*/(""" """),format.raw/*32.71*/("""style="width:100%;">
            </div>
            <div class="item">
                <img src="""),_display_(/*35.27*/routes/*35.33*/.Assets.versioned("images/queen.png")),format.raw/*35.70*/(""" """),format.raw/*35.71*/("""style="width:100%;">
            </div>
            <div class="item">
                <img src="""),_display_(/*38.27*/routes/*38.33*/.Assets.versioned("images/queen.png")),format.raw/*38.70*/(""" """),format.raw/*38.71*/("""style="width:100%;">
            </div>
        </div>

        <!-- Left and right controls -->
        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>

</body>
</html>

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
                  DATE: 2022-11-14T14:28:48.034
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/test.scala.html
                  HASH: 68750afcabb754f688d545dde6ea5db496e64317
                  MATRIX: 810->0|1342->505|1357->511|1418->551|1482->588|1497->594|1559->635|2313->1362|2328->1368|2386->1405|2415->1406|2539->1503|2554->1509|2612->1546|2641->1547|2765->1644|2780->1650|2838->1687|2867->1688|2991->1785|3006->1791|3064->1828|3093->1829
                  LINES: 26->1|35->10|35->10|35->10|36->11|36->11|36->11|54->29|54->29|54->29|54->29|57->32|57->32|57->32|57->32|60->35|60->35|60->35|60->35|63->38|63->38|63->38|63->38
                  -- GENERATED --
              */
          