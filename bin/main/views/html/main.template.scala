
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Project],Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projects: List[Project])(body: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""

<html>
	<head>
		<title>Zentasks</title>
		<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.53*/routes/*6.59*/.Assets.at("images/favicon.png"))),format.raw/*6.91*/("""">
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.64*/routes/*7.70*/.Assets.at("stylesheets/main.css"))),format.raw/*7.104*/("""">
		<script src=""""),_display_(Seq[Any](/*8.17*/routes/*8.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*8.68*/("""" type="text/javascript"></script>
	</head>
	<body>
		<header>
			<a href=""""),_display_(Seq[Any](/*12.14*/routes/*12.20*/.Application.index)),format.raw/*12.38*/("""" id="logo"><span>Zen</span>tasks</a>
		</header>
		<nav>
			<h4 class="dashboard">
				<a href="#/">Dashboard</a>
			</h4>
			<ul id="projects">
				"""),_display_(Seq[Any](/*19.6*/projects/*19.14*/.groupBy(_.folder).map/*19.36*/ {/*20.6*/case (group, projects) =>/*20.31*/ {_display_(Seq[Any](format.raw/*20.33*/("""
						"""),_display_(Seq[Any](/*21.8*/views/*21.13*/.html.projects.group(group, projects))),format.raw/*21.50*/("""
					""")))}})),format.raw/*23.6*/("""
			</ul>
		</nav>
		<section id="main">"""),_display_(Seq[Any](/*26.23*/body)),format.raw/*26.27*/("""</section>
	</body>
</html>"""))}
    }
    
    def render(projects:List[Project],body:Html): play.api.templates.Html = apply(projects)(body)
    
    def f:((List[Project]) => (Html) => play.api.templates.Html) = (projects) => (body) => apply(projects)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 10 14:38:56 BOT 2013
                    SOURCE: C:/play/projetos/zentasks/app/views/main.scala.html
                    HASH: 70bf893e503e2478643a8ef6b7987bf2a395ee46
                    MATRIX: 734->1|848->38|978->133|992->139|1045->171|1146->237|1160->243|1216->277|1270->296|1284->302|1350->347|1462->423|1477->429|1517->447|1703->598|1720->606|1751->628|1761->636|1795->661|1835->663|1878->671|1892->676|1951->713|1990->726|2067->767|2093->771
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|40->12|40->12|40->12|47->19|47->19|47->19|47->20|47->20|47->20|48->21|48->21|48->21|49->23|52->26|52->26
                    -- GENERATED --
                */
            