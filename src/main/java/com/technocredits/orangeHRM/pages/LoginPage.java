package com.technocredits.orangeHRM.pages;

import java.io.IOException;
import java.util.Properties;

import com.technocredits.orangeHRM.base.PredefinedMethods;
import com.technocredits.orangeHRM.util.PropertyFileReader;

//Services for LoginPage
public class LoginPage extends PredefinedMethods{

	private static LoginPage loginPageInstance;
	Properties reader;
	
	// Initialise the browser and property file in constructor
	private LoginPage() throws IOException {
		inintialisation();
		PropertyFileReader propertyFileReader = new PropertyFileReader();
		reader=propertyFileReader.propReader("LoginPageProperties");
	}
	
	// create a singleton class
	public static LoginPage getInstance() throws IOException
	{
		if (loginPageInstance== null)
		{
			loginPageInstance= new LoginPage();
		}
		
		return loginPageInstance;
	}
	
	//Get locator and its value, pass to SetData method
	public void enterValueForLoginPage(String locator, String value) throws InterruptedException
	{
		setData(reader.getProperty(locator), value);
	}
	
	//Get locator of button and pass to click method
	public void clickButtonOnLoginPage(String locator)
	{
		click(reader.getProperty(locator));
	}


}
