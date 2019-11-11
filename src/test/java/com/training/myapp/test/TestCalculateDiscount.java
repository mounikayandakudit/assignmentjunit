package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.PriceCalculation;

public class TestCalculateDiscount {

	@Test
	public void testCalculateNewItemPriceWithDiscount() {

		assertEquals(65.0, PriceCalculation.calculateNewPrice(100.0), 0.01);
	}

}
