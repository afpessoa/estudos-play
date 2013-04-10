
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
object item extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Project,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(project: Project):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

<li data-project=""""),_display_(Seq[Any](/*3.20*/project/*3.27*/.id)),format.raw/*3.30*/("""">
	<a class="name" href="#">"""),_display_(Seq[Any](/*4.28*/project/*4.35*/.name)),format.raw/*4.40*/("""</a>
	<button class="delete" href="#">Delete</button>
	<span class="loader">Loading</span>
</li>"""))}
    }
    
    def render(project:Project): play.api.templates.Html = apply(project)
    
    def f:((Project) => play.api.templates.Html) = (project) => apply(project)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 10 14:38:56 BOT 2013
                    SOURCE: C:/play/projetos/zentasks/app/views/projects/item.scala.html
                    HASH: edc07c85e1b25743d2e2423e15682ba14b7ff256
                    MATRIX: 732->1|827->19|885->42|900->49|924->52|990->83|1005->90|1031->95
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4
                    -- GENERATED --
                */
            