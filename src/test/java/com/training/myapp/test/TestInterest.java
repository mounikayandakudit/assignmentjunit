package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.Interest;

public class TestInterest {

	@SuppressWarnings("deprecation")
	@Test
	public void simpleInterest() {
		assertEquals(2500, Interest.simple(10000, 5, 5), 0.02);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void compoundInterest() {
		assertEquals(12762.81, Interest.compound(10000, 5, 5), 0.02);
	}

}
