package com.steps;

import java.io.IOException;

import com.pages.RemovePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RemoveStep {
	RemovePage lp=new RemovePage();
	@Given("^user launching the web application$")
	public void Chrome_Launch_Fail() throws IOException  {
	   
		lp.browser();
	}
	
	@When("^user opening SwagLabs home page$")
	public void HomePage_Open_Fail() {
	   
		lp.LoginSwag();
	}
	
	@Then("^user entering username and password$")
	public void UserName_Enter() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lp.UserName();
		
	 
	}
	
	
	
	
	
	@And("^user clicking the login button$")
	public void LoginBtn_Click_Fail() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lp. LoginBtn();
	
	}
	
	@Then("^user adds item into cart and clicks on cart button$")
	public void cartBtn() throws InterruptedException {
		lp.CartBtn();
	}
	
	
	@Then("^user clicks on remove button$")
	
		public void remove() throws InterruptedException {
		lp.Remove();
			
		}
	
	@And("^user clicks on continue shopping button$")
	public void Continue_Shopping() throws InterruptedException {
		lp.Continue();
			
		}
	

}
