package stepDefinitions;

import cucumber.api.java.en.Given;

public class CommonSteps {

	@Given("^I can login(?: with \"([^\"]*)\")?$")
	public void i_can_login_with(String userName) {
		// login step with optional parameter
	    if(userName != null) {
	    	System.out.println("INFO: Logging in with user: " + userName);
	    } else {
	    	System.out.println("INFO: No user specified");
	    }
		
	}
	
}
