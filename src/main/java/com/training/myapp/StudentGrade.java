package com.training.myapp;

public class StudentGrade {

	public static String calculateGrade(int a, int b, int c) {
		// TODO Auto-generated method stub
		//returning grades based on marks
		if (a > 60 && b > 60 && c > 60) {
			return "Passed";
		} else if ((a > 60 && b > 60 && c < 60) || (a > 60 && b < 60 && c > 60) || (a > 60 && b > 60 && c < 60))
			return "Promoted";

		else
			return "Failed";

	}
}
