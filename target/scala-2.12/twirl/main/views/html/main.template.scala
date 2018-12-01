
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
import forms._

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
"""),format.raw/*14.1*/("""<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" media="screen" href=""""),_display_(/*15.46*/routes/*15.52*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.93*/("""">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script src="""),_display_(/*19.14*/routes/*19.20*/.Assets.versioned("javascripts/main.js")),format.raw/*19.60*/("""></script>
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
                  DATE: Sat Dec 01 13:00:41 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/main.scala.html
                  HASH: c3cb6f513b5caafe10e27bb101f9fc6d8a111cff
                  MATRIX: 785->1|992->115|1019->116|1087->158|1112->163|1191->216|1206->222|1238->233|1270->239|1298->246|1326->247|1360->255|1374->261|1404->270|1432->271|1716->528|1731->534|1793->575|2426->1181|2441->1187|2502->1227
                  LINES: 22->1|27->2|28->3|31->6|31->6|35->10|35->10|35->10|36->11|36->11|37->12|38->13|38->13|38->13|39->14|40->15|40->15|40->15|44->19|44->19|44->19
                  -- GENERATED --
              */
          