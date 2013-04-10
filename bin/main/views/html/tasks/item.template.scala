
package views.html.tasks

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object item extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Task,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(task: Task):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.14*/("""
<li data-task-id=""""),_display_(Seq[Any](/*2.20*/task/*2.24*/.id)),format.raw/*2.27*/("""">
	<h4>"""),_display_(Seq[Any](/*3.7*/task/*3.11*/.title)),format.raw/*3.17*/("""</h4>
		"""),_display_(Seq[Any](/*4.4*/if(task.dueDate != null)/*4.28*/ {_display_(Seq[Any](format.raw/*4.30*/("""
			<time datetime=""""),_display_(Seq[Any](/*5.21*/task/*5.25*/.dueDate)),format.raw/*5.33*/("""">"""),_display_(Seq[Any](/*5.36*/task/*5.40*/.dueDate.format("MMM dd yyyy"))),format.raw/*5.70*/("""</time>
		""")))})),format.raw/*6.4*/("""

		"""),_display_(Seq[Any](/*8.4*/if(task.assignedTo != null && task.assignedTo.email != null)/*8.64*/ {_display_(Seq[Any](format.raw/*8.66*/("""
			<span class="assignedTo">"""),_display_(Seq[Any](/*9.30*/task/*9.34*/.assignedTo.email)),format.raw/*9.51*/("""</span>
		""")))})),format.raw/*10.4*/("""
</li>"""))}
    }
    
    def render(task:Task): play.api.templates.Html = apply(task)
    
    def f:((Task) => play.api.templates.Html) = (task) => apply(task)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 10 14:38:56 BOT 2013
                    SOURCE: C:/play/projetos/zentasks/app/views/tasks/item.scala.html
                    HASH: 375e386035d19cc1da8c5e3998d19adf44083483
                    MATRIX: 726->1|815->13|871->34|883->38|907->41|951->51|963->55|990->61|1034->71|1066->95|1105->97|1162->119|1174->123|1203->131|1241->134|1253->138|1304->168|1346->180|1387->187|1455->247|1494->249|1560->280|1572->284|1610->301|1653->313
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|33->5|33->5|33->5|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10
                    -- GENERATED --
                */
            