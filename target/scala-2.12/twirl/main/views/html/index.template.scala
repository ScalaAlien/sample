
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[MessagesProvider,Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit messagesProvider: MessagesProvider, flash: Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main(Messages("Home"))/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<div class="cover">
    <div class="cover-inner">
        <div class="cover-contents">
            <h1>素敵なモノと出会う場所</h1>
        </div>
    </div>
</div>

<div class="container">
    テスト
</div>

""")))}))
      }
    }
  }

  def render(messagesProvider:MessagesProvider,flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(messagesProvider,flash,request)

  def f:(() => (MessagesProvider,Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (messagesProvider,flash,request) => apply()(messagesProvider,flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Nov 19 23:57:16 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/index.scala.html
                  HASH: 2d855c006ceb84a8df06fda4879459c928efff32
                  MATRIX: 759->1|938->87|965->89|995->111|1034->113|1062->115
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5
                  -- GENERATED --
              */
          