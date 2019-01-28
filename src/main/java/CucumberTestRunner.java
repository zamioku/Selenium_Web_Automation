import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit = "--step-notifications",
		features="src/test/resources/Features", 
		plugin={"pretty", "html:target/cucumber-html-report/"},
//		glue = "src/test/java/StepDefinitions", 
		tags={"@tag"}
		)
public class CucumberTestRunner {
	
	

}
