
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
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.97*/("""">
</head>
<body>
<div class="container">
    """),_display_(/*11.6*/common/*11.12*/.messages()),format.raw/*11.23*/("""
    """),_display_(/*12.6*/content),format.raw/*12.13*/("""
"""),format.raw/*13.1*/("""</div>
"""),_display_(/*14.2*/common/*14.8*/.footer()),format.raw/*14.17*/("""
"""),format.raw/*15.1*/("""<script src="""),_display_(/*15.14*/routes/*15.20*/.Assets.versioned("javascripts/vue.js")),format.raw/*15.59*/("""></script>
<script src="""),_display_(/*16.14*/routes/*16.20*/.Assets.versioned("javascripts/main.js")),format.raw/*16.60*/("""></script>
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
                  DATE: Tue Nov 27 23:13:09 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/main.scala.html
                  HASH: cfaa3c71a68073bb9589f58e3eeaf3a438933728
                  MATRIX: 770->1|977->115|1004->116|1072->158|1097->163|1181->221|1195->227|1256->268|1329->315|1344->321|1376->332|1408->338|1436->345|1464->346|1498->354|1512->360|1542->369|1570->370|1610->383|1625->389|1685->428|1736->452|1751->458|1812->498
                  LINES: 21->1|26->2|27->3|30->6|30->6|31->7|31->7|31->7|35->11|35->11|35->11|36->12|36->12|37->13|38->14|38->14|38->14|39->15|39->15|39->15|39->15|40->16|40->16|40->16
                  -- GENERATED --
              */
          