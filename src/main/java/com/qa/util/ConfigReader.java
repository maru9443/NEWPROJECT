package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	public Properties initProp() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\config\\config.properties");
		prop.load(fis);
		
		return prop;
		
	}

}
