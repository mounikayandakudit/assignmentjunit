package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.AbsoluteDifference;

public class TestAbsoulteDifferenceInArray {

	@Test
	public void testAbsoulteDifferenceBetweenTwoElements() {
		int[] arr = { 100, 10, 30, 50, 20, 40, 60 };
		assertEquals(true, AbsoluteDifference.findElements(arr, 70));
	}

	@Test
	public void testAbsoulteDifferenceBetweenTwoElementsIsNotFound() {
		int[] arr = { 10, 20, 30, 40, 50, 60, 100 };
		assertEquals(false, AbsoluteDifference.findElements(arr, 120));
	}

}
