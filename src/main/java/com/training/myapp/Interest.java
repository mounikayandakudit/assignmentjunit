package com.training.myapp;

public class Interest {
	
	
	//calculation for simpleinterest
	public static double simple(int principal, int time, int rate) {
		
		double sim = (principal * time * rate) / 100;
		return sim;
	}
  //calculation for compoundInterst
	public static double compound(int principal, int time, int rate) {
		// TODO Auto-generated method stub
		double com = principal * Math.pow(1.0 + rate / 100.0, time);
		return com;
	}

}
