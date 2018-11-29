
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,Html,MessagesProvider,Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html)(implicit messagesProvider: MessagesProvider, flash: Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(/*6.13*/title),format.raw/*6.18*/("""</title>
</head>
<body>
<div class="container">
    """),_display_(/*10.6*/common/*10.12*/.messages()),format.raw/*10.23*/("""
    """),_display_(/*11.6*/content),format.raw/*11.13*/("""
"""),format.raw/*12.1*/("""</div>
"""),_display_(/*13.2*/common/*13.8*/.footer()),format.raw/*13.17*/("""
"""),format.raw/*14.73*/("""
"""),format.raw/*15.1*/("""<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" media="screen" href=""""),_display_(/*16.46*/routes/*16.52*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.93*/("""">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script src="""),_display_(/*20.14*/routes/*20.20*/.Assets.versioned("javascripts/main.js")),format.raw/*20.60*/("""></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html,messagesProvider:MessagesProvider,flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(messagesProvider,flash,request)

  def f:((String) => (Html) => (MessagesProvider,Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (messagesProvider,flash,request) => apply(title)(content)(messagesProvider,flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 29 20:35:25 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/main.scala.html
                  HASH: 7af62ee927c295fda7bf19b6901b4b89a690d9cb
                  MATRIX: 770->1|977->115|1004->116|1072->158|1097->163|1176->216|1191->222|1223->233|1255->239|1283->246|1311->247|1345->255|1359->261|1389->270|1418->343|1446->344|1730->601|1745->607|1807->648|2440->1254|2455->1260|2516->1300
                  LINES: 21->1|26->2|27->3|30->6|30->6|34->10|34->10|34->10|35->11|35->11|36->12|37->13|37->13|37->13|38->14|39->15|40->16|40->16|40->16|44->20|44->20|44->20
                  -- GENERATED --
              */
          