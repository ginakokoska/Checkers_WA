
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
  <link rel="icon" type="image/x-icon" href='"""),_display_(/*11.47*/routes/*11.53*/.Assets.versioned("images/icon.png")),format.raw/*11.89*/("""'>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
  <link rel="stylesheet" href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.versioned("stylesheets/say.css")),format.raw/*14.79*/("""'>
  <link rel="javascript" href='"""),_display_(/*15.33*/routes/*15.39*/.Assets.versioned("javascripts/checkers.js")),format.raw/*15.83*/("""'>
</head>

<body>
  <script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI=" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
  <script src="sweetalert2.all.min.js"></script>
  <script src="//cdn.jsdelivr.net/npm/sweetalert2&#64;11"></script>
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


  """),format.raw/*62.119*/("""
"""),format.raw/*63.1*/("""<div class="gamecontainer">
  <div class="game">
  """),_display_(/*65.4*/for(row <- 0 until size) yield /*65.28*/ {_display_(Seq[Any](format.raw/*65.30*/("""
    """),format.raw/*66.5*/("""<div class="fieldrow"> <!--Maybe think of a different name, might not make sense?-->
      """),_display_(/*67.8*/for(col <- 0 until size) yield /*67.32*/ {_display_(Seq[Any](format.raw/*67.34*/("""
        """),format.raw/*68.74*/("""
        """),format.raw/*69.9*/("""<div class="field" id="field"""),_display_(/*69.38*/{row*size+col}),format.raw/*69.52*/("""" style="background-color: #00ACED">
            <img class="img" id="scalar"""),_display_(/*70.41*/{row*size+col}),format.raw/*70.55*/("""" src="/assets/images/black_queen.png" alt=""/>
        </div>
      """)))}),format.raw/*72.8*/("""
    """)))}),format.raw/*73.6*/("""
"""),format.raw/*74.69*/("""
    """),format.raw/*75.5*/("""</div>
  </div>
</div>






"""),format.raw/*84.32*/("""
"""),format.raw/*85.25*/("""
"""),format.raw/*86.36*/("""
"""),format.raw/*87.93*/("""
"""),format.raw/*88.38*/("""
"""),format.raw/*89.36*/("""
"""),format.raw/*90.46*/("""
"""),format.raw/*91.58*/("""
"""),format.raw/*92.87*/("""
"""),format.raw/*93.54*/("""
"""),format.raw/*94.63*/("""
"""),format.raw/*95.30*/("""
"""),format.raw/*96.29*/("""
"""),format.raw/*97.54*/("""
"""),format.raw/*98.63*/("""
"""),format.raw/*99.30*/("""
"""),format.raw/*100.22*/("""
"""),format.raw/*101.27*/("""
"""),format.raw/*102.66*/("""
"""),format.raw/*103.29*/("""
"""),format.raw/*104.28*/("""
"""),format.raw/*105.20*/("""
"""),format.raw/*106.24*/("""
"""),format.raw/*107.19*/("""
"""),format.raw/*108.104*/("""
"""),format.raw/*109.12*/("""
"""),format.raw/*110.12*/("""
"""),format.raw/*111.15*/("""
"""),format.raw/*112.59*/("""
"""),format.raw/*113.10*/("""
"""),format.raw/*114.13*/("""
"""),format.raw/*115.11*/("""







"""),format.raw/*123.1*/("""<div class="form-group">
  <label for="text-input"> </label>
  <input type="text" class="form-control" id="text-input" placeholder="Enter your move like 'XX YY'" onfocus="this.placeholder = ''" input-focus-border-color="#99999" >
  <div style="padding:20px"></div>>
  <button onclick="move()" type="button" class="btn bouncy">Enter</button>
    <p id="message-field">"""),_display_(/*128.28*/{message}),format.raw/*128.37*/(""" """),format.raw/*128.38*/("""</p>
</div>


</body>




<script>
        """),format.raw/*138.47*/("""
      """),format.raw/*139.7*/("""function openGrid(nmbr) """),format.raw/*139.31*/("""{"""),format.raw/*139.32*/("""
        """),format.raw/*140.9*/("""if (confirm("Are you sure you want to continue? Starting a new game means that current progress will be lost!")) """),format.raw/*140.122*/("""{"""),format.raw/*140.123*/("""
          """),format.raw/*141.11*/("""window.location.href="http://localhost:9000/new"+nmbr+"Grid";
        """),format.raw/*142.9*/("""}"""),format.raw/*142.10*/("""
      """),format.raw/*143.7*/("""}"""),format.raw/*143.8*/("""
      """),format.raw/*144.7*/("""function move() """),format.raw/*144.23*/("""{"""),format.raw/*144.24*/("""
        """),format.raw/*145.9*/("""let x = document.getElementById("text-input").value;
        if (x === "") """),format.raw/*146.23*/("""{"""),format.raw/*146.24*/("""
          """),format.raw/*147.11*/("""alert("Input can't be empty");
          return;
        """),format.raw/*149.9*/("""}"""),format.raw/*149.10*/("""
        """),format.raw/*150.9*/("""let start = x.split(" ")[0];
        let dest = x.split(" ")[1];
        location.href = "http://localhost:9000/move/" + start + "/" + dest;
      """),format.raw/*153.7*/("""}"""),format.raw/*153.8*/("""

"""),format.raw/*155.1*/("""</script>"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface,message:String): play.twirl.api.HtmlFormat.Appendable = apply(controller,message)

  def f:((checkers.controller.controllerComponent.ControllerInterface,String) => play.twirl.api.HtmlFormat.Appendable) = (controller,message) => apply(controller,message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-12-02T00:02:21.783
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/checkers_game.scala.html
                  HASH: d270d5115edddc6c3d5f49507f262be5719eef59
                  MATRIX: 797->1|963->92|974->96|1017->127|1029->132|1073->90|1101->125|1129->146|1157->148|1381->345|1396->351|1453->387|1839->746|1854->752|1915->792|1977->827|1992->833|2057->877|4731->3638|4759->3639|4837->3691|4877->3715|4917->3717|4949->3722|5067->3814|5107->3838|5147->3840|5184->3914|5220->3923|5276->3952|5311->3966|5415->4043|5450->4057|5550->4127|5586->4133|5615->4202|5647->4207|5704->4267|5733->4292|5762->4328|5791->4421|5820->4459|5849->4495|5878->4541|5907->4599|5936->4686|5965->4740|5994->4803|6023->4833|6052->4862|6081->4916|6110->4979|6139->5009|6169->5031|6199->5058|6229->5124|6259->5153|6289->5181|6319->5201|6349->5225|6379->5244|6410->5348|6440->5360|6470->5372|6500->5387|6530->5446|6560->5456|6590->5469|6620->5480|6656->5488|7052->5856|7083->5865|7113->5866|7185->5947|7220->5954|7273->5978|7303->5979|7340->5988|7483->6101|7514->6102|7554->6113|7652->6183|7682->6184|7717->6191|7746->6192|7781->6199|7826->6215|7856->6216|7893->6225|7997->6300|8027->6301|8067->6312|8152->6369|8182->6370|8219->6379|8394->6526|8423->6527|8453->6529
                  LINES: 21->1|25->3|25->3|25->4|25->4|26->2|27->3|28->4|30->6|35->11|35->11|35->11|38->14|38->14|38->14|39->15|39->15|39->15|86->62|87->63|89->65|89->65|89->65|90->66|91->67|91->67|91->67|92->68|93->69|93->69|93->69|94->70|94->70|96->72|97->73|98->74|99->75|108->84|109->85|110->86|111->87|112->88|113->89|114->90|115->91|116->92|117->93|118->94|119->95|120->96|121->97|122->98|123->99|124->100|125->101|126->102|127->103|128->104|129->105|130->106|131->107|132->108|133->109|134->110|135->111|136->112|137->113|138->114|139->115|147->123|152->128|152->128|152->128|162->138|163->139|163->139|163->139|164->140|164->140|164->140|165->141|166->142|166->142|167->143|167->143|168->144|168->144|168->144|169->145|170->146|170->146|171->147|173->149|173->149|174->150|177->153|177->153|179->155
                  -- GENERATED --
              */
          