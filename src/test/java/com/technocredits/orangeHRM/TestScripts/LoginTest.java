package com.technocredits.orangeHRM.TestScripts;

import org.testng.annotations.Test;

public class LoginTest extends CommonTest {

	@Test
	/*Test to check user able to login*/
	public void loginCheck(){
		login("Admin","admin123");
	}
}
