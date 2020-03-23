package com.steps;

import java.io.IOException;

import com.pages.LogOut;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogOutPageStep {
	LogOut lp=new LogOut();
	@Given("^user is launching  web application$")
	public void Chrome_Launch_Fail() throws IOException  {
	   
		lp.browser();
	}
	
	@When("^user opens the SwagLabs home page$")
	public void HomePage_Open_Fail() {
	   
		lp.LoginSwag();
	}
	
	@Then("^the user enters username and password$")
	public void UserName_Enter() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lp.UserName();
		
	 
	}
	
	
	
	
	
	@And("^the user clicks the login button$")
	public void LoginBtn_Click_Fail() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lp. LoginBtn();
	
	}

	@Then("^the user clicks on the menu button$")
	public void MenuBtn() throws InterruptedException {
		lp.MenuBtn();
	}
	
	@And("^the user clicks on logout button$")
	public void logout() throws InterruptedException {
		lp.LogoutBtn();
	}

}
