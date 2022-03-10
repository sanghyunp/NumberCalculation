package com.demo;

public class NumberCalculation {
	String tmp = "";

	public int add(int x, int y) {
//		return 0;
		return x + y;
	}

	public String convertCase(String str) {
//		return null;
//		return str.toUpperCase(); // or below
		
		for (int i=0; i < str.length(); i++) {  
		// str = hello // ASCII lowerCase 97-121, UpperCase 65-91 // difference 32
			int x = str.charAt(i);
			x = x - 32;
			tmp = tmp + (char)x;
		}
		
		return tmp;
	}
	
}
