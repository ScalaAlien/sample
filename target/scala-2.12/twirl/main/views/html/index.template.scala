
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


Seq[Any](format.raw/*2.150*/("""

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
                  DATE: Sun Dec 09 20:55:26 JST 2018
                  SOURCE: C:/Users/Kosuke/Desktop/sample/app/views/index.scala.html
                  HASH: b9c3427e16d4e493b0f3e99744c66aef82d9a684
                  MATRIX: 447->1|856->21|1100->169|1130->174|1160->196|1199->198|1236->234|1273->245|1285->249|1309->265|1357->276|1394->287|1407->292|1435->300|1471->307|1503->313|1559->342|1574->348|1631->396|1671->398|1713->413|1728->419|1779->449|1821->464|1836->470|1885->498|1927->513|1942->519|1989->545|2031->560|2046->566|2098->597|2140->611|2217->657|2250->663|2320->706|2353->730|2393->732|2435->746|3064->1348|3118->1386|3158->1388|3208->1410|3270->1445|3285->1451|3309->1454|3372->1490|3387->1496|3415->1503|3478->1539|3493->1545|3525->1556|3588->1592|3603->1598|3627->1601|3690->1637|3705->1643|3754->1671|3817->1707|3832->1713|3865->1725|3928->1761|3943->1767|3992->1795|4055->1831|4070->1837|4100->1846|4163->1882|4178->1888|4208->1897|4290->1948|4336->1966|4884->2483|4917->2489
                  LINES: 18->1|23->2|28->2|30->4|30->4|30->4|31->5|32->6|32->6|32->6|32->6|33->7|33->7|33->7|34->8|35->9|36->10|36->10|36->10|36->10|37->11|37->11|37->11|38->12|38->12|38->12|39->13|39->13|39->13|40->14|40->14|40->14|41->15|42->16|43->17|45->19|45->19|45->19|46->20|61->35|61->35|61->35|62->36|63->37|63->37|63->37|64->38|64->38|64->38|65->39|65->39|65->39|66->40|66->40|66->40|67->41|67->41|67->41|68->42|68->42|68->42|69->43|69->43|69->43|70->44|70->44|70->44|71->45|71->45|71->45|73->47|74->48|89->63|90->64
                  -- GENERATED --
              */
          