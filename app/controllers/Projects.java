package controllers;

import static play.data.Form.form;

import java.util.ArrayList;

import models.Project;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.projects.group;
import views.html.projects.item;

@Security.Authenticated(Secured.class)
public class Projects extends Controller {

	public static Result add() {
		Project newProject = Project.create(
			"Novo projeto", 
			form().bindFromRequest().get("group"), 
			request().username()
		);
		
		return ok(item.render(newProject));
	}
	
	public static Result rename(Long project) {
		if (Secured.isMemberOf(project)) {
			return ok(
				Project.rename(
					project, 
					form().bindFromRequest().get("name")
				)
			);
		} else {
			return forbidden();
		}
	}
	
	public static Result delete(Long project) {
		if (Secured.isMemberOf(project)) {
			Project.find.ref(project).delete();
			return ok();
		} else {
			return forbidden();
		}
	}
	
	public static Result addGroup() {
		return ok(
			group.render("Novo grupo", new ArrayList<Project>())
		);
	}
	
}
