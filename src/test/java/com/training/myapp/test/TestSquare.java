package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.SquareNumber;

public class TestSquare {

	@Test
	public void testSquareOfNumberIsCorrect() {
		assertEquals(25, SquareNumber.Square(5));
	}

	@Test
	public void testSquareOfNumberIsIncorrect() {
		assertEquals(26, SquareNumber.Square(5));
	}

}
