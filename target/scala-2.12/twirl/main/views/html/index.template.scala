
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
/*1.2*/import forms.Show

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Show],MessagesProvider,Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(show: Form[Show])(implicit messagesProvider: MessagesProvider, flash: Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main(Messages("Home"))/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
    """),format.raw/*5.31*/("""
    """),_display_(/*6.6*/show/*6.10*/.globalError.map/*6.26*/ { error =>_display_(Seq[Any](format.raw/*6.37*/("""
        """),_display_(/*7.10*/error/*7.15*/.message),format.raw/*7.23*/("""
    """)))}),format.raw/*8.6*/("""

    """),_display_(/*10.6*/helper/*10.12*/.form(helper.CSRF(routes.BeaconController.show))/*10.60*/ {_display_(Seq[Any](format.raw/*10.62*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputDate(show("date_start"))),format.raw/*11.46*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputDate(show("date_end"))),format.raw/*12.44*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(show("serial"))),format.raw/*13.42*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(show("ble_address"))),format.raw/*14.47*/("""
        """),format.raw/*15.9*/("""<input type="submit" value="show"/>
    """)))}),format.raw/*16.6*/("""
""")))}))
      }
    }
  }

  def render(show:Form[Show],messagesProvider:MessagesProvider,flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(show)(messagesProvider,flash,request)

  def f:((Form[Show]) => (MessagesProvider,Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (show) => (messagesProvider,flash,request) => apply(show)(messagesProvider,flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 04 20:39:32 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/index.scala.html
                  HASH: 7239d717eaaa9642c7a1758472b19086d29d7378
                  MATRIX: 447->1|810->20|1005->122|1032->124|1062->146|1101->148|1133->179|1164->185|1176->189|1200->205|1248->216|1284->226|1297->231|1325->239|1360->245|1393->252|1408->258|1465->306|1505->308|1542->318|1557->324|1608->354|1645->364|1660->370|1709->398|1746->408|1761->414|1808->440|1845->450|1860->456|1912->487|1948->496|2019->537
                  LINES: 18->1|23->2|28->3|29->4|29->4|29->4|30->5|31->6|31->6|31->6|31->6|32->7|32->7|32->7|33->8|35->10|35->10|35->10|35->10|36->11|36->11|36->11|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|40->15|41->16
                  -- GENERATED --
              */
          