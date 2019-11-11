package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.Palindrome;

public class TestPalindrome {

	@Test
	public void checkPalindromeInteger() {
		assertEquals(true, Palindrome.checkPalindrome("121"));
	}

	@Test
	public void checkPalindromeIntegerWithSign() {
		assertEquals(false, Palindrome.checkPalindrome("-121"));
	}
}
