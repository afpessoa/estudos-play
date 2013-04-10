
package views.html

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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Project],List[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projects: List[Project], todoTasks: List[Task]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.50*/(""" 

"""),_display_(Seq[Any](/*3.2*/main(projects)/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""

	<header>
		<hgroup>
			<h1>Dashboard</h1>
			<h2>Tasks over all projects</h2>
		</hgroup>
	</header>
	
	<article class="tasks">
		"""),_display_(Seq[Any](/*13.4*/todoTasks/*13.13*/.groupBy(_.project).map/*13.36*/ {/*14.4*/case (project, tasks) =>/*14.28*/ {_display_(Seq[Any](format.raw/*14.30*/("""
				<div class="folder" data-folder-id=""""),_display_(Seq[Any](/*15.42*/project/*15.49*/.id)),format.raw/*15.52*/("""">
					<header>
						<h3>"""),_display_(Seq[Any](/*17.12*/project/*17.19*/.name)),format.raw/*17.24*/("""</h3>
					</header>
					<ul class="list">
						"""),_display_(Seq[Any](/*20.8*/tasks/*20.13*/.map/*20.17*/ { task =>_display_(Seq[Any](format.raw/*20.27*/("""
							"""),_display_(Seq[Any](/*21.9*/views/*21.14*/.html.tasks.item(task))),format.raw/*21.36*/("""
						""")))})),format.raw/*22.8*/("""
					</ul>
				</div>
			""")))}})),format.raw/*26.4*/("""
	</article>
	
""")))})))}
    }
    
    def render(projects:List[Project],todoTasks:List[Task]): play.api.templates.Html = apply(projects,todoTasks)
    
    def f:((List[Project],List[Task]) => play.api.templates.Html) = (projects,todoTasks) => apply(projects,todoTasks)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 10 14:38:56 BOT 2013
                    SOURCE: C:/play/projetos/zentasks/app/views/index.scala.html
                    HASH: 29bc5cbafb4b024af427c31ab47898e3d40954bb
                    MATRIX: 741->1|866->49|906->55|928->69|967->71|1146->215|1164->224|1196->247|1206->255|1239->279|1279->281|1358->324|1374->331|1399->334|1465->364|1481->371|1508->376|1597->430|1611->435|1624->439|1672->449|1717->459|1731->464|1775->486|1815->495|1877->530
                    LINES: 26->1|29->1|31->3|31->3|31->3|41->13|41->13|41->13|41->14|41->14|41->14|42->15|42->15|42->15|44->17|44->17|44->17|47->20|47->20|47->20|47->20|48->21|48->21|48->21|49->22|52->26
                    -- GENERATED --
                */
            