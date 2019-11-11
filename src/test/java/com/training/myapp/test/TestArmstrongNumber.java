package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.ArmstrongNumber;

public class TestArmstrongNumber {

	@Test
	public void numberIsArmstrongNumber() {
		assertEquals(true, ArmstrongNumber.isArmstrong(153));
	}

	@Test
	public void numberIsNotArmstrongNumber() {
		assertEquals(true, ArmstrongNumber.isArmstrong(154));
	}

}
