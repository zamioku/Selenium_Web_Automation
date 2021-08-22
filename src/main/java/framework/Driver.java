package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

	private static WebDriver _driver;

	public static void setDriver(String type) {
		switch (type) {
			case "chrome":
				_driver = new ChromeDriver();
				_driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				break;
			case "edge":
				// TODO
				break;
			case "firefox":
				break;
			default:
				System.out.println(type + " is not a supported Browser!");
		}
	}
	
	public static WebDriver getDriver() {
		if(_driver == null){
			_driver = new ChromeDriver();
		}
		return _driver;
	}

}
