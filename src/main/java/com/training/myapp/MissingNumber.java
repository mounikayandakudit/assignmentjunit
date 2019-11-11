package com.training.myapp;

import java.util.Arrays;

public class MissingNumber {

	public static int missingNumber(int[] nums) {
		//sorting array
		Arrays.sort(nums);
		//Finding missing number
		int l = 0, r = nums.length;
		while (l < r) {
			int m = (l + r) / 2;
			if (nums[m] > m) {
				r = m;
			} else {
				l = m + 1;
			}
		}

		return r;
	}

}
