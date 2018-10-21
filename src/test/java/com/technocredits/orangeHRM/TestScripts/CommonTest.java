package com.technocredits.orangeHRM.TestScripts;

import java.io.IOException;

import com.technocredits.orangeHRM.pages.LoginPage;

//Get instance of Login page to pass the credentials to Method - enterValueForLoginPage and clickButtonOnLoginPage
public class CommonTest {

	void login(String username, String password) throws Exception {
		LoginPage loginPage = LoginPage.getInstance();
		loginPage.enterValueForLoginPage("UnameTextField", username);
		loginPage.enterValueForLoginPage("PassTextField", password);
		loginPage.clickButtonOnLoginPage("LoginButton");
		
	}

}
