package com.training.myapp;

public class ArmstrongNumberRange {

	public static int[] armstrongNumbers() {
		int arr[] = new int[4];
		int a = 0;
     //Iterating numbers between 100 and 999
		for (int i = 100; i <= 999; i++) {
			int originalNumber = i;
			int rem = 0;
			int result = 0;
			while (originalNumber != 0) {
				rem = originalNumber % 10;
				result += (rem * rem * rem);
				originalNumber /= 10;
			}

			if (i == result) {
				arr[a] = i;
				a = a + 1;
			}

		}
		return arr;
	}

}
