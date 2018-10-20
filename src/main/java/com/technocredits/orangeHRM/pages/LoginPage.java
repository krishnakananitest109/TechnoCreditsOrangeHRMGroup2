package com.technocredits.orangeHRM.pages;

import java.util.Properties;

import com.technocredits.orangeHRM.base.PredefinedMethods;
import com.technocredits.orangeHRM.constant.Constant;
import com.technocredits.orangeHRM.util.PropertyFileReader;

public class LoginPage extends PredefinedMethods {

	public static LoginPage loginPage;
	private static Properties loginLocatorReader;

	/*Constructor to open given browser and create object of Property File reader*/
	private LoginPage() {
		browserInitialiger("chrome");
		PropertyFileReader propLocator = new PropertyFileReader();
		loginLocatorReader = propLocator.readPropertyFile(Constant.LOGINPROPERTIES);

	}

	/*Method to create instance of Login page*/
	public static LoginPage getInstance() {
		if (loginPage == null)
			loginPage = new LoginPage();
		return loginPage;
	}

	/*Method to enter value in Text fields which call Predefine class methods*/
	public void enterValueForLoginPage(String locator, String value) {

		setText(loginLocatorReader.getProperty(locator), value);
	}

	/*Method to click button which call Predefine class methods*/
	public void clickButtonLoginPage(String locator) {
		clickButton(loginLocatorReader.getProperty(locator));
	}

}
