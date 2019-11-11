package com.training.myapp;

public class Palindrome {

	public static boolean checkPalindrome(String i) {
		// TODO Auto-generated method stub
		String reverse = new StringBuffer(i).reverse().toString();

		// check whether the string is palindrome or not
		if (i.equals(reverse)) {
			System.out.println("Yes");
			return true;
		}
		System.out.println("No");
		return false;
	}

}
