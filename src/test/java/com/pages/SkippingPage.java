package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkippingPage {
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
	
	public void Skipping() {
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("hello");
		
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("hii");
		
		
		
	}
	
	
	public void finish() {
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
	}
}
