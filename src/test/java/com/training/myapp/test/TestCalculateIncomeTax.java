package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.IncomeTaxCalculation;

public class TestCalculateIncomeTax {

	@Test
	public void testIncomeTaxAmount() {
		assertEquals(20000.0, IncomeTaxCalculation.calculateIncomeTax(200000.0), 0.01);
	}

	@Test
	public void testIncomeTaxWhenAmountIsNotInRange() {
		assertEquals(0.0, IncomeTaxCalculation.calculateIncomeTax(2000000.0), 0.01);
	}
}
