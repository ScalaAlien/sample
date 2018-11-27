
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

"""),format.raw/*5.1*/("""<script type="text/x-template" id="grid-template">
    <table>
        <thead>
        <tr>
            <th v-for="key in columns"
                @click="sortBy(key)"
                :class=""""),format.raw/*11.25*/("""{"""),format.raw/*11.26*/(""" """),format.raw/*11.27*/("""active: sortKey == key """),format.raw/*11.50*/("""}"""),format.raw/*11.51*/("""">
                """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/("""{"""),format.raw/*12.19*/(""" """),format.raw/*12.20*/("""key | capitalize """),format.raw/*12.37*/("""}"""),format.raw/*12.38*/("""}"""),format.raw/*12.39*/("""
                """),format.raw/*13.17*/("""<span class="arrow" :class="sortOrders[key] > 0 ? 'asc' : 'dsc'">
          </span>
            </th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="entry in filteredData">
            <td v-for="key in columns">
                """),format.raw/*21.17*/("""{"""),format.raw/*21.18*/("""{"""),format.raw/*21.19*/("""entry[key]"""),format.raw/*21.29*/("""}"""),format.raw/*21.30*/("""}"""),format.raw/*21.31*/("""
            """),format.raw/*22.13*/("""</td>
        </tr>
        </tbody>
    </table>
</script>

<!-- demo root element -->
<div id="demo">
    <form id="search">
        Search <input name="query" v-model="searchQuery">
    </form>
    <demo-grid
            :data="gridData"
            :columns="gridColumns"
            :filter-key="searchQuery">
    </demo-grid>
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
                  DATE: Tue Nov 27 23:21:30 JST 2018
                  SOURCE: C:/tools/cygwin/home/Kosuke/sources/sample/app/views/index.scala.html
                  HASH: 3cf9200a07f1977e08fecc34de52b8d6f9141f3d
                  MATRIX: 759->1|938->87|965->89|995->111|1034->113|1062->115|1282->308|1311->309|1340->310|1391->333|1420->334|1467->353|1496->354|1525->355|1554->356|1599->373|1628->374|1657->375|1702->392|1978->640|2007->641|2036->642|2074->652|2103->653|2132->654|2173->667
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|35->11|35->11|35->11|35->11|35->11|36->12|36->12|36->12|36->12|36->12|36->12|36->12|37->13|45->21|45->21|45->21|45->21|45->21|45->21|46->22
                  -- GENERATED --
              */
          