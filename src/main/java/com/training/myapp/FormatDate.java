package com.training.myapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {

	

	public static Object dateFormat(String dateInput) throws ParseException {
		String inputPattern = "dd,MM,yyyy";
		String outputPattern = "dd/MMMM/yyyy";

		SimpleDateFormat sdf = new SimpleDateFormat(inputPattern);
		Date date = sdf.parse(dateInput);
		//coverting date to the specified pattern
		sdf.applyPattern(outputPattern);
		String str = sdf.format(date);

		return str;
	}

}
