package com.training.myapp;

public class IncomeTaxCalculation {

	public static double calculateIncomeTax(double amount) {
		
		
		//calculating tax with specified income tax percentage
		double tax =0;
		if(amount>=1 && amount<=180000)
		{
			 tax=0;
		}
		 if(amount>=181001 && amount<=300000) {
			tax= amount*10/100;

		}
		 if(amount>=300001 && amount<=500000) {
			tax= amount*20/100;
		 
		}
		if(amount>=500001 && amount<=1000000) {
			tax=amount*30/100;
			
		}


		return tax;
	}
	

}
