package com.technocredits.orangeHRM.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.technocredits.orangeHRM.constant.Constant;

public class PredefinedMethods {

	static WebDriver driver;

	/*
	 * Method to open browser which provided by user at the time of method
	 * calling
	 */
	public void browserInitialiger(String browser) {
		if (browser.contains("chrome")) {
			System.setProperty("webdriver.gecko.driver", Constant.FIREFOXDRIVER);
			driver = new FirefoxDriver();
		} else if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", Constant.CHROMEDRIVER);
			driver = new ChromeDriver();
		}
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	/*Method to perform rnter text in a text field*/
	public void setText(String locator, String value) {

		driver.findElement(By.xpath(locator)).sendKeys(value);
	}

	/*Method to click on any button*/
	public void clickButton(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
}
