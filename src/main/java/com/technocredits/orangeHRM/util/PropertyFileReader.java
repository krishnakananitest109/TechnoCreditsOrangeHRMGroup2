package com.technocredits.orangeHRM.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	/*Method to read value from Property file*/
	Properties propertiesRedear;
	public Properties readPropertyFile(String path){
		File file = new File(path);
		try {
			FileInputStream readFile = new FileInputStream(file);
			propertiesRedear = new Properties();
				propertiesRedear.load(readFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propertiesRedear;
		
	}
}
