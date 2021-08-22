package stepDefinitions;

import framework.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
//	protected WebDriver driver = null;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/drivers/chromedriver.exe");
		System.out.println("INFO: Opening browser - CHROME");
		Driver.setDriver("chrome");
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().get("https://google.com");
	}
	
	@Before("@special")
	public void setUpSpecial() {
		System.out.println("INFO: This is a special set-up!");
	}
	
	@After("@special")
	public void tearDownSpecial(){
		//TODO
	}
	
	@After
	public void tearDown(Scenario scenario) {		
		if(scenario.isFailed()){
			System.out.println("Scenario failed: "+scenario.getName());
			//TODO: take screenshot
		}
		System.out.println("INFO: Closing browser - CHROME");
		Driver.getDriver().quit();
	}
}
