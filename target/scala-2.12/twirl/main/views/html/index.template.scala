
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[Show],Option[Seq[scala.Tuple2[models.Beacon, Int]]],MessagesProvider,Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(show: Form[Show], beaconsOpt: Option[Seq[(models.Beacon, Int)]])(implicit messagesProvider: MessagesProvider, flash: Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main(Messages("Home"))/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
        """),format.raw/*5.35*/("""
        """),_display_(/*6.10*/show/*6.14*/.globalError.map/*6.30*/ { error =>_display_(Seq[Any](format.raw/*6.41*/("""
        """),_display_(/*7.10*/error/*7.15*/.message),format.raw/*7.23*/("""
    """)))}),format.raw/*8.6*/("""
    """),format.raw/*9.5*/("""<div class="left">
        """),_display_(/*10.10*/helper/*10.16*/.form(helper.CSRF(routes.BeaconController.show))/*10.64*/ {_display_(Seq[Any](format.raw/*10.66*/("""
            """),_display_(/*11.14*/helper/*11.20*/.inputDate(show("date_start"))),format.raw/*11.50*/("""
            """),_display_(/*12.14*/helper/*12.20*/.inputDate(show("date_end"))),format.raw/*12.48*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(show("serial"))),format.raw/*13.46*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(show("ble_address"))),format.raw/*14.51*/("""
            """),format.raw/*15.13*/("""<input type="submit" value="show"/>
        """)))}),format.raw/*16.10*/("""
    """),format.raw/*17.5*/("""</div>
    <div class="middle">
        """),_display_(/*19.10*/if(beaconsOpt.isDefined)/*19.34*/ {_display_(Seq[Any](format.raw/*19.36*/("""
            """),format.raw/*20.13*/("""<table id="example" class="table table-striped table-bordered" style="width:100%">
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
                """),_display_(/*35.18*/for((beacon, count) <- beaconsOpt.get) yield /*35.56*/ {_display_(Seq[Any](format.raw/*35.58*/("""
                    """),format.raw/*36.21*/("""<tr>
                        <td>"""),_display_(/*37.30*/beacon/*37.36*/.id),format.raw/*37.39*/("""</td>
                        <td>"""),_display_(/*38.30*/beacon/*38.36*/.serial),format.raw/*38.43*/("""</td>
                        <td>"""),_display_(/*39.30*/beacon/*39.36*/.bleAddress),format.raw/*39.47*/("""</td>
                        <td>"""),_display_(/*40.30*/beacon/*40.36*/.ng),format.raw/*40.39*/("""</td>
                        <td>"""),_display_(/*41.30*/beacon/*41.36*/.finishedProductInspectionAt),format.raw/*41.64*/("""</td>
                        <td>"""),_display_(/*42.30*/beacon/*42.36*/.packagingAt),format.raw/*42.48*/("""</td>
                        <td>"""),_display_(/*43.30*/beacon/*43.36*/.visualInspectionDefectiveAt),format.raw/*43.64*/("""</td>
                        <td>"""),_display_(/*44.30*/beacon/*44.36*/.createAt),format.raw/*44.45*/("""</td>
                        <td>"""),_display_(/*45.30*/beacon/*45.36*/.updateAt),format.raw/*45.45*/("""</td>
                    </tr>
                """)))}),format.raw/*47.18*/("""
                """),format.raw/*48.17*/("""</tbody>
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
        """)))}),format.raw/*63.10*/("""
    """),format.raw/*64.5*/("""</div>
    <div class="right">
    </div>
""")))}))
      }
    }
  }

  def render(show:Form[Show],beaconsOpt:Option[Seq[scala.Tuple2[models.Beacon, Int]]],messagesProvider:MessagesProvider,flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(show,beaconsOpt)(messagesProvider,flash,request)

  def f:((Form[Show],Option[Seq[scala.Tuple2[models.Beacon, Int]]]) => (MessagesProvider,Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (show,beaconsOpt) => (messagesProvider,flash,request) => apply(show,beaconsOpt)(messagesProvider,flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 05 20:45:25 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/index.scala.html
                  HASH: 7f617864766870235130769326517e73987faeae
                  MATRIX: 447->1|856->20|1098->169|1125->171|1155->193|1194->195|1230->230|1266->240|1278->244|1302->260|1350->271|1386->281|1399->286|1427->294|1462->300|1493->305|1548->333|1563->339|1620->387|1660->389|1701->403|1716->409|1767->439|1808->453|1823->459|1872->487|1913->501|1928->507|1975->533|2016->547|2031->553|2083->584|2124->597|2200->642|2232->647|2300->688|2333->712|2373->714|2414->727|3028->1314|3082->1352|3122->1354|3171->1375|3232->1409|3247->1415|3271->1418|3333->1453|3348->1459|3376->1466|3438->1501|3453->1507|3485->1518|3547->1553|3562->1559|3586->1562|3648->1597|3663->1603|3712->1631|3774->1666|3789->1672|3822->1684|3884->1719|3899->1725|3948->1753|4010->1788|4025->1794|4055->1803|4117->1838|4132->1844|4162->1853|4242->1902|4287->1919|4820->2421|4852->2426
                  LINES: 18->1|23->2|28->3|29->4|29->4|29->4|30->5|31->6|31->6|31->6|31->6|32->7|32->7|32->7|33->8|34->9|35->10|35->10|35->10|35->10|36->11|36->11|36->11|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|40->15|41->16|42->17|44->19|44->19|44->19|45->20|60->35|60->35|60->35|61->36|62->37|62->37|62->37|63->38|63->38|63->38|64->39|64->39|64->39|65->40|65->40|65->40|66->41|66->41|66->41|67->42|67->42|67->42|68->43|68->43|68->43|69->44|69->44|69->44|70->45|70->45|70->45|72->47|73->48|88->63|89->64
                  -- GENERATED --
              */
          