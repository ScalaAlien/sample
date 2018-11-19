
package views.html.common

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

object messages extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/flash/*3.7*/.get("success").map/*3.26*/ { message =>_display_(Seq[Any](format.raw/*3.39*/("""
"""),format.raw/*4.1*/("""<div class="container">
    <div class="alert alert-success" role="alert">
        """),_display_(/*6.10*/message),format.raw/*6.17*/("""
    """),format.raw/*7.5*/("""</div>
</div>
""")))}),format.raw/*9.2*/("""
"""),_display_(/*10.2*/flash/*10.7*/.get("warning").map/*10.26*/ { message =>_display_(Seq[Any](format.raw/*10.39*/("""
"""),format.raw/*11.1*/("""<div class="container">
    <div class="alert alert-warning" role="alert">
        """),_display_(/*13.10*/message),format.raw/*13.17*/("""
    """),format.raw/*14.5*/("""</div>
</div>
""")))}),format.raw/*16.2*/("""
"""),_display_(/*17.2*/flash/*17.7*/.get("failure").map/*17.26*/ { message =>_display_(Seq[Any](format.raw/*17.39*/("""
"""),format.raw/*18.1*/("""<div class="container">
    <div class="alert alert-danger" role="alert">
        """),_display_(/*20.10*/message),format.raw/*20.17*/("""
    """),format.raw/*21.5*/("""</div>
</div>
""")))}))
      }
    }
  }

  def render(flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(flash)

  def f:(() => (Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (flash) => apply()(flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Nov 19 23:57:16 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/common/messages.scala.html
                  HASH: 73ceb5f9b96d3ee843df0a7c6a13e8559b4f53d4
                  MATRIX: 738->1|857->27|884->29|896->34|923->53|973->66|1000->67|1110->151|1137->158|1168->163|1212->178|1240->180|1253->185|1281->204|1332->217|1360->218|1471->302|1499->309|1531->314|1576->329|1604->331|1617->336|1645->355|1696->368|1724->369|1834->452|1862->459|1894->464
                  LINES: 21->1|26->2|27->3|27->3|27->3|27->3|28->4|30->6|30->6|31->7|33->9|34->10|34->10|34->10|34->10|35->11|37->13|37->13|38->14|40->16|41->17|41->17|41->17|41->17|42->18|44->20|44->20|45->21
                  -- GENERATED --
              */
          