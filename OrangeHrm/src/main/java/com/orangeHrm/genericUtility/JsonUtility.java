package com.orangeHrm.genericUtility;

import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtility {
	
	//getDataFromJson
	
	public String getDataFromJson(String key) throws IOException {
		//load the file
		FileReader filereader = new FileReader("./src/test/resources/commondata/commondata2.json");
		
		ObjectMapper objectmapper = new ObjectMapper();
	JsonNode jsondata = objectmapper.readTree(filereader);

	// using get()===> get the key values
		String value = jsondata.get(key).asText();
		return value;
		
	}
	

}
