package com.training.myapp;

public class ArmstrongNumber {

	public static boolean isArmstrong(int i) {
		// TODO Auto-generated method stub

		int x, a = 0;
//iterating the loop
		while (i != 0) {
			x = i % 10;
			a = a + (x * x * x);
			i /= 10;
		}
		return true;
	}

}
