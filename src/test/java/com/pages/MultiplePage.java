package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplePage {
	WebDriver driver;
	public void browser() { 
		System.setProperty("webdriver.chrome.driver",  "D:\\ctsjavaexamples\\SWAGLAB_PROJECT\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

	public void LoginSwag() 
	{
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
	}
	
	
	public void UserName() throws IOException, InterruptedException 
	{
		Thread.sleep(1000);
	//	loginClick.click();
		
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		
	}
	
	
	
	public void LoginBtn() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		Thread.sleep(3000);
		
	}
	
	public void Multiple() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
	}

}
