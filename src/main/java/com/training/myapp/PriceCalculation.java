package com.training.myapp;

public class PriceCalculation {

	public static double calculateNewPrice(double newItem) {
		// TODO Auto-generated method stub
		//calculating new price
		double discount = newItem * 35 / 100;
		double newPrice = newItem - discount;
		System.out.println(newPrice);
		return newPrice;
	}

}
