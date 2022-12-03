
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
Seq[Any](format.raw/*2.1*/("""
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
                  DATE: 2022-12-03T13:55:11.485
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/checkers_game.scala.html
                  HASH: fb69979eb0b1baf2367012ecd33bc6ff3851b3ea
                  MATRIX: 797->1|963->92|974->96|1017->127|1029->132|1073->90|1101->125|1129->146|1157->148|1863->827|1878->833|1935->869|1997->904|2012->910|2073->950|2197->1047|2212->1053|2277->1097|4712->3619|4740->3620|4818->3672|4858->3696|4898->3698|4930->3703|5048->3795|5088->3819|5128->3821|5165->3895|5201->3904|5257->3933|5292->3947|5362->3990|5397->4004|5460->4037|5496->4043|5525->4112|5557->4117|5614->4177|5643->4202|5672->4238|5701->4331|5730->4369|5759->4405|5788->4451|5817->4509|5846->4596|5875->4650|5904->4713|5933->4743|5962->4772|5991->4826|6020->4889|6049->4919|6078->4941|6108->4968|6138->5034|6168->5063|6198->5091|6228->5111|6258->5135|6288->5154|6319->5258|6349->5270|6379->5282|6409->5297|6439->5356|6469->5366|6499->5379|6529->5390|6565->5398|6961->5766|6992->5775|7022->5776|7094->5857|7129->5864|7185->5891|7215->5892|7250->5899|7398->6017|7429->6018|7464->6025|7573->6105|7603->6106|7638->6113|7670->6116|7700->6117|7738->6127|7783->6143|7813->6144|7850->6153|7954->6228|7984->6229|8024->6240|8109->6297|8139->6298|8176->6307|8351->6454|8380->6455|8410->6457
                  LINES: 21->1|25->3|25->3|25->4|25->4|26->2|27->3|28->4|30->6|38->14|38->14|38->14|39->15|39->15|39->15|41->17|41->17|41->17|85->61|86->62|88->64|88->64|88->64|89->65|90->66|90->66|90->66|91->67|92->68|92->68|92->68|93->69|93->69|95->71|96->72|97->73|98->74|107->83|108->84|109->85|110->86|111->87|112->88|113->89|114->90|115->91|116->92|117->93|118->94|119->95|120->96|121->97|122->98|123->99|124->100|125->101|126->102|127->103|128->104|129->105|130->106|131->107|132->108|133->109|134->110|135->111|136->112|137->113|138->114|146->122|151->127|151->127|151->127|161->137|162->138|162->138|162->138|163->139|163->139|163->139|164->140|165->141|165->141|166->142|166->142|166->142|170->146|170->146|170->146|171->147|172->148|172->148|173->149|175->151|175->151|176->152|179->155|179->155|181->157
                  -- GENERATED --
              */
          