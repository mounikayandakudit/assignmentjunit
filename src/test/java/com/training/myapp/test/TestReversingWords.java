package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.ReverseString;

public class TestReversingWords {

	@Test
	public void printReverseString() {
		String s1 = ReverseString.reverse("Let's take LeetCode contest");
		String s2 = "s'teL ekat edoCteeL tsetnoc ";
		assertEquals(s2, s1);
	}

}
