package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	private static WebDriver driver;
	
	public void setDriver(String type) {
		// TODO
	}
	
	public static WebDriver getDriver() {
		if(driver == null){
			driver = new ChromeDriver();
		}
		return driver;
	}

}
