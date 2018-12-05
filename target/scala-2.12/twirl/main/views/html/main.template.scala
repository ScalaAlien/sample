
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
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
    </head>
    <body>
    <div class="container">
        """),_display_(/*10.10*/common/*10.16*/.messages()),format.raw/*10.27*/("""
        """),_display_(/*11.10*/content),format.raw/*11.17*/("""
    """),format.raw/*12.5*/("""</div>
    """),_display_(/*13.6*/common/*13.12*/.footer()),format.raw/*13.21*/("""
    """),format.raw/*14.5*/("""<!-- jQuery CDN -->
    <script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha384-rY/jv8mMhqDabXSo+UCggqKtdmBfd3qC2/KvyTDNQ6PcUJXaxK1tMepoQda4g5vB" crossorigin="anonymous"></script>

    <!-- Bootstrap CDN -->
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <!-- DataTables CDN -->
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.18/css/dataTables.bootstrap.min.css" integrity="sha384-VEpVDzPR2x8NbTDZ8NFW4AWbtT2g/ollEzX/daZdW/YvUBlbgVtsxMftnJ84k0Cn" crossorigin="anonymous">
    <script src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js" integrity="sha384-r3v0/sXe5ocDydKBFcxP390rex2dEm9qN3Yv68S6uNX/F3b/RtMdGMUADZ8tabkz" crossorigin="anonymous"></script>
    <script src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap.min.js" integrity="sha384-7PXRkl4YJnEpP8uU4ev9652TTZSxrqC8uOpcV1ftVEC7LVyLZqqDUAaq+Y+lGgr9" crossorigin="anonymous"></script>

    <!-- <script src="""),_display_(/*32.23*/routes/*32.29*/.Assets.versioned("javascripts/vue.js")),format.raw/*32.68*/("""></script -->
    <link rel="stylesheet" media="screen" href=""""),_display_(/*33.50*/routes/*33.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*33.97*/("""">
    <script src="""),_display_(/*34.18*/routes/*34.24*/.Assets.versioned("javascripts/main.js")),format.raw/*34.64*/("""></script>
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
                  DATE: Wed Dec 05 20:20:30 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/main.scala.html
                  HASH: 631368751813498e6d35e4a07ea2cefb7a00fb55
                  MATRIX: 785->1|992->115|1019->116|1095->166|1120->171|1216->240|1231->246|1263->257|1300->267|1328->274|1360->279|1398->291|1413->297|1443->306|1475->311|3159->1968|3174->1974|3234->2013|3324->2076|3339->2082|3401->2123|3448->2143|3463->2149|3524->2189
                  LINES: 22->1|27->2|28->3|31->6|31->6|35->10|35->10|35->10|36->11|36->11|37->12|38->13|38->13|38->13|39->14|57->32|57->32|57->32|58->33|58->33|58->33|59->34|59->34|59->34
                  -- GENERATED --
              */
          