
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


Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html lang="en">
<head>
  <title>Checkers Home</title>
  <meta charset="utf-8">
  <link rel="icon" type="image/x-icon" href='"""),_display_(/*6.47*/routes/*6.53*/.Assets.versioned("images/icon.png")),format.raw/*6.89*/("""'>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
  <link rel="stylesheet" href='"""),_display_(/*11.33*/routes/*11.39*/.Assets.versioned("stylesheets/nav.css")),format.raw/*11.79*/("""'>
  <link rel="stylesheet" href='"""),_display_(/*12.33*/routes/*12.39*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.80*/("""'>

</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<nav class="navbar navbar-dark bg-dark fixed-top">
  <div class="container-fluid">
    <a class="navbar-brand" href="http://localhost:9000/"> <i class="fa-solid fa-chess"></i> Checkers</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
      <div class="offcanvas-header">
        <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Checkers Menu</h5>
        <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
      </div>
      <div class="offcanvas-body">
        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
          <li class="nav-item">
            <a class="nav-link"  aria-current="page" href="http://localhost:9000/"> <i class="fa-solid fa-igloo"></i> Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="https://github.com/ginakokoska/Checkers_WA"> <i class="fa-brands fa-github-alt"></i> GitHub</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              <i class="fa-solid fa-chess-board"></i> Boardsize
            </a>
            <ul class="dropdown-menu dropdown-menu-dark">
              <li><a class="dropdown-item" href="http://localhost:9000/new8Grid"> <i class="fa-solid fa-chess-queen"></i> 8x8</a></li>
              <li><a class="dropdown-item" href="http://localhost:9000/new10Grid"> <i class="fa-regular fa-chess-queen"></i> 10x10</a></li>
              <li>
                <hr class="dropdown-divider">
              </li>
              <li><a class="dropdown-item" href="http://localhost:9000/instructions"> <i class="fa-solid fa-clipboard-list"></i> User Manual</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
  </div>
</nav>


<div style="padding:100px">
  <h3>Welcome to Checkers</h3>

  <div class="container" align="center">
    <h2>Start Browsing Mister Checkerrrr !! </h2>
    <div id="carouselExampleFade" class="carousel slide carousel-fade" data-bs-ride="carousel">
      <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3" aria-label="Slide 3"></button>
      </div>

      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="""),_display_(/*71.21*/routes/*71.27*/.Assets.versioned("images/Startpoint.png")),format.raw/*71.69*/(""" """),format.raw/*71.70*/("""class="d-block w-100">
        </div>
        <div class="carousel-item">
          <img src="""),_display_(/*74.21*/routes/*74.27*/.Assets.versioned("images/movediag.png")),format.raw/*74.67*/(""" """),format.raw/*74.68*/("""class="d-block w-100">
        </div>
        <div class="carousel-item">
          <img src="""),_display_(/*77.21*/routes/*77.27*/.Assets.versioned("images/capture.png")),format.raw/*77.66*/(""" """),format.raw/*77.67*/("""class="d-block w-100">
        </div>
        <div class="carousel-item">
          <img src="""),_display_(/*80.21*/routes/*80.27*/.Assets.versioned("images/queen.png")),format.raw/*80.64*/(""" """),format.raw/*80.65*/("""class="d-block w-100">
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
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
                  DATE: 2022-11-14T14:25:38.076
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/home.scala.html
                  HASH: 009748b2d2efd20e282bba3cd232b705f72fd880
                  MATRIX: 810->0|983->147|997->153|1053->189|1540->649|1555->655|1616->695|1679->731|1694->737|1756->778|5160->4155|5175->4161|5238->4203|5267->4204|5391->4301|5406->4307|5467->4347|5496->4348|5620->4445|5635->4451|5695->4490|5724->4491|5848->4588|5863->4594|5921->4631|5950->4632
                  LINES: 26->1|31->6|31->6|31->6|36->11|36->11|36->11|37->12|37->12|37->12|96->71|96->71|96->71|96->71|99->74|99->74|99->74|99->74|102->77|102->77|102->77|102->77|105->80|105->80|105->80|105->80
                  -- GENERATED --
              */
          