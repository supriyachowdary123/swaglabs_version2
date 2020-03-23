package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageWrngUser {
	WebDriver driver;
	public void Browser_Wrng_User() { 
		System.setProperty("webdriver.chrome.driver",  "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

	public void LoginSwag_Wrng_User() 
	{
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
	}
	
	
	public void UserName_Wrng_User() throws IOException, InterruptedException 
	{
		Thread.sleep(1000);
	//	loginClick.click();
		
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_use");
		
		
	}
	
	public void Password_Wrng_User() throws IOException, InterruptedException 
	{
		Thread.sleep(1000);
	//	loginClick.click();
		
		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
	}
	
	public void LoginBtn_Wrng_User() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		Thread.sleep(3000);
		driver.close(); // close the current tab
	}
	

}
