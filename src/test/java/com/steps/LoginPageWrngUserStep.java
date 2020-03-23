package com.steps;

import java.io.IOException;

import com.pages.LoginPageWrngUser;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageWrngUserStep {
	LoginPageWrngUser lp=new LoginPageWrngUser();
	@Given("^user is launching into the webapplication,$")
	public void Chrome_Launch_Fail() throws IOException  {
	   
		lp.Browser_Wrng_User();
	}
	
	@When("^the user opening Swaglabs Homepage,$")
	public void HomePage_Open_Fail() {
	   
		lp.LoginSwag_Wrng_User();
	}
	
	@Then("^the user enters the wrong username ,$")
	public void UserName_Enter() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lp.UserName_Wrng_User();
	 
	}
	
	@And("^the user enters password,$")
	public void Password_Enter_Fail() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lp.Password_Wrng_User();
	 
	}
	
	
	
	@Then("^click on the login button user will not navigate to the next page,$")
	public void LoginBtn_Click_Fail() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lp.LoginBtn_Wrng_User();
	
	}

}
