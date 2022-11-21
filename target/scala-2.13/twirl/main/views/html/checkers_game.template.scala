
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
  <label for="text-input"> </label>
  <input type="text" class="form-control" id="text-input" placeholder="Enter your move like 'XX YY'" onfocus="this.placeholder = ''" input-focus-border-color="#99999" >
  <div style="padding:20px">
  <button onclick="move()" type="button" class="btn bouncy">Enter</button>
    <p id="message-field">"""),_display_(/*95.28*/{message}),format.raw/*95.37*/(""" """),format.raw/*95.38*/("""</p>

</div>


</body>




<script>
  function openGrid(nmbr) """),format.raw/*106.27*/("""{"""),format.raw/*106.28*/("""
    """),format.raw/*107.5*/("""if (confirm("Are you sure you want to continue? Starting a new game means that current progress will be lost!")) """),format.raw/*107.118*/("""{"""),format.raw/*107.119*/("""
      """),format.raw/*108.7*/("""window.location.href="http://localhost:9000/new"+nmbr+"Grid";
    """),format.raw/*109.5*/("""}"""),format.raw/*109.6*/("""
  """),format.raw/*110.3*/("""}"""),format.raw/*110.4*/("""
  """),format.raw/*111.3*/("""function move() """),format.raw/*111.19*/("""{"""),format.raw/*111.20*/("""
    """),format.raw/*112.5*/("""var x = document.getElementById("text-input").value;
    if (x === "") """),format.raw/*113.19*/("""{"""),format.raw/*113.20*/("""
      """),format.raw/*114.7*/("""alert("Input can't be empty");
      return;
    """),format.raw/*116.5*/("""}"""),format.raw/*116.6*/("""
    """),format.raw/*117.5*/("""var start = x.split(" ")[0];
    var dest = x.split(" ")[1];
    location.href = "http://localhost:9000/move/" + start + "/" + dest;
  """),format.raw/*120.3*/("""}"""),format.raw/*120.4*/("""

"""),format.raw/*122.1*/("""</script>"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface,message:String): play.twirl.api.HtmlFormat.Appendable = apply(controller,message)

  def f:((checkers.controller.controllerComponent.ControllerInterface,String) => play.twirl.api.HtmlFormat.Appendable) = (controller,message) => apply(controller,message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-11-21T14:39:17.878
                  SOURCE: /Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/app/views/checkers_game.scala.html
                  HASH: f87c0b8cde16c54d7e465fd7a693737a55409749
                  MATRIX: 797->1|963->92|974->96|1033->90|1061->125|1089->127|1313->324|1328->330|1385->366|1771->725|1786->731|1847->771|4295->3193|4335->3217|4375->3219|4407->3224|4525->3316|4565->3340|4605->3342|4639->3350|4670->3372|4710->3374|4744->3381|4811->3421|4856->3457|4896->3459|4941->3477|5013->3540|5053->3542|5100->3561|5141->3575|5177->3590|5228->3614|5286->3651|5333->3670|5377->3696|5390->3701|5429->3702|5476->3721|5517->3735|5553->3750|5604->3774|5662->3811|5709->3830|5765->3855|5800->3872|5813->3877|5852->3878|5897->3895|5938->3909|5988->3938|6037->3960|6063->3965|6108->3982|6162->4005|6203->4018|6236->4034|6249->4039|6288->4040|6322->4047|6442->4137|6480->4145|6512->4150|6609->4217|6639->4220|7042->4596|7072->4605|7101->4606|7192->4668|7222->4669|7255->4674|7398->4787|7429->4788|7464->4795|7558->4861|7587->4862|7618->4865|7647->4866|7678->4869|7723->4885|7753->4886|7786->4891|7886->4962|7916->4963|7951->4970|8028->5019|8057->5020|8090->5025|8253->5160|8282->5161|8312->5163
                  LINES: 21->1|25->3|25->3|26->2|27->3|29->5|34->10|34->10|34->10|37->13|37->13|37->13|83->59|83->59|83->59|84->60|85->61|85->61|85->61|86->62|86->62|86->62|87->63|88->64|88->64|88->64|89->65|89->65|89->65|90->66|90->66|90->66|91->67|91->67|92->68|93->69|93->69|93->69|94->70|94->70|94->70|95->71|95->71|96->72|97->73|98->74|98->74|98->74|99->75|99->75|99->75|100->76|100->76|101->77|102->78|103->79|104->80|104->80|104->80|105->81|106->82|107->83|108->84|110->86|111->87|119->95|119->95|119->95|130->106|130->106|131->107|131->107|131->107|132->108|133->109|133->109|134->110|134->110|135->111|135->111|135->111|136->112|137->113|137->113|138->114|140->116|140->116|141->117|144->120|144->120|146->122
                  -- GENERATED --
              */
          