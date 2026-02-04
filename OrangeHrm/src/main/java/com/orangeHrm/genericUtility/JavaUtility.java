package com.orangeHrm.genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRandomNumber() {
		Random ran = new Random();
		int randomnumber = ran.nextInt();
		return randomnumber;
	}

	public String getCurrentDate() {
		Date date = new Date(); 
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		return sdf.format(date);
	}

}
