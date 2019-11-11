package com.training.myapp;

public class ArrayBubbleSort {

	static int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };

	public static int[] bubbleSort() {
		// TODO Auto-generated method stud
		int n = arr.length;
		int temp = 0;
		//Iterating the array
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

		return arr;
	}

}
