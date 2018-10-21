package com.technocredits.orangeHRM.Base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.technocredits.orangeHRM.CONSTANT.CONSTANT;

public class PredefineMethods {

	WebDriver driver;
	/*initialize the driver for broweser it will open the broweser
	 * after driver get open hit the mention link 
	 * it will maximize the broweser
	 * it will wait till all element on page will get load*/
	public void initialization(){
		
	//System.setProperty("webdriver.chrome.driver",".\\src\\resource\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver",CONSTANT.DRIVERS + File.separator + "chromedriver.exe");
	driver=new ChromeDriver(); 
	driver.get("https://opensource-demo.orangehrmlive.com/"); 
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);		
}

	/*Find element and pass value for locator.locator will get path*/
public void setText(String locator, String value)
{
	    driver.findElement(By.xpath(locator)).sendKeys(value); 
}
/*Find element to click.*/ 
public void click(String locator)
{
	
	driver.findElement(By.xpath(locator)).click();
	
}
}


