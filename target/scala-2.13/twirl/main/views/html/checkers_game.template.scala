
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

object checkers_game extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[checkers.controller.controllerComponent.ControllerInterface,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(controller:checkers.controller.controllerComponent.ControllerInterface, message:String):play.twirl.api.HtmlFormat.Appendable = {
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
  <link rel="javascript" href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.versioned("javascripts/checkers.js")),format.raw/*14.83*/("""'>
</head>

<body>
  <script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI=" crossorigin="anonymous"></script>
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
  """),_display_(/*62.4*/for(row <- 0 until size) yield /*62.28*/ {_display_(Seq[Any](format.raw/*62.30*/("""
    """),format.raw/*63.5*/("""<div class="fieldrow"> <!--Maybe think of a different name, might not make sense?-->
      """),_display_(/*64.8*/for(col <- 0 until size) yield /*64.32*/ {_display_(Seq[Any](format.raw/*64.34*/("""

        """),format.raw/*66.9*/("""<img class="field" id="scalar"""),_display_(/*66.39*/{row*size+col}),format.raw/*66.53*/("""" src="/assets/images/white_queen.png" style="background: #00ACED"/>
      """)))}),format.raw/*67.8*/("""
  """)))}),format.raw/*68.4*/("""
    """),format.raw/*69.5*/("""</div>
  </div>
</div>






"""),format.raw/*78.32*/("""
"""),format.raw/*79.25*/("""
"""),format.raw/*80.36*/("""
"""),format.raw/*81.93*/("""
"""),format.raw/*82.38*/("""
"""),format.raw/*83.36*/("""
"""),format.raw/*84.46*/("""
"""),format.raw/*85.58*/("""
"""),format.raw/*86.87*/("""
"""),format.raw/*87.54*/("""
"""),format.raw/*88.63*/("""
"""),format.raw/*89.30*/("""
"""),format.raw/*90.29*/("""
"""),format.raw/*91.54*/("""
"""),format.raw/*92.63*/("""
"""),format.raw/*93.30*/("""
"""),format.raw/*94.22*/("""
"""),format.raw/*95.27*/("""
"""),format.raw/*96.66*/("""
"""),format.raw/*97.29*/("""
"""),format.raw/*98.28*/("""
"""),format.raw/*99.20*/("""
"""),format.raw/*100.24*/("""
"""),format.raw/*101.19*/("""
"""),format.raw/*102.104*/("""
"""),format.raw/*103.12*/("""
"""),format.raw/*104.12*/("""
"""),format.raw/*105.15*/("""
"""),format.raw/*106.59*/("""
"""),format.raw/*107.10*/("""
"""),format.raw/*108.13*/("""
"""),format.raw/*109.11*/("""







"""),format.raw/*117.1*/("""<div class="form-group">
  <label for="text-input"> </label>
  <input type="text" class="form-control" id="text-input" placeholder="Enter your move like 'XX YY'" onfocus="this.placeholder = ''" input-focus-border-color="#99999" >
  <div style="padding:20px"></div>>
  <button onclick="move()" type="button" class="btn bouncy">Enter</button>
    <p id="message-field">"""),_display_(/*122.28*/{message}),format.raw/*122.37*/(""" """),format.raw/*122.38*/("""</p>
</div>


</body>




<script>
  function openGrid(nmbr) """),format.raw/*132.27*/("""{"""),format.raw/*132.28*/("""
    """),format.raw/*133.5*/("""if (confirm("Are you sure you want to continue? Starting a new game means that current progress will be lost!")) """),format.raw/*133.118*/("""{"""),format.raw/*133.119*/("""
      """),format.raw/*134.7*/("""window.location.href="http://localhost:9000/new"+nmbr+"Grid";
    """),format.raw/*135.5*/("""}"""),format.raw/*135.6*/("""
  """),format.raw/*136.3*/("""}"""),format.raw/*136.4*/("""
  """),format.raw/*137.3*/("""function move() """),format.raw/*137.19*/("""{"""),format.raw/*137.20*/("""
    """),format.raw/*138.5*/("""let x = document.getElementById("text-input").value;
    if (x === "") """),format.raw/*139.19*/("""{"""),format.raw/*139.20*/("""
      """),format.raw/*140.7*/("""alert("Input can't be empty");
      return;
    """),format.raw/*142.5*/("""}"""),format.raw/*142.6*/("""
    """),format.raw/*143.5*/("""let start = x.split(" ")[0];
    let dest = x.split(" ")[1];
    location.href = "http://localhost:9000/move/" + start + "/" + dest;
  """),format.raw/*146.3*/("""}"""),format.raw/*146.4*/("""

"""),format.raw/*148.1*/("""</script>"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface,message:String): play.twirl.api.HtmlFormat.Appendable = apply(controller,message)

  def f:((checkers.controller.controllerComponent.ControllerInterface,String) => play.twirl.api.HtmlFormat.Appendable) = (controller,message) => apply(controller,message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-11-30T21:52:24.844
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/checkers_game.scala.html
                  HASH: 0ede7eb27c83ee5957be7f62baec79a229f0f66e
                  MATRIX: 797->1|963->92|974->96|1033->90|1061->125|1089->127|1313->324|1328->330|1385->366|1771->725|1786->731|1847->771|1909->806|1924->812|1989->856|4594->3435|4634->3459|4674->3461|4706->3466|4824->3558|4864->3582|4904->3584|4941->3594|4998->3624|5033->3638|5139->3714|5173->3718|5205->3723|5262->3783|5291->3808|5320->3844|5349->3937|5378->3975|5407->4011|5436->4057|5465->4115|5494->4202|5523->4256|5552->4319|5581->4349|5610->4378|5639->4432|5668->4495|5697->4525|5726->4547|5755->4574|5784->4640|5813->4669|5842->4697|5871->4717|5901->4741|5931->4760|5962->4864|5992->4876|6022->4888|6052->4903|6082->4962|6112->4972|6142->4985|6172->4996|6208->5004|6604->5372|6635->5381|6665->5382|6755->5443|6785->5444|6818->5449|6961->5562|6992->5563|7027->5570|7121->5636|7150->5637|7181->5640|7210->5641|7241->5644|7286->5660|7316->5661|7349->5666|7449->5737|7479->5738|7514->5745|7591->5794|7620->5795|7653->5800|7816->5935|7845->5936|7875->5938
                  LINES: 21->1|25->3|25->3|26->2|27->3|29->5|34->10|34->10|34->10|37->13|37->13|37->13|38->14|38->14|38->14|86->62|86->62|86->62|87->63|88->64|88->64|88->64|90->66|90->66|90->66|91->67|92->68|93->69|102->78|103->79|104->80|105->81|106->82|107->83|108->84|109->85|110->86|111->87|112->88|113->89|114->90|115->91|116->92|117->93|118->94|119->95|120->96|121->97|122->98|123->99|124->100|125->101|126->102|127->103|128->104|129->105|130->106|131->107|132->108|133->109|141->117|146->122|146->122|146->122|156->132|156->132|157->133|157->133|157->133|158->134|159->135|159->135|160->136|160->136|161->137|161->137|161->137|162->138|163->139|163->139|164->140|166->142|166->142|167->143|170->146|170->146|172->148
                  -- GENERATED --
              */
          