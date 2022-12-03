
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

object error extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(any:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*3.1*/("""<html lang="en">
<head>
    <title>Checkers Testpage</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/x-icon" href='"""),_display_(/*8.49*/routes/*8.55*/.Assets.versioned("images/icon.png")),format.raw/*8.91*/("""'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap&#64;5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
    <link rel="stylesheet" href='"""),_display_(/*11.35*/routes/*11.41*/.Assets.versioned("stylesheets/nav.css")),format.raw/*11.81*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*12.35*/routes/*12.41*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.82*/("""'>
</head>
<body>

Error: Page """),_display_(/*16.14*/{any}),format.raw/*16.19*/(""" """),format.raw/*16.20*/("""not found!

</body>
</html>

"""))
      }
    }
  }

  def render(any:String): play.twirl.api.HtmlFormat.Appendable = apply(any)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (any) => apply(any)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-12-03T14:24:57.395
                  SOURCE: C:/Users/Yannick/IdeaProjects/Checkers_WA/app/views/error.scala.html
                  HASH: 53dee069f481bda4775c29a384472111d849aa05
                  MATRIX: 729->1|836->13|866->17|1106->231|1120->237|1176->273|1571->641|1586->647|1647->687|1712->725|1727->731|1789->772|1852->808|1878->813|1907->814
                  LINES: 21->1|26->1|28->3|33->8|33->8|33->8|36->11|36->11|36->11|37->12|37->12|37->12|41->16|41->16|41->16
                  -- GENERATED --
              */
          