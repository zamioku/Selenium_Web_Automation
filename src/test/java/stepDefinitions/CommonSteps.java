package stepDefinitions;

import framework.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CommonSteps {

	/*
	 *	GIVENS
	 */
	@Given("I am on the application Login page")
	public void i_am_on_the_login_page() {
		// navigate to the home page
		Driver.getDriver().get("https://www.saucedemo.com/");
	}

	@Given("^I can login(?: with \"([^\"]*)\")?$")
	public void i_can_login_with(String userName) {
		// login step with optional parameter
	    if(userName != null) {
	    	System.out.println("INFO: Logging in with user: " + userName);
	    } else {
	    	System.out.println("INFO: Invalid user specified");
	    }

		Driver.getDriver().findElement(By.id("user-name")).sendKeys(userName);
		Driver.getDriver().findElement(By.id("password")).sendKeys("secret_sauce");
		Driver.getDriver().findElement(By.id("login-button")).click();
	}

	/*
	 *	WHENS
	 */


	/*
	 *	THENS
	 */

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		Assert.assertTrue("Shopping cart should be displayed!",
				Driver.getDriver().findElement(By.id("shopping_cart_container")).isDisplayed());
		Assert.assertEquals(Driver.getDriver().getTitle(), "Swag Labs");
	}

}
