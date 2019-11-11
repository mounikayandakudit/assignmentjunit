package com.training.myapp.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.training.myapp.ArmstrongNumberRange;
import com.training.myapp.ArrayBubbleSort;

public class TestBubbleSort {

	@Test
	public void testBubbleSort() {

		int arr[] = ArrayBubbleSort.bubbleSort();

		int arr1[] = { 1, 5, 6, 7, 12, 14, 19, 23, 26, 35, 37, 47, 52, 78, 86 };
		assertArrayEquals(arr1, arr);
	}

}
