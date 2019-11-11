package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

import com.training.myapp.FormatDate;

public class TestDateFormat {

	@Test
	public void testDateFormat() throws ParseException {

		assertEquals("09/July/2019", FormatDate.dateFormat("09,07,2019"));

	}
}