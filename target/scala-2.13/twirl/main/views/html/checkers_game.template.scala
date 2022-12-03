
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
  <script src="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
  <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
  <script src='"""),_display_(/*18.17*/routes/*18.23*/.Assets.versioned("javascripts/checkers.js")),format.raw/*18.67*/("""' type="text/javascript"></script>
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


<div class="gamecontainer" id="gamecontainer">
  <div class="game">
  """),_display_(/*63.4*/for(row <- 0 until size) yield /*63.28*/ {_display_(Seq[Any](format.raw/*63.30*/("""
    """),format.raw/*64.5*/("""<div class="fieldrow">
      """),_display_(/*65.8*/for(col <- 0 until size) yield /*65.32*/ {_display_(Seq[Any](format.raw/*65.34*/("""
        """),format.raw/*66.9*/("""<div class="field" id="field"""),_display_(/*66.38*/{row*size+col}),format.raw/*66.52*/("""">
            <img class="img" id="scalar"""),_display_(/*67.41*/{row*size+col}),format.raw/*67.55*/("""" alt=""/>
        </div>
      """)))}),format.raw/*69.8*/("""
    """),format.raw/*70.5*/("""</div>
    """)))}),format.raw/*71.6*/("""
  """),format.raw/*72.3*/("""</div>
</div>


<div class="form-group" id="form-group">
  <label for="text-input"> </label>
  <input type="text" class="form-control" id="text-input" placeholder="Enter your move like 'XX YY'" onfocus="this.placeholder = ''" input-focus-border-color="#99999" >
  <div style="padding:20px"></div>
  <button onclick="move()" type="button" class="btn bouncy">Enter</button>
    <p id="message-field">"""),_display_(/*81.28*/{message}),format.raw/*81.37*/(""" """),format.raw/*81.38*/("""</p>
</div>


</body>



<script>
      function move() """),format.raw/*90.23*/("""{"""),format.raw/*90.24*/("""
        """),format.raw/*91.9*/("""let x = document.getElementById("text-input").value;
        if (x === "") """),format.raw/*92.23*/("""{"""),format.raw/*92.24*/("""
          """),format.raw/*93.11*/("""alert("Input can't be empty");
          return;
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/("""
        """),format.raw/*96.9*/("""let start = x.split(" ")[0];
        let dest = x.split(" ")[1];
        location.href = "http://localhost:9000/move/" + start + "/" + dest;
      """),format.raw/*99.7*/("""}"""),format.raw/*99.8*/("""

"""),format.raw/*101.1*/("""</script>"""))
      }
    }
  }

  def render(controller:checkers.controller.controllerComponent.ControllerInterface,message:String): play.twirl.api.HtmlFormat.Appendable = apply(controller,message)

  def f:((checkers.controller.controllerComponent.ControllerInterface,String) => play.twirl.api.HtmlFormat.Appendable) = (controller,message) => apply(controller,message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-12-03T19:35:28.309
                  SOURCE: C:/Users/Yannick/IdeaProjects/Checkers_WA/app/views/checkers_game.scala.html
                  HASH: b529e7eb1d74a91b9573e339f1cb3b5578e0e329
                  MATRIX: 797->1|963->94|974->98|1017->130|1029->135|1074->89|1105->127|1134->149|1164->153|1878->840|1893->846|1950->882|2013->918|2028->924|2089->964|2431->1279|2446->1285|2511->1329|4844->3636|4884->3660|4924->3662|4957->3668|5014->3699|5054->3723|5094->3725|5131->3735|5187->3764|5222->3778|5293->3822|5328->3836|5393->3871|5426->3877|5469->3890|5500->3894|5935->4302|5965->4311|5994->4312|6087->4377|6116->4378|6153->4388|6257->4464|6286->4465|6326->4477|6412->4536|6441->4537|6478->4547|6655->4697|6683->4698|6715->4702
                  LINES: 21->1|25->3|25->3|25->4|25->4|26->1|28->3|29->4|31->6|39->14|39->14|39->14|40->15|40->15|40->15|43->18|43->18|43->18|88->63|88->63|88->63|89->64|90->65|90->65|90->65|91->66|91->66|91->66|92->67|92->67|94->69|95->70|96->71|97->72|106->81|106->81|106->81|115->90|115->90|116->91|117->92|117->92|118->93|120->95|120->95|121->96|124->99|124->99|126->101
                  -- GENERATED --
              */
          