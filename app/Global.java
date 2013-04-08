import java.util.List;

import models.User;
import play.Application;
import play.GlobalSettings;
import play.libs.Yaml;

import com.avaje.ebean.Ebean;


public class Global extends GlobalSettings {

	@Override
	public void onStart(Application app) {
		// Checa se o banco de dados está vazio
		if (User.find.findRowCount() == 0) {
			Ebean.save((List<?>) Yaml.load("initial-data.yml"));
		}
	}
	
}
