
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
import forms._

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
                  DATE: Tue Dec 04 20:39:32 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/common/messages.scala.html
                  HASH: 94c825af074385e6270caf8fce701744cab52ad7
                  MATRIX: 753->1|872->27|899->29|911->34|938->53|988->66|1015->67|1125->151|1152->158|1183->163|1227->178|1255->180|1268->185|1296->204|1347->217|1375->218|1486->302|1514->309|1546->314|1591->329|1619->331|1632->336|1660->355|1711->368|1739->369|1849->452|1877->459|1909->464
                  LINES: 22->1|27->2|28->3|28->3|28->3|28->3|29->4|31->6|31->6|32->7|34->9|35->10|35->10|35->10|35->10|36->11|38->13|38->13|39->14|41->16|42->17|42->17|42->17|42->17|43->18|45->20|45->20|46->21
                  -- GENERATED --
              */
          