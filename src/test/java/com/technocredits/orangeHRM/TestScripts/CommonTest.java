package com.technocredits.orangeHRM.TestScripts;

import com.technocredits.orangeHRM.pages.LoginPage;

public class CommonTest{

	/*Comman method to do perform Login*/
	void login(String username, String password) {
		LoginPage loginPage = LoginPage.getInstance();
		loginPage.enterValueForLoginPage("loginPageUsername", username);
		loginPage.enterValueForLoginPage("loginPagePassword", password);
		loginPage.clickButtonLoginPage("loginPageSubmit");
	}

}
