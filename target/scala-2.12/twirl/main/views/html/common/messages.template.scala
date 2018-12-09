
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


Seq[Any](format.raw/*1.27*/("""

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
                  DATE: Sun Dec 09 22:43:56 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/common/messages.scala.html
                  HASH: d7e0249aab2e4486e10b96cf5f6cbfe1a7465281
                  MATRIX: 753->1|873->26|903->31|915->36|942->55|992->68|1020->70|1132->156|1159->163|1191->169|1237->186|1266->189|1279->194|1307->213|1358->226|1387->228|1500->314|1528->321|1561->327|1608->344|1637->347|1650->352|1678->371|1729->384|1758->386|1870->471|1898->478|1931->484
                  LINES: 22->1|27->1|29->3|29->3|29->3|29->3|30->4|32->6|32->6|33->7|35->9|36->10|36->10|36->10|36->10|37->11|39->13|39->13|40->14|42->16|43->17|43->17|43->17|43->17|44->18|46->20|46->20|47->21
                  -- GENERATED --
              */
          