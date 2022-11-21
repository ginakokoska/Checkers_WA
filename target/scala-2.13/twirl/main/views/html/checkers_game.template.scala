
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
Seq[Any](format.raw/*1.90*/("""

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
    """),_display_(/*59.6*/for(row <- 0 until size) yield /*59.30*/ {_display_(Seq[Any](format.raw/*59.32*/("""
    """),format.raw/*60.5*/("""<div class="fieldrow"> <!--Maybe think of a different name, might not make sense?-->
      """),_display_(/*61.8*/for(col <- 0 until size) yield /*61.32*/ {_display_(Seq[Any](format.raw/*61.34*/("""
      """),_display_(/*62.8*/if((row+col) % 2 == 0)/*62.30*/ {_display_(Seq[Any](format.raw/*62.32*/("""
      """),format.raw/*63.7*/("""<span class="field_red">
              """),_display_(/*64.16*/if(controller.field(row, col).isSet)/*64.52*/ {_display_(Seq[Any](format.raw/*64.54*/("""
                """),_display_(/*65.18*/if(controller.field(row, col).getPiece.get.getColor == "black")/*65.81*/ {_display_(Seq[Any](format.raw/*65.83*/("""
                  """),format.raw/*66.19*/("""<span class='"""),_display_(/*66.33*/{"piece_black"}),format.raw/*66.48*/("""'>
                    """),_display_(/*67.22*/{controller.field(row, col).toString}),format.raw/*67.59*/("""
                  """),format.raw/*68.19*/("""</span>
                """)))}/*69.19*/else/*69.24*/{_display_(Seq[Any](format.raw/*69.25*/("""
                  """),format.raw/*70.19*/("""<span class='"""),_display_(/*70.33*/{"piece_white"}),format.raw/*70.48*/("""'>
                    """),_display_(/*71.22*/{controller.field(row, col).toString}),format.raw/*71.59*/("""
                  """),format.raw/*72.19*/("""</span>
                """)))}),format.raw/*73.18*/("""
              """)))}/*74.17*/else/*74.22*/{_display_(Seq[Any](format.raw/*74.23*/("""
                """),format.raw/*75.17*/("""<span class='"""),_display_(/*75.31*/{"piece_was_never_an_option"}),format.raw/*75.60*/("""'>
                  """),_display_(/*76.20*/{" "}),format.raw/*76.25*/("""
                """),format.raw/*77.17*/("""</span>
              """)))}),format.raw/*78.16*/("""
            """),format.raw/*79.13*/("""</span>
      """)))}/*80.9*/else/*80.14*/{_display_(Seq[Any](format.raw/*80.15*/("""
      """),format.raw/*81.7*/("""<span class="field_black"></span> <!-- If the code breaks, just copy from above-->
      """)))}),format.raw/*82.8*/("""
      """)))}),format.raw/*83.8*/("""
    """),format.raw/*84.5*/("""</div>
    <div class="clear"></div> <!--idk about this...-->
    """)))}),format.raw/*86.6*/("""
  """),format.raw/*87.3*/("""</div>
</div>

<div class="form-group">
  <label for="text-input">Text Input</label>
  <input type="text" class="form-control" id="text-input" placeholder="Enter your move like 'XX YY'">
</div>

<button onclick="move()" type="button" class="btn btn-light">Enter</button>
<p id="message-field">"""),_display_(/*96.24*/{message}),format.raw/*96.33*/("""</p>
</body>


<script>
  function openGrid(nmbr) """),format.raw/*101.27*/("""{"""),format.raw/*101.28*/("""
    """),format.raw/*102.5*/("""if (confirm("Are you sure you want to continue? Starting a new game means that current progress will be lost!")) """),format.raw/*102.118*/("""{"""),format.raw/*102.119*/("""
      """),format.raw/*103.7*/("""window.location.href="http://localhost:9000/new"+nmbr+"Grid";
    """),format.raw/*104.5*/("""}"""),format.raw/*104.6*/("""
  """),format.raw/*105.3*/("""}"""),format.raw/*105.4*/("""
  """),format.raw/*106.3*/("""function move() """),format.raw/*106.19*/("""{"""),format.raw/*106.20*/("""
    """),format.raw/*107.5*/("""var x = document.getElementById("text-input").value;
    var start = x.split(" ")[0];
    var dest = x.split(" ")[1];
    location.href = "http://localhost:9000/move/" + start + "/" + dest;
  """),format.raw/*111.3*/("""}"""),format.raw/*111.4*/("""
"""),format.raw/*112.1*/("""</script>"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface,message:String): play.twirl.api.HtmlFormat.Appendable = apply(controller,message)

  def f:((checkers.controller.controllerComponent.ControllerInterface,String) => play.twirl.api.HtmlFormat.Appendable) = (controller,message) => apply(controller,message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-11-21T12:19:48.277
                  SOURCE: C:/Users/Yannick/IdeaProjects/Checkers_WA/app/views/checkers_game.scala.html
                  HASH: 2d7324a2f8b97d45e20144d716caf32a84753eca
                  MATRIX: 797->1|963->94|974->98|1034->89|1065->127|1095->131|1324->333|1339->339|1396->375|1785->737|1800->743|1861->783|4355->3251|4395->3275|4435->3277|4468->3283|4587->3376|4627->3400|4667->3402|4702->3411|4733->3433|4773->3435|4808->3443|4876->3484|4921->3520|4961->3522|5007->3541|5079->3604|5119->3606|5167->3626|5208->3640|5244->3655|5296->3680|5354->3717|5402->3737|5447->3764|5460->3769|5499->3770|5547->3790|5588->3804|5624->3819|5676->3844|5734->3881|5782->3901|5839->3927|5875->3945|5888->3950|5927->3951|5973->3969|6014->3983|6064->4012|6114->4035|6140->4040|6186->4058|6241->4082|6283->4096|6317->4113|6330->4118|6369->4119|6404->4127|6525->4218|6564->4227|6597->4233|6696->4302|6727->4306|7057->4609|7087->4618|7171->4673|7201->4674|7235->4680|7378->4793|7409->4794|7445->4802|7540->4869|7569->4870|7601->4874|7630->4875|7662->4879|7707->4895|7737->4896|7771->4902|7995->5098|8024->5099|8054->5101
                  LINES: 21->1|25->3|25->3|26->1|28->3|30->5|35->10|35->10|35->10|38->13|38->13|38->13|84->59|84->59|84->59|85->60|86->61|86->61|86->61|87->62|87->62|87->62|88->63|89->64|89->64|89->64|90->65|90->65|90->65|91->66|91->66|91->66|92->67|92->67|93->68|94->69|94->69|94->69|95->70|95->70|95->70|96->71|96->71|97->72|98->73|99->74|99->74|99->74|100->75|100->75|100->75|101->76|101->76|102->77|103->78|104->79|105->80|105->80|105->80|106->81|107->82|108->83|109->84|111->86|112->87|121->96|121->96|126->101|126->101|127->102|127->102|127->102|128->103|129->104|129->104|130->105|130->105|131->106|131->106|131->106|132->107|136->111|136->111|137->112
                  -- GENERATED --
              */
          