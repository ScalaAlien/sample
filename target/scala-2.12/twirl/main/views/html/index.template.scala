
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Show],MessagesProvider,Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(show: Form[Show])(implicit messagesProvider: MessagesProvider, flash: Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main(Messages("Home"))/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
"""),format.raw/*4.1*/("""<form method="POST" action="/beacons/show">
    <div class="form-row">
        <div class="col-md-2 mb-3">
            <label for="date_start">start_date</label>
            <input type="datetime" class="form-control" id="date_start" placeholder="date_start">
        </div>
        <div class="col-md-2 mb-3">
            <label for="date_end">end_date</label>
            <input type="datetime" class="form-control" id="date_end" placeholder="date_end">
        </div>
        <div class="col-md-2 mb-3">
            <label for="serial">serial</label>
            <input type="text" class="form-control" id="serial" placeholder="serial">
        </div>
        <div class="col-md-2 mb-3">
            <label for="ble_address">ble_address</label>
            <input type="text" class="form-control" id="ble_address" placeholder="ble_address">
        </div>
    </div>
    <button class="btn btn-primary" type="submit">submit_form</button>
</form>

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
                  DATE: Sat Dec 01 13:40:55 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/index.scala.html
                  HASH: 9c5e91e48a9248174f71b4910da43ae35dfb1b08
                  MATRIX: 785->1|980->103|1007->105|1037->127|1076->129|1103->130
                  LINES: 22->1|27->2|28->3|28->3|28->3|29->4
                  -- GENERATED --
              */
          