package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep 
{
	@When("I enter username")
	public void enterusername()
	{
		System.out.println("Entering username");
	}
	
	@Given("I am at login page")
	public void goToLoginPage()
	{
		System.out.println("Given statement");
	}
	
	@When("I enter password")
	public void enteringPassword()
	{
		System.out.println("Entering password");
	}
	@When("I click on login button")
	public void loginToApp()
	{
		System.out.println("clicking on login button");

	}
	@Then("I should get logged into application")
	public void validateLogin()
	{
		System.out.println("Validating login");
	}

}
