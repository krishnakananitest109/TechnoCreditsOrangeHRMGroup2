package com.technocredits.orangeHRM.pages;

import java.util.Properties;

import com.technocredits.orangeHRM.Base.PredefineMethods;
import com.technocredits.orangeHRM.util.PropertyFileReader;

public class LoginPage extends PredefineMethods{

	static LoginPage loginpageInstance;
	
	Properties loginPageProperties;
	
	/*call initialize method from predefinemethods class to initialize broweser
	 * also pass the properties file name to read properties file*/
	private LoginPage(){
		initialization();
		PropertyFileReader propReader = new PropertyFileReader(); //PropertyFileReader class instance to get file and read file 
		loginPageProperties = propReader.initalizePropertyFile("LoginPageProperties");
	}
	
	/*check if any instance is already created or not ,if not create instance of loginpage class
	 * return object
    */	
	static public LoginPage getInstance() 
	{
		if(loginpageInstance == null){ 
			loginpageInstance = new LoginPage(); 
		}
		return loginpageInstance;
	}
	
	/*get values for the locator from properties file and enter value in filed*/
	public void enterValueForLoginPage(String locator, String value){
		setText(loginPageProperties.getProperty(locator),value);
	}
	
	/*get value for click locator*/	
	public void clickOnLoginPage(String locator){
		click(loginPageProperties.getProperty(locator));  
		
	}	
}
