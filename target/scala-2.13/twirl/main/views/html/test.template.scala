
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

object test extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[checkers.controller.controllerComponent.ControllerInterface,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(controller:checkers.controller.controllerComponent.ControllerInterface):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/size/*3.6*/ = {{controller.gameBoardSize}};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.35*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <title>Checkers Testpage</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/x-icon" href='"""),_display_(/*11.49*/routes/*11.55*/.Assets.versioned("images/icon.png")),format.raw/*11.91*/("""'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
    <link rel="stylesheet" href='"""),_display_(/*14.35*/routes/*14.41*/.Assets.versioned("stylesheets/nav.css")),format.raw/*14.81*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*15.35*/routes/*15.41*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.82*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*16.35*/routes/*16.41*/.Assets.versioned("stylesheets/say.css")),format.raw/*16.81*/("""'>
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<nav class="navbar navbar-dark bg-dark fixed-top">
    <div class="container-fluid">
        <a class="navbar-brand" href="http://localhost:9000/"> <i class="fa-solid fa-chess"></i> Checkers</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" color="#FF69B4">
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
    <div class="container">
        """),_display_(/*62.10*/for(row <- 0 until size) yield /*62.34*/ {_display_(Seq[Any](format.raw/*62.36*/("""
        """),_display_(/*63.10*/for(row <- 1 until size) yield /*63.34*/ {_display_(Seq[Any](format.raw/*63.36*/("""
        """),format.raw/*64.9*/("""<div class="item"> x</div>
        """)))}),format.raw/*65.10*/("""
        """)))}),format.raw/*66.10*/("""
        """),format.raw/*67.9*/("""<dic class="item-a"> a </dic>
        <dic class="item-b"> b </dic>
        <dic class="item-c"> c </dic>
        <dic class="item-d"> d </dic>
        <dic class="item-e"> e </dic>
        <dic class="item-f"> f </dic>
        <dic class="item-g"> g </dic>
        <dic class="item-h"> h </dic>

        <dic class="item-au"> a </dic>
        <dic class="item-bu"> b </dic>
        <dic class="item-cu"> c </dic>
        <dic class="item-du"> d </dic>
        <dic class="item-eu"> e </dic>
        <dic class="item-fu"> f </dic>
        <dic class="item-gu"> g </dic>
        <dic class="item-hu"> h </dic>

        <dic class="item-1"> 1 </dic>

    </div>
</div>

</body>
</html>


"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface): play.twirl.api.HtmlFormat.Appendable = apply(controller)

  def f:((checkers.controller.controllerComponent.ControllerInterface) => play.twirl.api.HtmlFormat.Appendable) = (controller) => apply(controller)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-12-06T10:48:15.456
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers-new/app/views/test.scala.html
                  HASH: f51d9c31ee5c00ada52bb7c95fbfa93890902bc0
                  MATRIX: 781->1|931->76|942->80|1001->74|1029->109|1057->111|1309->336|1324->342|1381->378|1773->743|1788->749|1849->789|1913->826|1928->832|1990->873|2054->910|2069->916|2130->956|4944->3743|4984->3767|5024->3769|5061->3779|5101->3803|5141->3805|5177->3814|5244->3850|5285->3860|5321->3869
                  LINES: 21->1|25->3|25->3|26->2|27->3|29->5|35->11|35->11|35->11|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|86->62|86->62|86->62|87->63|87->63|87->63|88->64|89->65|90->66|91->67
                  -- GENERATED --
              */
          