
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

"""),format.raw/*5.1*/("""<html lang="en">
<head>
  <title>Checkers Game</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href='"""),_display_(/*10.47*/routes/*10.53*/.Assets.versioned("images/icon.png")),format.raw/*10.89*/("""'>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
  <link rel="stylesheet" href='"""),_display_(/*13.33*/routes/*13.39*/.Assets.versioned("stylesheets/nav.css")),format.raw/*13.79*/("""'>
  <link rel="stylesheet" href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.versioned("stylesheets/say.css")),format.raw/*14.79*/("""'>
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
      """),_display_(/*60.8*/for(row <- 0 until size) yield /*60.32*/ {_display_(Seq[Any](format.raw/*60.34*/("""
        """),format.raw/*61.9*/("""<div class="fieldrow"> <!--Maybe think of a different name, might not make sense?-->
          """),_display_(/*62.12*/for(col <- 0 until size) yield /*62.36*/ {_display_(Seq[Any](format.raw/*62.38*/("""
            """),_display_(/*63.14*/if((row+col) % 2 == 0)/*63.36*/ {_display_(Seq[Any](format.raw/*63.38*/("""
              """),format.raw/*64.15*/("""<span class="field_red">
                """),_display_(/*65.18*/if(controller.field(row, col).isSet)/*65.54*/ {_display_(Seq[Any](format.raw/*65.56*/("""
                  """),_display_(/*66.20*/if(controller.field(row, col).getPiece.get.getColor == "black")/*66.83*/ {_display_(Seq[Any](format.raw/*66.85*/("""
                    """),format.raw/*67.21*/("""<span class='"""),_display_(/*67.35*/{"piece_black"}),format.raw/*67.50*/("""'>
                      """),_display_(/*68.24*/{controller.field(row, col).toString}),format.raw/*68.61*/("""
                    """),format.raw/*69.21*/("""</span>
                  """)))}/*70.21*/else/*70.26*/{_display_(Seq[Any](format.raw/*70.27*/("""
                    """),format.raw/*71.21*/("""<span class='"""),_display_(/*71.35*/{"piece_white"}),format.raw/*71.50*/("""'>
                      """),_display_(/*72.24*/{controller.field(row, col).toString}),format.raw/*72.61*/("""
                    """),format.raw/*73.21*/("""</span>
                  """)))}),format.raw/*74.20*/("""
                """)))}/*75.19*/else/*75.24*/{_display_(Seq[Any](format.raw/*75.25*/("""
                  """),format.raw/*76.19*/("""<span class='"""),_display_(/*76.33*/{"piece_was_never_an_option"}),format.raw/*76.62*/("""'>
                    """),_display_(/*77.22*/{" "}),format.raw/*77.27*/("""
                  """),format.raw/*78.19*/("""</span>
                """)))}),format.raw/*79.18*/("""
              """),format.raw/*80.15*/("""</span>
            """)))}/*81.15*/else/*81.20*/{_display_(Seq[Any](format.raw/*81.21*/("""
                """),format.raw/*82.17*/("""<span class="field_black"></span> <!-- If the code breaks, just copy from above-->
            """)))}),format.raw/*83.14*/("""
          """)))}),format.raw/*84.12*/("""
        """),format.raw/*85.9*/("""</div>
        <div class="clear"></div> <!--idk about this...-->
      """)))}),format.raw/*87.8*/("""
    """),format.raw/*88.5*/("""</div>
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
                  DATE: 2022-11-15T09:11:50.370
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/checkers_game.scala.html
                  HASH: 622bf347e1bbe5ca78e94d1709c156167e72e7e1
                  MATRIX: 790->1|940->76|951->80|1011->74|1039->110|1067->112|1291->309|1306->315|1363->351|1749->710|1764->716|1825->756|1887->791|1902->797|1963->837|4417->3265|4457->3289|4497->3291|4533->3300|4656->3396|4696->3420|4736->3422|4777->3436|4808->3458|4848->3460|4891->3475|4960->3517|5005->3553|5045->3555|5092->3575|5164->3638|5204->3640|5253->3661|5294->3675|5330->3690|5383->3716|5441->3753|5490->3774|5536->3802|5549->3807|5588->3808|5637->3829|5678->3843|5714->3858|5767->3884|5825->3921|5874->3942|5932->3969|5969->3988|5982->3993|6021->3994|6068->4013|6109->4027|6159->4056|6210->4080|6236->4085|6283->4104|6339->4129|6382->4144|6422->4166|6435->4171|6474->4172|6519->4189|6646->4285|6689->4297|6725->4306|6828->4379|6860->4384|6950->4446|6979->4447|7009->4450|7151->4563|7181->4564|7213->4569|7304->4633|7332->4634|7360->4635|7388->4636|7417->4637
                  LINES: 21->1|25->3|25->3|26->2|27->3|29->5|34->10|34->10|34->10|37->13|37->13|37->13|38->14|38->14|38->14|84->60|84->60|84->60|85->61|86->62|86->62|86->62|87->63|87->63|87->63|88->64|89->65|89->65|89->65|90->66|90->66|90->66|91->67|91->67|91->67|92->68|92->68|93->69|94->70|94->70|94->70|95->71|95->71|95->71|96->72|96->72|97->73|98->74|99->75|99->75|99->75|100->76|100->76|100->76|101->77|101->77|102->78|103->79|104->80|105->81|105->81|105->81|106->82|107->83|108->84|109->85|111->87|112->88|119->95|119->95|120->96|120->96|120->96|121->97|122->98|122->98|123->99|123->99|124->100
                  -- GENERATED --
              */
          