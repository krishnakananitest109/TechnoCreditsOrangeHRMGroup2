package com.technocredits.orangeHRM.TestScripts;

import com.technocredits.orangeHRM.pages.LoginPage;

public class CommonTest {

	void login(String username, String password) {
		LoginPage loginPage = LoginPage.getInstance();
		loginPage.enterValueForLoginPage("//input[@id='txtUsername']", username);
		loginPage.enterValueForLoginPage("//input[@id='txtPassword']", password);
		loginPage.clickButtonLoginPage("//input[@id='btnLogin']");
	}

}
