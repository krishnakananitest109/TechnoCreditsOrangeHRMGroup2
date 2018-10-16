package com.technocredits.orangeHRM.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PredefinedMethods {

	WebDriver driver;
	public void launchBrowser(String browser){
		if(browser.contains("firefox")){
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		}
	}
	
	public void setText(String locator, String value){

		driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	
	public void clickButton(String locator){
		driver.findElement(By.xpath(locator)).click();
	}
}
