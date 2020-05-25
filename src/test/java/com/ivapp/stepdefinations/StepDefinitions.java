 package com.ivapp.stepdefinations;

import com.ivapp.pageobjects.BasePage;
import com.ivapp.pageobjects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions extends BasePage{
	
	LoginPage loginPage = new LoginPage(driver);	
	
	@Given("^I am in login screen$")
	public void iAmInLoginScreen() throws Exception {
	  
	}

	@When("^I enter \"([^\"]*)\", \"([^\"]*)\"$")
	public void iEnter(String arg1, String arg2) throws Exception {
		loginPage.enterUserName(arg1);
		loginPage.enterPassword(arg2);
	   
	}

	@Then("^I click login button$")
	public void iClickLoginButton() throws Exception {
		loginPage.clickLoginButton();
	    
	}

	@Then("^I see home page of the applcation$")
	public void iSeeHomePageOfTheApplcation() throws Exception {
	   
	}
  

  
}
