package com.training.myapp.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.ArmstrongNumberRange;
import com.training.myapp.Exception.InvalidInputException;

public class TestArmstrongBetweenRange {

	@Test
	public void armstrongNumbersBetweenRange() {

		int arr[] = ArmstrongNumberRange.armstrongNumbers();

		int arr1[] = { 153, 370, 371, 407 };
		assertArrayEquals(arr1, arr);

	}

}
