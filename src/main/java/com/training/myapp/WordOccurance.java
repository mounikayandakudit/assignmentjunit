package com.training.myapp;

public class WordOccurance {

	public static int noOfOccurances(String[] names, String string) {
		// TODO Auto-generated method stub
		int count = 0;
		//Returning no of occurances
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(string)) {
				count++;
			}

		}
		if (count != 0) {
			return count;
		} else
			return -1;

	}
}
