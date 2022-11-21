
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

def /*3.2*/size/*3.6*/ = {{controller.gameBoardSize}};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.35*/("""

"""),format.raw/*5.1*/("""<html lang="en">
<head>
  <title>Checkers Game</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href='"""),_display_(/*10.47*/routes/*10.53*/.Assets.versioned("images/icon.png")),format.raw/*10.89*/("""'>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
  <link rel="stylesheet" href='"""),_display_(/*13.33*/routes/*13.39*/.Assets.versioned("stylesheets/say.css")),format.raw/*13.79*/("""'>
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
            <a class="nav-link active"  aria-current="page" href="http://localhost:9000/"> <i class="fa-solid fa-igloo"></i> Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="https://github.com/ginakokoska/Checkers_WA"> <i class="fa-brands fa-github-alt"></i> GitHub</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              <i class="fa-solid fa-chess-board"></i> Boardsize
            </a>
            <ul class="dropdown-menu dropdown-menu-dark">
              <li><a class="dropdown-item "  onclick="openGrid(8)"> <i class="fa-solid fa-chess-queen"></i> 8x8</a></li>
              <li><a class="dropdown-item "  onclick="openGrid(10)"> <i class="fa-regular  fa-chess-queen"></i> 10x10</a></li>
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


  <div class="gamecontainer">
    <div class="game">
      """),_display_(/*59.8*/for(row <- 0 until size) yield /*59.32*/ {_display_(Seq[Any](format.raw/*59.34*/("""
        """),format.raw/*60.9*/("""<div class="fieldrow"> <!--Maybe think of a different name, might not make sense?-->
          """),_display_(/*61.12*/for(col <- 0 until size) yield /*61.36*/ {_display_(Seq[Any](format.raw/*61.38*/("""
            """),_display_(/*62.14*/if((row+col) % 2 == 0)/*62.36*/ {_display_(Seq[Any](format.raw/*62.38*/("""
              """),format.raw/*63.15*/("""<span class="field_red">
                """),_display_(/*64.18*/if(controller.field(row, col).isSet)/*64.54*/ {_display_(Seq[Any](format.raw/*64.56*/("""
                  """),_display_(/*65.20*/if(controller.field(row, col).getPiece.get.getColor == "black")/*65.83*/ {_display_(Seq[Any](format.raw/*65.85*/("""
                    """),format.raw/*66.21*/("""<span class='"""),_display_(/*66.35*/{"piece_black"}),format.raw/*66.50*/("""'>
                      """),_display_(/*67.24*/{controller.field(row, col).toString}),format.raw/*67.61*/("""
                    """),format.raw/*68.21*/("""</span>
                  """)))}/*69.21*/else/*69.26*/{_display_(Seq[Any](format.raw/*69.27*/("""
                    """),format.raw/*70.21*/("""<span class='"""),_display_(/*70.35*/{"piece_white"}),format.raw/*70.50*/("""'>
                      """),_display_(/*71.24*/{controller.field(row, col).toString}),format.raw/*71.61*/("""
                    """),format.raw/*72.21*/("""</span>
                  """)))}),format.raw/*73.20*/("""
                """)))}/*74.19*/else/*74.24*/{_display_(Seq[Any](format.raw/*74.25*/("""
                  """),format.raw/*75.19*/("""<span class='"""),_display_(/*75.33*/{"piece_was_never_an_option"}),format.raw/*75.62*/("""'>
                    """),_display_(/*76.22*/{" "}),format.raw/*76.27*/("""
                  """),format.raw/*77.19*/("""</span>
                """)))}),format.raw/*78.18*/("""
              """),format.raw/*79.15*/("""</span>
            """)))}/*80.15*/else/*80.20*/{_display_(Seq[Any](format.raw/*80.21*/("""
                """),format.raw/*81.17*/("""<span class="field_black"></span> <!-- If the code breaks, just copy from above-->
            """)))}),format.raw/*82.14*/("""
          """)))}),format.raw/*83.12*/("""
        """),format.raw/*84.9*/("""</div>
        <div class="clear"></div> <!--idk about this...-->
      """)))}),format.raw/*86.8*/("""
    """),format.raw/*87.5*/("""</div>
  </div>


</body>


<script>
  function openGrid(nmbr) """),format.raw/*95.27*/("""{"""),format.raw/*95.28*/("""
  """),format.raw/*96.3*/("""if (confirm("Are you sure you want to continue? Starting a new game means that current progress will be lost!")) """),format.raw/*96.116*/("""{"""),format.raw/*96.117*/("""
    """),format.raw/*97.5*/("""window.location.href="http://localhost:9000/new"+nmbr+"Grid";
  """),format.raw/*98.3*/("""}"""),format.raw/*98.4*/("""
"""),format.raw/*99.1*/("""}"""),format.raw/*99.2*/("""
"""),format.raw/*100.1*/("""</script>"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface): play.twirl.api.HtmlFormat.Appendable = apply(controller)

  def f:((checkers.controller.controllerComponent.ControllerInterface) => play.twirl.api.HtmlFormat.Appendable) = (controller) => apply(controller)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-11-21T09:45:09.614
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/checkers_game.scala.html
                  HASH: f2f7b594a59ec48acff38782a968ca6dc12337fe
                  MATRIX: 790->1|940->76|951->80|1010->74|1038->109|1066->111|1290->308|1305->314|1362->350|1748->709|1763->715|1824->755|4278->3183|4318->3207|4358->3209|4394->3218|4517->3314|4557->3338|4597->3340|4638->3354|4669->3376|4709->3378|4752->3393|4821->3435|4866->3471|4906->3473|4953->3493|5025->3556|5065->3558|5114->3579|5155->3593|5191->3608|5244->3634|5302->3671|5351->3692|5397->3720|5410->3725|5449->3726|5498->3747|5539->3761|5575->3776|5628->3802|5686->3839|5735->3860|5793->3887|5830->3906|5843->3911|5882->3912|5929->3931|5970->3945|6020->3974|6071->3998|6097->4003|6144->4022|6200->4047|6243->4062|6283->4084|6296->4089|6335->4090|6380->4107|6507->4203|6550->4215|6586->4224|6689->4297|6721->4302|6812->4365|6841->4366|6871->4369|7013->4482|7043->4483|7075->4488|7166->4552|7194->4553|7222->4554|7250->4555|7279->4556
                  LINES: 21->1|25->3|25->3|26->2|27->3|29->5|34->10|34->10|34->10|37->13|37->13|37->13|83->59|83->59|83->59|84->60|85->61|85->61|85->61|86->62|86->62|86->62|87->63|88->64|88->64|88->64|89->65|89->65|89->65|90->66|90->66|90->66|91->67|91->67|92->68|93->69|93->69|93->69|94->70|94->70|94->70|95->71|95->71|96->72|97->73|98->74|98->74|98->74|99->75|99->75|99->75|100->76|100->76|101->77|102->78|103->79|104->80|104->80|104->80|105->81|106->82|107->83|108->84|110->86|111->87|119->95|119->95|120->96|120->96|120->96|121->97|122->98|122->98|123->99|123->99|124->100
                  -- GENERATED --
              */
          