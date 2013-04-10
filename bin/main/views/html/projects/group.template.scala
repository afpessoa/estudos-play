
package views.html.projects

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
object group extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Project],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(group: String, projects: List[Project]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.42*/("""

<li data-group=""""),_display_(Seq[Any](/*3.18*/group)),format.raw/*3.23*/("""">
	<span class="toggle"></span>
	<h4 class="groupName">"""),_display_(Seq[Any](/*5.25*/group)),format.raw/*5.30*/("""</h4>
	<span class="loader">Loading</span>
	<dl class="options">
		<dt>Options</dt>
		<dd>
			<button class="newProject">New project</button>
			<button class="deleteGroup">Remove group</button>
		</dd>
	</dl>
	<ul>
	"""),_display_(Seq[Any](/*15.3*/projects/*15.11*/.map/*15.15*/ {project =>_display_(Seq[Any](format.raw/*15.27*/(""" 
		"""),_display_(Seq[Any](/*16.4*/views/*16.9*/.html.projects.item(project))),format.raw/*16.37*/("""
	""")))})),format.raw/*17.3*/("""
	</ul>
</li>"""))}
    }
    
    def render(group:String,projects:List[Project]): play.api.templates.Html = apply(group,projects)
    
    def f:((String,List[Project]) => play.api.templates.Html) = (group,projects) => apply(group,projects)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 10 14:38:56 BOT 2013
                    SOURCE: C:/play/projetos/zentasks/app/views/projects/group.scala.html
                    HASH: efb80f60c11e6b22bf7520a9f7195964a8cff024
                    MATRIX: 746->1|863->41|919->62|945->67|1039->126|1065->131|1328->359|1345->367|1358->371|1408->383|1449->389|1462->394|1512->422|1547->426
                    LINES: 26->1|29->1|31->3|31->3|33->5|33->5|43->15|43->15|43->15|43->15|44->16|44->16|44->16|45->17
                    -- GENERATED --
                */
            