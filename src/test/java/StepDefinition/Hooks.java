package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks {

	@BeforeAll
	public static void dbConnections() {
		System.out.println("@BeforeAll --> dbConnections");
	}

	@Before("@select")
	public void setup() {
		System.out.println("@Before --> Launching Browser");
	}

	@After("@select")
	public void teadDown() {
		System.out.println("@After --> Exiting Browser");
	}

	@AfterAll
	public static void closeConnections() {
		System.out.println("@AfterAll --> closeConnections");
	}

}
