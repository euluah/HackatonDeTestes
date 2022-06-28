package stepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import static utils.Utils.*;

import java.net.MalformedURLException;

public class Hooks {
	
	@Before()
	public void setUp() throws MalformedURLException {
		acessarKeep();
	}
	
	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
		capturarTela(scenario);
		driver.quit();
	}
	
}
