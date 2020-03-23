package com.steps;

import java.io.IOException;

import com.pages.MultiplePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiplePageStep {
	MultiplePage lp=new MultiplePage();
	@Given("^user is going to launches the web application$")
	public void Chrome_Launch_Fail() throws IOException  {
	   
		lp.browser();
	}
	
	@When("^user opens the swaglabs mainpage$")
	public void HomePage_Open_Fail() {
	   
		lp.LoginSwag();
	}
	
	@Then("^user will enter the username and password in the given field$")
	public void UserName_Enter() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lp.UserName();
		
	 
	}
	
	
	
	
	
	@And("^user click on login button,$")
	public void LoginBtn_Click_Fail() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lp. LoginBtn();
	
	}
	
	@Then("^the items are added in to the cart$")
	public void multiple() throws InterruptedException {
		lp.Multiple();
	}
}
