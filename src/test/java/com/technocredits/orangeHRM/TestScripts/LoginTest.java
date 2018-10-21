package com.technocredits.orangeHRM.TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;


//This is the test case layer
// All common actions related to login functionality are present in CommonTest class so we extends this class and pass the login credentiaLs
public class LoginTest extends CommonTest {
	
	@Test
	public void doLogin() throws Exception
	{
		login("admin", "admin123");
	}

}
