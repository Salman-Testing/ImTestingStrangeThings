package org.steps;

import org.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 extends BaseClass {
	
	
	
	@When("User will enter the given URL.")
	public void userWillEnterTheGivenURL() {
		System.out.println("Enter URL");
	    
	}

	@When("User enter username and password in the respected field.")
	public void userEnterUsernameAndPasswordInTheRespectedField() {
		 System.out.println("User name and Password");
	}

	@When("User will click the login button.")
	public void userWillClickTheLoginButton() {
		
		 System.out.println("click btn");
	}

	@Then("User verifies the login functionnality.")
	public void userVerifiesTheLoginFunctionnality() {
		System.out.println("Done Verifying Amazon");
	}

}
