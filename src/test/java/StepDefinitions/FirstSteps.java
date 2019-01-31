package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstSteps {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("INFO: Do something!");
//	    throw new cucumber.api.PendingException();
	}

	@Given("^some other precondition$")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("some other action")
	public void some_other_action() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("yet another action")
	public void yet_another_action() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("I want to write a step with the {string} name")
	public void i_want_to_write_a_step_with_name(String name) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I check for the step number {int}")
	public void i_check_for_the_in_step(Integer value) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("I verify the {string} status of the step")
	public void i_verify_the_success_in_step(String status) {
	    // Write code here that turns the phrase above into concrete actions
	}
	
}
