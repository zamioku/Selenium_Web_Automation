package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	protected static WebDriver driver;
	
	public void setDriver(String type) {
		// TODO
	}
	
	protected WebDriver getDriver() {
		if(driver == null){
			driver = new ChromeDriver();
		}
		return driver;
	}

}
