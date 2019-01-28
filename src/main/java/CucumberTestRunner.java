import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		features="src/test/resources/Features", 
//		glue = "src/test/java/StepDefinitions", 
		junit = "--step-notifications",
				monochrome=true,
		plugin = {"pretty", "html:target/cucumber-html-report/"},
		tags = { "@special" }
		)
public class CucumberTestRunner {
	
	

}
