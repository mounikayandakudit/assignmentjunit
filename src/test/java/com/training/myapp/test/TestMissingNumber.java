package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.MissingNumber;

public class TestMissingNumber {

	@Test
	public void testMissingNumber() {
		int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int number = MissingNumber.missingNumber(arr);
		assertEquals(8, number);
	}

}
