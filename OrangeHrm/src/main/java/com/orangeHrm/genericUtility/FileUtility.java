package com.orangeHrm.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	//it used to read the data from commondata.properties files based on key which you pass as the argument
	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata/commondata.properties");
		 Properties prop = new Properties();
		 prop.load(fis);
		 String value = prop.getProperty(key);
		 return value;
		 }
	
	
	
	
}
