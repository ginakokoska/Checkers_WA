
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
  <title>Checkers Home</title>
  <link rel="icon" type="image/x-icon" href='"""),_display_(/*5.47*/routes/*5.53*/.Assets.versioned("images/icon.png")),format.raw/*5.89*/("""'>
  <link rel="stylesheet" href='"""),_display_(/*6.33*/routes/*6.39*/.Assets.versioned("stylesheets/main.css")),format.raw/*6.80*/("""'>
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

<div style="padding:16px">
  <h3>Welcome to Checkers</h3>
  <p>Start browsing, mister checkerrrr ! </p>

  <div class="slideshow-container">

    <div class="mySlides fade">
      <div class="numbertext">1 / 4</div>
      <img src="""),_display_(/*38.17*/routes/*38.23*/.Assets.versioned("images/Startpoint.png")),format.raw/*38.65*/(""" """),format.raw/*38.66*/("""style="width:100%">
      <div class="text">Starting Point of Game</div>
    </div>

    <div class="mySlides fade">
      <div class="numbertext">2 / 4</div>
      <img src="""),_display_(/*44.17*/routes/*44.23*/.Assets.versioned("images/movediag.png")),format.raw/*44.63*/(""" """),format.raw/*44.64*/("""style="width:100%">
      <div class="text">Moving diagonally</div>
    </div>

    <div class="mySlides fade">
      <div class="numbertext">3 / 4</div>
      <img src="""),_display_(/*50.17*/routes/*50.23*/.Assets.versioned("images/capture.png")),format.raw/*50.62*/(""" """),format.raw/*50.63*/("""style="width:100%">
      <div class="text">Capturing an Opponent's Stone</div>
    </div>

    <div class="mySlides fade">
      <div class="numbertext">4 / 4</div>
      <img src="""),_display_(/*56.17*/routes/*56.23*/.Assets.versioned("images/queen.png")),format.raw/*56.60*/(""" """),format.raw/*56.61*/("""style="width:100%">
      <div class="text">Becoming a King </div>
    </div>

    <a class="prev" onclick="plusSlides(-1)">❮</a>
    <a class="next" onclick="plusSlides(1)">❯</a>

  </div>
  <br>

  <div style="text-align:center">
    <span class="dot" onclick="currentSlide(1)"></span>
    <span class="dot" onclick="currentSlide(2)"></span>
    <span class="dot" onclick="currentSlide(3)"></span>
    <span class="dot" onclick="currentSlide(4)"></span>
  </div>

  <script>
let slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) """),format.raw/*77.24*/("""{"""),format.raw/*77.25*/("""
  """),format.raw/*78.3*/("""showSlides(slideIndex += n);
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""

"""),format.raw/*81.1*/("""function currentSlide(n) """),format.raw/*81.26*/("""{"""),format.raw/*81.27*/("""
  """),format.raw/*82.3*/("""showSlides(slideIndex = n);
"""),format.raw/*83.1*/("""}"""),format.raw/*83.2*/("""

"""),format.raw/*85.1*/("""function showSlides(n) """),format.raw/*85.24*/("""{"""),format.raw/*85.25*/("""
  """),format.raw/*86.3*/("""let i;
  let slides = document.getElementsByClassName("mySlides");
  let dots = document.getElementsByClassName("dot");
  if (n > slides.length) """),format.raw/*89.26*/("""{"""),format.raw/*89.27*/("""slideIndex = 1"""),format.raw/*89.41*/("""}"""),format.raw/*89.42*/("""
  """),format.raw/*90.3*/("""if (n < 1) """),format.raw/*90.14*/("""{"""),format.raw/*90.15*/("""slideIndex = slides.length"""),format.raw/*90.41*/("""}"""),format.raw/*90.42*/("""
  """),format.raw/*91.3*/("""for (i = 0; i < slides.length; i++) """),format.raw/*91.39*/("""{"""),format.raw/*91.40*/("""
    """),format.raw/*92.5*/("""slides[i].style.display = "none";
  """),format.raw/*93.3*/("""}"""),format.raw/*93.4*/("""
  """),format.raw/*94.3*/("""for (i = 0; i < dots.length; i++) """),format.raw/*94.37*/("""{"""),format.raw/*94.38*/("""
    """),format.raw/*95.5*/("""dots[i].className = dots[i].className.replace(" active", "");
  """),format.raw/*96.3*/("""}"""),format.raw/*96.4*/("""
  """),format.raw/*97.3*/("""slides[slideIndex-1].style.display = "block";
  dots[slideIndex-1].className += " active";
"""),format.raw/*99.1*/("""}"""),format.raw/*99.2*/("""
"""),format.raw/*100.1*/("""</script>
</div>

</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-11-08T10:15:01.426
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/home.scala.html
                  HASH: cfb353f00a9816a6e451c7d518615d466b1ae10e
                  MATRIX: 810->0|947->111|961->117|1017->153|1079->189|1093->195|1154->236|2088->1143|2103->1149|2166->1191|2195->1192|2403->1373|2418->1379|2479->1419|2508->1420|2711->1596|2726->1602|2786->1641|2815->1642|3030->1830|3045->1836|3103->1873|3132->1874|3726->2440|3755->2441|3786->2445|3843->2475|3871->2476|3902->2480|3955->2505|3984->2506|4015->2510|4071->2539|4099->2540|4130->2544|4181->2567|4210->2568|4241->2572|4417->2720|4446->2721|4488->2735|4517->2736|4548->2740|4587->2751|4616->2752|4670->2778|4699->2779|4730->2783|4794->2819|4823->2820|4856->2826|4920->2863|4948->2864|4979->2868|5041->2902|5070->2903|5103->2909|5195->2974|5223->2975|5254->2979|5374->3072|5402->3073|5432->3075
                  LINES: 26->1|30->5|30->5|30->5|31->6|31->6|31->6|63->38|63->38|63->38|63->38|69->44|69->44|69->44|69->44|75->50|75->50|75->50|75->50|81->56|81->56|81->56|81->56|102->77|102->77|103->78|104->79|104->79|106->81|106->81|106->81|107->82|108->83|108->83|110->85|110->85|110->85|111->86|114->89|114->89|114->89|114->89|115->90|115->90|115->90|115->90|115->90|116->91|116->91|116->91|117->92|118->93|118->93|119->94|119->94|119->94|120->95|121->96|121->96|122->97|124->99|124->99|125->100
                  -- GENERATED --
              */
          