package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	private WebDriver _driver;
	
	public void setDriver(String type) {
		switch (type) {
			case "chrome":
				_driver = new ChromeDriver();
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
	
	public WebDriver getDriver() {
		if(_driver == null){
			_driver = new ChromeDriver();
		}
		return _driver;
	}

}
