
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
  <script src='"""),_display_(/*15.17*/routes/*15.23*/.Assets.versioned("javascripts/checkers.js")),format.raw/*15.67*/("""' type="text/javascript"></script>
  <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
"""),format.raw/*17.158*/("""
  """),format.raw/*18.3*/("""<link src="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"> </link>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
"""),format.raw/*20.113*/("""
  """),format.raw/*21.3*/("""<script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
</head>

<body>
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


  """),format.raw/*64.119*/("""
"""),format.raw/*65.1*/("""<div class="gamecontainer">
  <div class="game">
  """),_display_(/*67.4*/for(row <- 0 until size) yield /*67.28*/ {_display_(Seq[Any](format.raw/*67.30*/("""
    """),format.raw/*68.5*/("""<div class="fieldrow"> <!--Maybe think of a different name, might not make sense?-->
      """),_display_(/*69.8*/for(col <- 0 until size) yield /*69.32*/ {_display_(Seq[Any](format.raw/*69.34*/("""
        """),format.raw/*70.74*/("""
        """),format.raw/*71.9*/("""<div class="field" id="field"""),_display_(/*71.38*/{row*size+col}),format.raw/*71.52*/("""">
            <img class="img" id="scalar"""),_display_(/*72.41*/{row*size+col}),format.raw/*72.55*/("""" src="/assets/images/white_queen.png" alt=""/>
        </div>
      """)))}),format.raw/*74.8*/("""
    """)))}),format.raw/*75.6*/("""
"""),format.raw/*76.69*/("""
    """),format.raw/*77.5*/("""</div>
  </div>
</div>






"""),format.raw/*86.32*/("""
"""),format.raw/*87.25*/("""
"""),format.raw/*88.36*/("""
"""),format.raw/*89.93*/("""
"""),format.raw/*90.38*/("""
"""),format.raw/*91.36*/("""
"""),format.raw/*92.46*/("""
"""),format.raw/*93.58*/("""
"""),format.raw/*94.87*/("""
"""),format.raw/*95.54*/("""
"""),format.raw/*96.63*/("""
"""),format.raw/*97.30*/("""
"""),format.raw/*98.29*/("""
"""),format.raw/*99.54*/("""
"""),format.raw/*100.63*/("""
"""),format.raw/*101.30*/("""
"""),format.raw/*102.22*/("""
"""),format.raw/*103.27*/("""
"""),format.raw/*104.66*/("""
"""),format.raw/*105.29*/("""
"""),format.raw/*106.28*/("""
"""),format.raw/*107.20*/("""
"""),format.raw/*108.24*/("""
"""),format.raw/*109.19*/("""
"""),format.raw/*110.104*/("""
"""),format.raw/*111.12*/("""
"""),format.raw/*112.12*/("""
"""),format.raw/*113.15*/("""
"""),format.raw/*114.59*/("""
"""),format.raw/*115.10*/("""
"""),format.raw/*116.13*/("""
"""),format.raw/*117.11*/("""







"""),format.raw/*125.1*/("""<div class="form-group">
  <label for="text-input"> </label>
  <input type="text" class="form-control" id="text-input" placeholder="Enter your move like 'XX YY'" onfocus="this.placeholder = ''" input-focus-border-color="#99999" >
  <div style="padding:20px"></div>>
  <button onclick="move()" type="button" class="btn bouncy">Enter</button>
    <p id="message-field">"""),_display_(/*130.28*/{message}),format.raw/*130.37*/(""" """),format.raw/*130.38*/("""</p>
</div>


</body>




<script>
        """),format.raw/*140.47*/("""
      """),format.raw/*141.7*/("""// function openGrid(nmbr) """),format.raw/*141.34*/("""{"""),format.raw/*141.35*/("""
      """),format.raw/*142.7*/("""//   if (confirm("Are you sure you want to continue? Starting a new game means that current progress will be lost!")) """),format.raw/*142.125*/("""{"""),format.raw/*142.126*/("""
      """),format.raw/*143.7*/("""//     window.location.href="http://localhost:9000/new"+nmbr+"Grid";
      //   """),format.raw/*144.12*/("""}"""),format.raw/*144.13*/("""
      """),format.raw/*145.7*/("""// """),format.raw/*145.10*/("""}"""),format.raw/*145.11*/("""



      """),format.raw/*149.7*/("""function move() """),format.raw/*149.23*/("""{"""),format.raw/*149.24*/("""
        """),format.raw/*150.9*/("""let x = document.getElementById("text-input").value;
        if (x === "") """),format.raw/*151.23*/("""{"""),format.raw/*151.24*/("""
          """),format.raw/*152.11*/("""alert("Input can't be empty");
          return;
        """),format.raw/*154.9*/("""}"""),format.raw/*154.10*/("""
        """),format.raw/*155.9*/("""let start = x.split(" ")[0];
        let dest = x.split(" ")[1];
        location.href = "http://localhost:9000/move/" + start + "/" + dest;
      """),format.raw/*158.7*/("""}"""),format.raw/*158.8*/("""

"""),format.raw/*160.1*/("""</script>"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface,message:String): play.twirl.api.HtmlFormat.Appendable = apply(controller,message)

  def f:((checkers.controller.controllerComponent.ControllerInterface,String) => play.twirl.api.HtmlFormat.Appendable) = (controller,message) => apply(controller,message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-12-02T20:56:49.964
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/checkers_game.scala.html
                  HASH: dc86df124494be32005ed51d1bc41175ecacda6f
                  MATRIX: 797->1|963->92|974->96|1017->127|1029->132|1073->90|1101->125|1129->146|1157->148|1381->345|1396->351|1453->387|1839->746|1854->752|1915->792|1961->811|1976->817|2041->861|2183->1131|2213->1134|2543->1547|2573->1550|4914->3978|4942->3979|5020->4031|5060->4055|5100->4057|5132->4062|5250->4154|5290->4178|5330->4180|5367->4254|5403->4263|5459->4292|5494->4306|5564->4349|5599->4363|5699->4433|5735->4439|5764->4508|5796->4513|5853->4573|5882->4598|5911->4634|5940->4727|5969->4765|5998->4801|6027->4847|6056->4905|6085->4992|6114->5046|6143->5109|6172->5139|6201->5168|6230->5222|6260->5285|6290->5315|6320->5337|6350->5364|6380->5430|6410->5459|6440->5487|6470->5507|6500->5531|6530->5550|6561->5654|6591->5666|6621->5678|6651->5693|6681->5752|6711->5762|6741->5775|6771->5786|6807->5794|7203->6162|7234->6171|7264->6172|7336->6253|7371->6260|7427->6287|7457->6288|7492->6295|7640->6413|7671->6414|7706->6421|7815->6501|7845->6502|7880->6509|7912->6512|7942->6513|7980->6523|8025->6539|8055->6540|8092->6549|8196->6624|8226->6625|8266->6636|8351->6693|8381->6694|8418->6703|8593->6850|8622->6851|8652->6853
                  LINES: 21->1|25->3|25->3|25->4|25->4|26->2|27->3|28->4|30->6|35->11|35->11|35->11|38->14|38->14|38->14|39->15|39->15|39->15|41->17|42->18|44->20|45->21|88->64|89->65|91->67|91->67|91->67|92->68|93->69|93->69|93->69|94->70|95->71|95->71|95->71|96->72|96->72|98->74|99->75|100->76|101->77|110->86|111->87|112->88|113->89|114->90|115->91|116->92|117->93|118->94|119->95|120->96|121->97|122->98|123->99|124->100|125->101|126->102|127->103|128->104|129->105|130->106|131->107|132->108|133->109|134->110|135->111|136->112|137->113|138->114|139->115|140->116|141->117|149->125|154->130|154->130|154->130|164->140|165->141|165->141|165->141|166->142|166->142|166->142|167->143|168->144|168->144|169->145|169->145|169->145|173->149|173->149|173->149|174->150|175->151|175->151|176->152|178->154|178->154|179->155|182->158|182->158|184->160
                  -- GENERATED --
              */
          