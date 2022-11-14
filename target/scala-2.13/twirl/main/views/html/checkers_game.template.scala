
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

"""),_display_(/*5.2*/main("HTWG Sudoku")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""

"""),format.raw/*7.1*/("""<html lang="en">
<head>
  <title>Checkers Game</title>
  <link rel="icon" type="image/x-icon" href='"""),_display_(/*10.47*/routes/*10.53*/.Assets.versioned("images/icon.png")),format.raw/*10.89*/("""'>
  <link rel="stylesheet" href='"""),_display_(/*11.33*/routes/*11.39*/.Assets.versioned("stylesheets/say.css")),format.raw/*11.79*/("""' />
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
  <link rel="stylesheet" href='"""),_display_(/*16.33*/routes/*16.39*/.Assets.versioned("stylesheets/nav.css")),format.raw/*16.79*/("""'>
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
      """),_display_(/*62.8*/for(row <- 0 until size) yield /*62.32*/ {_display_(Seq[Any](format.raw/*62.34*/("""
        """),format.raw/*63.9*/("""<div class="fieldrow"> <!--Maybe think of a different name, might not make sense?-->
          """),_display_(/*64.12*/for(col <- 0 until size) yield /*64.36*/ {_display_(Seq[Any](format.raw/*64.38*/("""
            """),_display_(/*65.14*/if((row+col) % 2 == 0)/*65.36*/ {_display_(Seq[Any](format.raw/*65.38*/("""
              """),format.raw/*66.15*/("""<span class="field_red">
                """),_display_(/*67.18*/if(controller.field(row, col).isSet)/*67.54*/ {_display_(Seq[Any](format.raw/*67.56*/("""
                  """),_display_(/*68.20*/if(controller.field(row, col).getPiece.get.getColor == "black")/*68.83*/ {_display_(Seq[Any](format.raw/*68.85*/("""
                    """),format.raw/*69.21*/("""<span class='"""),_display_(/*69.35*/{"piece_black"}),format.raw/*69.50*/("""'>
                      """),_display_(/*70.24*/{controller.field(row, col).toString}),format.raw/*70.61*/("""
                    """),format.raw/*71.21*/("""</span>
                  """)))}/*72.21*/else/*72.26*/{_display_(Seq[Any](format.raw/*72.27*/("""
                    """),format.raw/*73.21*/("""<span class='"""),_display_(/*73.35*/{"piece_white"}),format.raw/*73.50*/("""'>
                      """),_display_(/*74.24*/{controller.field(row, col).toString}),format.raw/*74.61*/("""
                    """),format.raw/*75.21*/("""</span>
                  """)))}),format.raw/*76.20*/("""
                """)))}/*77.19*/else/*77.24*/{_display_(Seq[Any](format.raw/*77.25*/("""
                  """),format.raw/*78.19*/("""<span class='"""),_display_(/*78.33*/{"piece_was_never_an_option"}),format.raw/*78.62*/("""'>
                    """),_display_(/*79.22*/{" "}),format.raw/*79.27*/("""
                  """),format.raw/*80.19*/("""</span>
                """)))}),format.raw/*81.18*/("""
              """),format.raw/*82.15*/("""</span>
            """)))}/*83.15*/else/*83.20*/{_display_(Seq[Any](format.raw/*83.21*/("""
                """),format.raw/*84.17*/("""<span class="field_black"></span> <!-- If the code breaks, just copy from above-->
            """)))}),format.raw/*85.14*/("""
          """)))}),format.raw/*86.12*/("""
        """),format.raw/*87.9*/("""</div>
        <div class="clear"></div> <!--idk about this...-->
      """)))}),format.raw/*89.8*/("""
    """),format.raw/*90.5*/("""</div>
  </div>
""")))}),format.raw/*92.2*/("""
"""),format.raw/*93.1*/("""</body>


<script>
  function openGrid(nmbr) """),format.raw/*97.27*/("""{"""),format.raw/*97.28*/("""
  """),format.raw/*98.3*/("""if (confirm("Are you sure you want to continue? Starting a new game means that current progress will be lost!")) """),format.raw/*98.116*/("""{"""),format.raw/*98.117*/("""
    """),format.raw/*99.5*/("""window.location.href="http://localhost:9000/new"+nmbr+"Grid";
  """),format.raw/*100.3*/("""}"""),format.raw/*100.4*/("""
"""),format.raw/*101.1*/("""}"""),format.raw/*101.2*/("""
"""),format.raw/*102.1*/("""</script>"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface): play.twirl.api.HtmlFormat.Appendable = apply(controller)

  def f:((checkers.controller.controllerComponent.ControllerInterface) => play.twirl.api.HtmlFormat.Appendable) = (controller) => apply(controller)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-11-14T13:59:05.691
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/checkers_game.scala.html
                  HASH: 90994644464f3f2751627b07aca0ff866c28abe6
                  MATRIX: 790->1|940->76|951->80|1011->74|1039->110|1067->113|1094->132|1133->134|1161->136|1289->237|1304->243|1361->279|1423->314|1438->320|1499->360|1983->817|1998->823|2059->863|4513->3291|4553->3315|4593->3317|4629->3326|4752->3422|4792->3446|4832->3448|4873->3462|4904->3484|4944->3486|4987->3501|5056->3543|5101->3579|5141->3581|5188->3601|5260->3664|5300->3666|5349->3687|5390->3701|5426->3716|5479->3742|5537->3779|5586->3800|5632->3828|5645->3833|5684->3834|5733->3855|5774->3869|5810->3884|5863->3910|5921->3947|5970->3968|6028->3995|6065->4014|6078->4019|6117->4020|6164->4039|6205->4053|6255->4082|6306->4106|6332->4111|6379->4130|6435->4155|6478->4170|6518->4192|6531->4197|6570->4198|6615->4215|6742->4311|6785->4323|6821->4332|6924->4405|6956->4410|7003->4427|7031->4428|7104->4473|7133->4474|7163->4477|7305->4590|7335->4591|7367->4596|7459->4660|7488->4661|7517->4662|7546->4663|7575->4664
                  LINES: 21->1|25->3|25->3|26->2|27->3|29->5|29->5|29->5|31->7|34->10|34->10|34->10|35->11|35->11|35->11|40->16|40->16|40->16|86->62|86->62|86->62|87->63|88->64|88->64|88->64|89->65|89->65|89->65|90->66|91->67|91->67|91->67|92->68|92->68|92->68|93->69|93->69|93->69|94->70|94->70|95->71|96->72|96->72|96->72|97->73|97->73|97->73|98->74|98->74|99->75|100->76|101->77|101->77|101->77|102->78|102->78|102->78|103->79|103->79|104->80|105->81|106->82|107->83|107->83|107->83|108->84|109->85|110->86|111->87|113->89|114->90|116->92|117->93|121->97|121->97|122->98|122->98|122->98|123->99|124->100|124->100|125->101|125->101|126->102
                  -- GENERATED --
              */
          