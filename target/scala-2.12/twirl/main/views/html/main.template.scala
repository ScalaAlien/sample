
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
    <title>"""),_display_(/*6.13*/title),format.raw/*6.18*/(""" """),format.raw/*6.19*/("""- MonoList</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.97*/("""">
</head>
<body>
<div class="container">
    """),_display_(/*11.6*/common/*11.12*/.messages()),format.raw/*11.23*/("""
    """),_display_(/*12.6*/content),format.raw/*12.13*/("""
"""),format.raw/*13.1*/("""</div>
"""),_display_(/*14.2*/common/*14.8*/.footer()),format.raw/*14.17*/("""
"""),format.raw/*15.1*/("""</body>
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
                  DATE: Mon Nov 19 23:57:16 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/main.scala.html
                  HASH: e05500ff1f86fe095c2e2504f98afe19d6e5f864
                  MATRIX: 770->1|977->115|1004->116|1072->158|1097->163|1125->164|1219->232|1233->238|1294->279|1367->326|1382->332|1414->343|1446->349|1474->356|1502->357|1536->365|1550->371|1580->380|1608->381
                  LINES: 21->1|26->2|27->3|30->6|30->6|30->6|31->7|31->7|31->7|35->11|35->11|35->11|36->12|36->12|37->13|38->14|38->14|38->14|39->15
                  -- GENERATED --
              */
          