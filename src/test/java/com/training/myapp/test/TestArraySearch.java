package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.ArraySearch;
import com.training.myapp.Exception.InvalidInputException;

public class TestArraySearch {

	@Test
	public void testElementIsPresent() throws InvalidInputException {
		assertEquals(true, ArraySearch.search(19));
	}

	@Test(expected = InvalidInputException.class)
	public void testElementNotFound() throws InvalidInputException {
		ArraySearch.search(11);
	}
}
