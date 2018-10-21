package com.technocredits.orangeHRM.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.technocredits.orangeHRM.config.Constant;


public class PropertyFileReader {
	
	//Function to read property file. The file name is passed to this function to read the specific file and return its object.
	public Properties propReader(String fileName) throws IOException
	{
		//File file =new File("H:\\Workspace\\OrangeHRM\\src\\main\\java\\com\\technocredits\\ohrm\\config\\LoginPageProperties.properties");
		File file =new File(Constant.filePath + fileName + ".properties");
		FileInputStream fs = new FileInputStream(file);
		Properties prop =new Properties();
		prop.load(fs);
		System.out.println(prop.getProperty("UnameTextField"));
		return prop;
	}

}
