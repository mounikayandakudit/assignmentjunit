package com.training.myapp;

import java.util.Arrays;

public class AbsoluteDifference {

	public static boolean findElements(int[] arr, int k) {
		// TODO Auto-generated method stub
		//to sort array
		Arrays.sort(arr);
		int i = 0;
		int j = 0;
		//traverse the array
		while (i < arr.length && j < arr.length) {
			if (i != j && arr[j] - arr[i] == k) {
				System.out.print("Absolute Different Elements: " + "( " + arr[i] + ", " + arr[j] + " )");
				return true;
			} else if (arr[j] - arr[i] < k)
				j++;
			else
				i++;
		}

		System.out.print("No such elements");
		return false;

	}

}
