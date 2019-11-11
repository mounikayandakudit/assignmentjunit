package com.training.myapp.test;

import java.util.LinkedHashSet;

public class DuplicateCharacters {

	public static String remove(String string) {
		 String str = new String(); 
		
	        int len = string.length(); 
	          
	        // loop to traverse the string and 
	        // check for repeating chars using 
	        for (int i = 0; i < len; i++)  
	        { 
	            // character at i'th index of s 
	            char c = string.charAt(i); 
	              
	            // if c is present in str, it returns 
	            // the index of c, else it returns -1 
	            if (str.indexOf(c) < 0) 
	            { 
	                // adding c to str if -1 is returned 
	                str += c; 
	            } 
	            if(str.equals(string)) {
	            	return string;
	            }
	        } 
	          
	        return str; 
	}
	
	
	

}
