package com.technocredits.orangeHRM.pages;

import com.technocredits.orangeHRM.base.PredefinedMethods;

public class LoginPage extends PredefinedMethods {

	private static LoginPage loginPage;

	private LoginPage() {

	}

	public static LoginPage getInstance() {
		if (loginPage == null)
			loginPage = new LoginPage();
		return loginPage;
	}

	public void enterValueForLoginPage(String locator, String value) {

		setText(locator, value);
	}
	
	public void clickButtonLoginPage(String locator){
		clickButton(locator);
	}

}
