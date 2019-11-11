package com.training.myapp;

public class ReverseString {

	public static String reverse(String s) {
		// TODO Auto-generated method stub
		
		String[] words = s.split(" ");

		String reverseString = "";
       //Iteration over string
		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}

			reverseString = reverseString + reverseWord + " ";

		}
		return reverseString;

	}
}
