package models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.fakeGlobal;
import static play.test.Helpers.inMemoryDatabase;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import play.libs.Yaml;
import play.test.WithApplication;

import com.avaje.ebean.Ebean;

public class ModelsTest extends WithApplication {

	@Before
	public void setUp() {
		start(fakeApplication(inMemoryDatabase(), fakeGlobal()));
	}
	
	@Test
	public void createAndRetrieveUser() {
		new User("bob@gmail.com", "Bob", "secret").save();
		
		User bob = User.find.where().eq("email", "bob@gmail.com").findUnique();
		assertNotNull(bob);
		assertEquals("Bob", bob.name);
	}
	
	@Test
	public void tryAuthenticateUser() {
		new User("bob@gmail.com", "Bob", "secret").save();
		
		assertNotNull(User.authenticate("bob@gmail.com", "secret"));
		assertNull(User.authenticate("bob@gmail.com", "badpassword"));
		assertNull(User.authenticate("tom@gmail.com", "secret"));
	}
	
	@Test
	public void findProjectsInvolving() {
		new User("bob@gmail.com", "Bob", "secret").save();
		new User("jane@gmail.com", "Jane", "secret").save();
		
		Project.create("Play 2", "play", "bob@gmail.com");
		Project.create("Play 1", "play", "jane@gmail.com");
		
		List<Project> results = Project.findInvolving("bob@gmail.com");
		assertEquals(1, results.size());
		assertEquals("Play 2", results.get(0).name);
	}
	
	@Test
	public void findTodoTasksInvolving() {
		User bob = new User("bob@gmail.com", "Bob", "secret");
		bob.save();
		
		Project project = Project.create("Play 2", "play", "bob@gmail.com");
		
		Task t1 = new Task();
		t1.title = "Write tutorial";
		t1.assignedTo = bob;
		t1.done = true;
		t1.save();
		
		Task t2 = new Task();
		t2.title = "Release next version";
		t2.project = project;
		t2.save();
		
		List<Task> results = Task.findTodoInvolving("bob@gmail.com");
		assertEquals(1, results.size());
		assertEquals("Release next version", results.get(0).title);
	}
	
	@Test
	public void fullTest() {
		Ebean.save((List<?>) Yaml.load("test-data.yml"));
		
		// Contar objetos
        assertEquals(3, User.find.findRowCount());
        assertEquals(7, Project.find.findRowCount());
        assertEquals(5, Task.find.findRowCount());

        // Tentar autenticar usuários
        assertNotNull(User.authenticate("bob@example.com", "secret"));
        assertNotNull(User.authenticate("jane@example.com", "secret"));
        assertNull(User.authenticate("jeff@example.com", "badpassword"));
        assertNull(User.authenticate("tom@example.com", "secret"));

        // Encontrar todos os projetos em que Bob faz parte
        List<Project> bobsProjects = Project.findInvolving("bob@example.com");
        assertEquals(5, bobsProjects.size());

        // Encontrar todas as tarefas a fazer do Bob
        List<Task> bobsTasks = Task.findTodoInvolving("bob@example.com");
        assertEquals(4, bobsTasks.size());
	}
	
}
