package controllers;

import static play.data.Form.form;
import models.Project;
import models.Task;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.index;
import views.html.login;

public class Application extends Controller {
	
	@Security.Authenticated(Secured.class)
    public static Result index() {
        return ok(
        	index.render(
    			Project.findInvolving(request().username()), 
    			Task.findTodoInvolving(request().username()),
    			User.find.byId(request().username()))
    	);
    }
    
    public static Result login() {
    	return ok(
    		login.render(form(Login.class))
    	);
    }
    
    public static Result authenticate() {
    	Form<Login> loginForm = form(Login.class).bindFromRequest();
    	if (loginForm.hasErrors()) {
    		return badRequest(login.render(loginForm));
    	} else {
    		session().clear();
    		session("email", loginForm.get().email);
    		return redirect(
    			routes.Application.index()
			);
    	}
    }
    
    public static class Login {
    	public String email;
    	public String password;
    	
    	public String validate() {
			if (User.authenticate(email, password) == null) {
				return "Login ou senha inválidos";
			}
			return null;
        }
    }
    
    public static Result logout() {
    	session().clear();
    	flash("success", "Você realizou logout com sucesso!");
    	return redirect(
			routes.Application.login()
		);
    }
  
}
