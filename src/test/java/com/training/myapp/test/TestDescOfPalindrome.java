package com.training.myapp.test;

import com.training.myapp.PalindromeCount;

public class TestDescOfPalindrome {
	
    @Test
    public void testDescOfPalindromeAndCount() {
    	assertEquals(true,PalindromeCount.descOfPalindrome("malayalam"));
    }

}
