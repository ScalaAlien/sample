
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Date],Form[Item],Option[Seq[scala.Tuple2[models.Beacon, Int]]],MessagesProvider,Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(date: Form[Date], item: Form[Item], beaconsOpt: Option[Seq[(models.Beacon, Int)]])(implicit messagesProvider: MessagesProvider, flash: Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.168*/("""

"""),_display_(/*3.2*/main(Messages("Home"))/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
    """),format.raw/*4.31*/("""
    """),_display_(/*5.6*/date/*5.10*/.globalError.map/*5.26*/ { error =>_display_(Seq[Any](format.raw/*5.37*/("""
    """),_display_(/*6.6*/error/*6.11*/.message),format.raw/*6.19*/("""
    """)))}),format.raw/*7.6*/("""
    """),_display_(/*8.6*/item/*8.10*/.globalError.map/*8.26*/ { error =>_display_(Seq[Any](format.raw/*8.37*/("""
    """),_display_(/*9.6*/error/*9.11*/.message),format.raw/*9.19*/("""
    """)))}),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""<div class="left">
        """),_display_(/*12.10*/helper/*12.16*/.form(helper.CSRF(routes.BeaconController.selectByDate))/*12.72*/ {_display_(Seq[Any](format.raw/*12.74*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputDate(date("date_start"))),format.raw/*13.50*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputDate(date("date_end"))),format.raw/*14.48*/("""
            """),format.raw/*15.13*/("""<input type="submit" value="submit"/>
        """)))}),format.raw/*16.10*/("""
        """),_display_(/*17.10*/helper/*17.16*/.form(helper.CSRF(routes.BeaconController.selectByItem))/*17.72*/ {_display_(Seq[Any](format.raw/*17.74*/("""
        """),_display_(/*18.10*/helper/*18.16*/.inputText(item("serial"))),format.raw/*18.42*/("""
        """),_display_(/*19.10*/helper/*19.16*/.inputText(item("ble_address"))),format.raw/*19.47*/("""
        """),format.raw/*20.9*/("""<input type="submit" value="submit"/>
        """)))}),format.raw/*21.10*/("""
    """),format.raw/*22.5*/("""</div>
    <div class="middle">
        """),_display_(/*24.10*/if(beaconsOpt.isDefined)/*24.34*/ {_display_(Seq[Any](format.raw/*24.36*/("""
            """),format.raw/*25.13*/("""<table id="example" class="table table-striped table-bordered" style="width:100%">
                <thead>
                <tr>
                    <th>id</th>
                    <th>serial</th>
                    <th>bleAddress</th>
                    <th>ng</th>
                    <th>finishedProductInspectionAt</th>
                    <th>packagingAt</th>
                    <th>visualInspectionDefectiveAt</th>
                    <th>createAt</th>
                    <th>updateAt</th>
                </tr>
                </thead>
                <tbody>
                """),_display_(/*40.18*/for((beacon, count) <- beaconsOpt.get) yield /*40.56*/ {_display_(Seq[Any](format.raw/*40.58*/("""
                    """),format.raw/*41.21*/("""<tr>
                        <td>"""),_display_(/*42.30*/beacon/*42.36*/.id),format.raw/*42.39*/("""</td>
                        <td>"""),_display_(/*43.30*/beacon/*43.36*/.serial),format.raw/*43.43*/("""</td>
                        <td>"""),_display_(/*44.30*/beacon/*44.36*/.bleAddress),format.raw/*44.47*/("""</td>
                        <td>"""),_display_(/*45.30*/beacon/*45.36*/.ng),format.raw/*45.39*/("""</td>
                        <td>"""),_display_(/*46.30*/beacon/*46.36*/.finishedProductInspectionAt),format.raw/*46.64*/("""</td>
                        <td>"""),_display_(/*47.30*/beacon/*47.36*/.packagingAt),format.raw/*47.48*/("""</td>
                        <td>"""),_display_(/*48.30*/beacon/*48.36*/.visualInspectionDefectiveAt),format.raw/*48.64*/("""</td>
                        <td>"""),_display_(/*49.30*/beacon/*49.36*/.createAt),format.raw/*49.45*/("""</td>
                        <td>"""),_display_(/*50.30*/beacon/*50.36*/.updateAt),format.raw/*50.45*/("""</td>
                    </tr>
                """)))}),format.raw/*52.18*/("""
                """),format.raw/*53.17*/("""</tbody>
                <tfoot>
                <tr>
                    <th>id</th>
                    <th>serial</th>
                    <th>bleAddress</th>
                    <th>ng</th>
                    <th>finishedProductInspectionAt</th>
                    <th>packagingAt</th>
                    <th>visualInspectionDefectiveAt</th>
                    <th>createAt</th>
                    <th>updateAt</th>
                </tr>
                </tfoot>
            </table>
        """)))}),format.raw/*68.10*/("""
    """),format.raw/*69.5*/("""</div>
    <div class="right">
    </div>
""")))}))
      }
    }
  }

  def render(date:Form[Date],item:Form[Item],beaconsOpt:Option[Seq[scala.Tuple2[models.Beacon, Int]]],messagesProvider:MessagesProvider,flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(date,item,beaconsOpt)(messagesProvider,flash,request)

  def f:((Form[Date],Form[Item],Option[Seq[scala.Tuple2[models.Beacon, Int]]]) => (MessagesProvider,Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (date,item,beaconsOpt) => (messagesProvider,flash,request) => apply(date,item,beaconsOpt)(messagesProvider,flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 09 23:20:52 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/index.scala.html
                  HASH: df5458359cb9a26d4db5a88c46dd4d78eaecc01d
                  MATRIX: 842->1|1104->167|1134->172|1164->194|1203->196|1236->228|1268->235|1280->239|1304->255|1352->266|1384->273|1397->278|1425->286|1461->293|1493->300|1505->304|1529->320|1577->331|1609->338|1622->343|1650->351|1687->358|1720->364|1776->393|1791->399|1856->455|1896->457|1938->472|1953->478|2004->508|2046->523|2061->529|2110->557|2152->571|2231->619|2269->630|2284->636|2349->692|2389->694|2427->705|2442->711|2489->737|2527->748|2542->754|2594->785|2631->795|2710->843|2743->849|2813->892|2846->916|2886->918|2928->932|3557->1534|3611->1572|3651->1574|3701->1596|3763->1631|3778->1637|3802->1640|3865->1676|3880->1682|3908->1689|3971->1725|3986->1731|4018->1742|4081->1778|4096->1784|4120->1787|4183->1823|4198->1829|4247->1857|4310->1893|4325->1899|4358->1911|4421->1947|4436->1953|4485->1981|4548->2017|4563->2023|4593->2032|4656->2068|4671->2074|4701->2083|4783->2134|4829->2152|5377->2669|5410->2675
                  LINES: 22->1|27->1|29->3|29->3|29->3|30->4|31->5|31->5|31->5|31->5|32->6|32->6|32->6|33->7|34->8|34->8|34->8|34->8|35->9|35->9|35->9|36->10|37->11|38->12|38->12|38->12|38->12|39->13|39->13|39->13|40->14|40->14|40->14|41->15|42->16|43->17|43->17|43->17|43->17|44->18|44->18|44->18|45->19|45->19|45->19|46->20|47->21|48->22|50->24|50->24|50->24|51->25|66->40|66->40|66->40|67->41|68->42|68->42|68->42|69->43|69->43|69->43|70->44|70->44|70->44|71->45|71->45|71->45|72->46|72->46|72->46|73->47|73->47|73->47|74->48|74->48|74->48|75->49|75->49|75->49|76->50|76->50|76->50|78->52|79->53|94->68|95->69
                  -- GENERATED --
              */
          