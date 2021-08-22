package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		features="src/test/resources/features", 
		glue = "stepDefinitions", 
//		junit = "--step-notifications",
		monochrome=true,
		plugin = {"pretty", "html:target/cucumber-html-report/"},
		tags = "@login and not @special"
		)
public class RunCucumberTest {	

}
