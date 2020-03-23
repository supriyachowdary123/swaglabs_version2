package com.steps;

import java.io.IOException;

import com.pages.CountPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CountStep {
	CountPage lp=new CountPage();
	@Given("^we need to launch the web application in chrome browser$")
	public void Chrome_Launch_Fail() throws IOException  {
	   
		lp.browser();
	}
	
	@When("^opening the swaglabs page using the url$")
	public void HomePage_Open_Fail() throws IOException, InterruptedException {
	   lp.UserName();
		
	}
	
	@Then("^we need to enter the user name and password and login to the next page$")
	public void UserName_Enter() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		lp.LoginBtn();	
		
		
	 
	}
	
	
	@Then("^count the no of image tags in a page$")
	public void count() {
		lp.imageTags();
		
	}
	
	
	

}
