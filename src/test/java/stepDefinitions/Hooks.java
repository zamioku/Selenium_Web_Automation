package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	protected WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/drivers/chromedriver.exe");
		System.out.println("INFO: Opening browser - CHROME");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
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
		driver.quit();
	}
}
