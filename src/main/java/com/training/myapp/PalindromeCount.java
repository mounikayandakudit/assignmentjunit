package com.training.myapp;

public class PalindromeCount {

	public static int descOfPalindrome(String string) {
		// TODO Auto-generated method stub
		String reverse = new StringBuffer(string).reverse().toString(); 
		  
	    // check whether the string is palindrome or not 
	    if (string.equals(reverse)) 
	    {
	    	 static int reverse(char[] a)  
	    { 
	        int i, n = a.length; 
	        char t; 
	        for (i = 0; i < n / 2; i++)  
	        { 
	            t = a[i]; 
	            a[i] = a[n - i - 1]; 
	            a[n - i - 1] = t; 
	        } 
	    }
	    }
	    else
	      System.out.println("No");
		
		return 1;
	}
	
	

}
