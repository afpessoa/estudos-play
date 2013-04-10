
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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html>
	<head>
		<title>Zentasks</title>
		<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*4.53*/routes/*4.59*/.Assets.at("images/favicon.png"))),format.raw/*4.91*/("""">
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*5.64*/routes/*5.70*/.Assets.at("stylesheets/login.css"))),format.raw/*5.105*/("""">
	</head>
	<body>
		<header>
			<a href=""""),_display_(Seq[Any](/*9.14*/routes/*9.20*/.Application.index)),format.raw/*9.38*/("""" id="logo"><span>Zen</span>tasks</a>
		</header>
	</body>
</html>"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 10 14:38:56 BOT 2013
                    SOURCE: C:/play/projetos/zentasks/app/views/login.scala.html
                    HASH: 85f6242d88c29631408e33f1836ba0b72b6b9df9
                    MATRIX: 787->0|918->96|932->102|985->134|1087->201|1101->207|1158->242|1241->290|1255->296|1294->314
                    LINES: 29->1|32->4|32->4|32->4|33->5|33->5|33->5|37->9|37->9|37->9
                    -- GENERATED --
                */
            