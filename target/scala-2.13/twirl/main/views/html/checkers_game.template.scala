
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
  function openGrid(nmbr) """),format.raw/*94.27*/("""{"""),format.raw/*94.28*/("""
  """),format.raw/*95.3*/("""if (confirm("Are you sure you want to continue? Starting a new game means that current progress will be lost!")) """),format.raw/*95.116*/("""{"""),format.raw/*95.117*/("""
    """),format.raw/*96.5*/("""window.location.href="http://localhost:9000/new"+nmbr+"Grid";
  """),format.raw/*97.3*/("""}"""),format.raw/*97.4*/("""
"""),format.raw/*98.1*/("""}"""),format.raw/*98.2*/("""
"""),format.raw/*99.1*/("""</script>"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface): play.twirl.api.HtmlFormat.Appendable = apply(controller)

  def f:((checkers.controller.controllerComponent.ControllerInterface) => play.twirl.api.HtmlFormat.Appendable) = (controller) => apply(controller)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-11-15T09:46:07.862
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/checkers_game.scala.html
                  HASH: 969d5d23069a8284a60936811b5c24a6e5f203fb
                  MATRIX: 790->1|940->76|951->80|1011->74|1039->110|1067->112|1291->309|1306->315|1363->351|1749->710|1764->716|1825->756|4279->3184|4319->3208|4359->3210|4395->3219|4518->3315|4558->3339|4598->3341|4639->3355|4670->3377|4710->3379|4753->3394|4822->3436|4867->3472|4907->3474|4954->3494|5026->3557|5066->3559|5115->3580|5156->3594|5192->3609|5245->3635|5303->3672|5352->3693|5398->3721|5411->3726|5450->3727|5499->3748|5540->3762|5576->3777|5629->3803|5687->3840|5736->3861|5794->3888|5831->3907|5844->3912|5883->3913|5930->3932|5971->3946|6021->3975|6072->3999|6098->4004|6145->4023|6201->4048|6244->4063|6284->4085|6297->4090|6336->4091|6381->4108|6508->4204|6551->4216|6587->4225|6690->4298|6722->4303|6812->4365|6841->4366|6871->4369|7013->4482|7043->4483|7075->4488|7166->4552|7194->4553|7222->4554|7250->4555|7278->4556
                  LINES: 21->1|25->3|25->3|26->2|27->3|29->5|34->10|34->10|34->10|37->13|37->13|37->13|83->59|83->59|83->59|84->60|85->61|85->61|85->61|86->62|86->62|86->62|87->63|88->64|88->64|88->64|89->65|89->65|89->65|90->66|90->66|90->66|91->67|91->67|92->68|93->69|93->69|93->69|94->70|94->70|94->70|95->71|95->71|96->72|97->73|98->74|98->74|98->74|99->75|99->75|99->75|100->76|100->76|101->77|102->78|103->79|104->80|104->80|104->80|105->81|106->82|107->83|108->84|110->86|111->87|118->94|118->94|119->95|119->95|119->95|120->96|121->97|121->97|122->98|122->98|123->99
                  -- GENERATED --
              */
          