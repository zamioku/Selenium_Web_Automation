package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	protected WebDriver driver = null;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/drivers/chromedriver.exe");
		System.out.println("Opening browser: CHROME");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}
	
	@Before("@special")
	public void setUpSpecial() {
		System.out.println("This is a special set-up!");
	}
	
	@After
	public void tearDown(Scenario scenario) {		
		if(scenario.isFailed()){
			System.out.println("Scenario failed: "+scenario.getName());
			//and some additional steps
		}
		System.out.println("Closing browser: CHROME");
		driver.quit();
	}
}
