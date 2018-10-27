package com.technocredits.orangeHRM.CONSTANT;

import java.io.File;

public class CONSTANT {
	
	/*Required file paths.
	 * --Ptoperties files
	 * --Drivers files*/

	public static final String PROPERTIES= System.getProperty("user.dir")+ File.separator + "src" + File.separator + "main" + File.separator + "java" +File.separator + "com" + File.separator + "technocredits" + File.separator +"orangeHRM"+File.separator +"config";
    public static final String DRIVERS= System.getProperty("user.dir")+File.separator+"src"+File.separator+"resource";
}
