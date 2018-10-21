package com.technocredits.orangeHRM.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedMethods {
	
WebDriver driver;
	// Initialise the browser, hit the URL, maximize the browser and wait until page loads
	public void inintialisation()
	{	System.setProperty("webdriver.chrome.driver", "H:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	//Selenium code is written here to enter data into text fields on login page
	public void setData (String locator, String value) throws InterruptedException
	{	
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	
	//Selenium code is written here to click button on login page
	public void click (String Locator)
	{
		driver.findElement(By.xpath(Locator)).click();
	}

}
