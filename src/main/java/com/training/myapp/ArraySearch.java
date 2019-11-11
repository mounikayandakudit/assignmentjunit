package com.training.myapp;

import com.training.myapp.Exception.InvalidInputException;

public class ArraySearch {

	static int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };

	public static boolean search(int key) throws InvalidInputException {
		// TODO Auto-generated method stub
		//searching the key
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == key) {
				return true;
			}

		}
		return false;

	}
}
