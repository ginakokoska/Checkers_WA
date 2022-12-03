
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

def /*3.2*/size/*3.6*/ = {{controller.gameBoardSize}};def /*4.2*/color/*4.7*/ = {{"#000000"}};
Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*3.35*/("""
"""),format.raw/*4.21*/("""

"""),format.raw/*6.1*/("""<html lang="en">
<head>
  <title>Checkers Game</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
  <link rel="icon" type="image/x-icon" href='"""),_display_(/*14.47*/routes/*14.53*/.Assets.versioned("images/icon.png")),format.raw/*14.89*/("""'>
  <link rel="stylesheet" href='"""),_display_(/*15.33*/routes/*15.39*/.Assets.versioned("stylesheets/say.css")),format.raw/*15.79*/("""'>
  <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
  <script src='"""),_display_(/*17.17*/routes/*17.23*/.Assets.versioned("javascripts/checkers.js")),format.raw/*17.67*/("""' type="text/javascript"></script>
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
              <li><a class="dropdown-item "  onclick="newBoard(8)"> <i class="fa-solid fa-chess-queen"></i> 8x8</a></li>
              <li><a class="dropdown-item "  onclick="newBoard(10)"> <i class="fa-regular  fa-chess-queen"></i> 10x10</a></li>
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


  """),format.raw/*61.119*/("""
"""),format.raw/*62.1*/("""<div class="gamecontainer">
  <div class="game">
  """),_display_(/*64.4*/for(row <- 0 until size) yield /*64.28*/ {_display_(Seq[Any](format.raw/*64.30*/("""
    """),format.raw/*65.5*/("""<div class="fieldrow"> <!--Maybe think of a different name, might not make sense?-->
      """),_display_(/*66.8*/for(col <- 0 until size) yield /*66.32*/ {_display_(Seq[Any](format.raw/*66.34*/("""
        """),format.raw/*67.74*/("""
        """),format.raw/*68.9*/("""<div class="field" id="field"""),_display_(/*68.38*/{row*size+col}),format.raw/*68.52*/("""">
            <img class="img" id="scalar"""),_display_(/*69.41*/{row*size+col}),format.raw/*69.55*/("""" alt=""/>
        </div>
      """)))}),format.raw/*71.8*/("""
    """)))}),format.raw/*72.6*/("""
"""),format.raw/*73.69*/("""
    """),format.raw/*74.5*/("""</div>
  </div>
</div>






"""),format.raw/*83.32*/("""
"""),format.raw/*84.25*/("""
"""),format.raw/*85.36*/("""
"""),format.raw/*86.93*/("""
"""),format.raw/*87.38*/("""
"""),format.raw/*88.36*/("""
"""),format.raw/*89.46*/("""
"""),format.raw/*90.58*/("""
"""),format.raw/*91.87*/("""
"""),format.raw/*92.54*/("""
"""),format.raw/*93.63*/("""
"""),format.raw/*94.30*/("""
"""),format.raw/*95.29*/("""
"""),format.raw/*96.54*/("""
"""),format.raw/*97.63*/("""
"""),format.raw/*98.30*/("""
"""),format.raw/*99.22*/("""
"""),format.raw/*100.27*/("""
"""),format.raw/*101.66*/("""
"""),format.raw/*102.29*/("""
"""),format.raw/*103.28*/("""
"""),format.raw/*104.20*/("""
"""),format.raw/*105.24*/("""
"""),format.raw/*106.19*/("""
"""),format.raw/*107.104*/("""
"""),format.raw/*108.12*/("""
"""),format.raw/*109.12*/("""
"""),format.raw/*110.15*/("""
"""),format.raw/*111.59*/("""
"""),format.raw/*112.10*/("""
"""),format.raw/*113.13*/("""
"""),format.raw/*114.11*/("""







"""),format.raw/*122.1*/("""<div class="form-group">
  <label for="text-input"> </label>
  <input type="text" class="form-control" id="text-input" placeholder="Enter your move like 'XX YY'" onfocus="this.placeholder = ''" input-focus-border-color="#99999" >
  <div style="padding:20px"></div>>
  <button onclick="move()" type="button" class="btn bouncy">Enter</button>
    <p id="message-field">"""),_display_(/*127.28*/{message}),format.raw/*127.37*/(""" """),format.raw/*127.38*/("""</p>
</div>


</body>




<script>
        """),format.raw/*137.47*/("""
      """),format.raw/*138.7*/("""// function openGrid(nmbr) """),format.raw/*138.34*/("""{"""),format.raw/*138.35*/("""
      """),format.raw/*139.7*/("""//   if (confirm("Are you sure you want to continue? Starting a new game means that current progress will be lost!")) """),format.raw/*139.125*/("""{"""),format.raw/*139.126*/("""
      """),format.raw/*140.7*/("""//     window.location.href="http://localhost:9000/new"+nmbr+"Grid";
      //   """),format.raw/*141.12*/("""}"""),format.raw/*141.13*/("""
      """),format.raw/*142.7*/("""// """),format.raw/*142.10*/("""}"""),format.raw/*142.11*/("""



      """),format.raw/*146.7*/("""function move() """),format.raw/*146.23*/("""{"""),format.raw/*146.24*/("""
        """),format.raw/*147.9*/("""let x = document.getElementById("text-input").value;
        if (x === "") """),format.raw/*148.23*/("""{"""),format.raw/*148.24*/("""
          """),format.raw/*149.11*/("""alert("Input can't be empty");
          return;
        """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/("""
        """),format.raw/*152.9*/("""let start = x.split(" ")[0];
        let dest = x.split(" ")[1];
        location.href = "http://localhost:9000/move/" + start + "/" + dest;
      """),format.raw/*155.7*/("""}"""),format.raw/*155.8*/("""

"""),format.raw/*157.1*/("""</script>"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface,message:String): play.twirl.api.HtmlFormat.Appendable = apply(controller,message)

  def f:((checkers.controller.controllerComponent.ControllerInterface,String) => play.twirl.api.HtmlFormat.Appendable) = (controller,message) => apply(controller,message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-12-03T01:11:41.033
                  SOURCE: C:/Users/Yannick/IdeaProjects/Checkers_WA/app/views/checkers_game.scala.html
                  HASH: 2b82ec5183fc4a0d1dd795686f2ffae12587e3b6
                  MATRIX: 797->1|963->94|974->98|1017->130|1029->135|1074->89|1105->127|1134->149|1164->153|1878->840|1893->846|1950->882|2013->918|2028->924|2089->964|2215->1063|2230->1069|2295->1113|4774->3679|4803->3681|4883->3735|4923->3759|4963->3761|4996->3767|5115->3860|5155->3884|5195->3886|5233->3961|5270->3971|5326->4000|5361->4014|5432->4058|5467->4072|5532->4107|5569->4114|5599->4184|5632->4190|5698->4259|5728->4285|5758->4322|5788->4416|5818->4455|5848->4492|5878->4539|5908->4598|5938->4686|5968->4741|5998->4805|6028->4836|6058->4866|6088->4921|6118->4985|6148->5016|6178->5039|6209->5067|6240->5134|6271->5164|6302->5193|6333->5214|6364->5239|6395->5259|6427->5364|6458->5377|6489->5390|6520->5406|6551->5466|6582->5477|6613->5491|6644->5503|6688->5519|7089->5892|7120->5901|7150->5902|7232->5993|7268->6001|7324->6028|7354->6029|7390->6037|7538->6155|7569->6156|7605->6164|7715->6245|7745->6246|7781->6254|7813->6257|7843->6258|7885->6272|7930->6288|7960->6289|7998->6299|8103->6375|8133->6376|8174->6388|8261->6447|8291->6448|8329->6458|8507->6608|8536->6609|8568->6613
                  LINES: 21->1|25->3|25->3|25->4|25->4|26->1|28->3|29->4|31->6|39->14|39->14|39->14|40->15|40->15|40->15|42->17|42->17|42->17|86->61|87->62|89->64|89->64|89->64|90->65|91->66|91->66|91->66|92->67|93->68|93->68|93->68|94->69|94->69|96->71|97->72|98->73|99->74|108->83|109->84|110->85|111->86|112->87|113->88|114->89|115->90|116->91|117->92|118->93|119->94|120->95|121->96|122->97|123->98|124->99|125->100|126->101|127->102|128->103|129->104|130->105|131->106|132->107|133->108|134->109|135->110|136->111|137->112|138->113|139->114|147->122|152->127|152->127|152->127|162->137|163->138|163->138|163->138|164->139|164->139|164->139|165->140|166->141|166->141|167->142|167->142|167->142|171->146|171->146|171->146|172->147|173->148|173->148|174->149|176->151|176->151|177->152|180->155|180->155|182->157
                  -- GENERATED --
              */
          