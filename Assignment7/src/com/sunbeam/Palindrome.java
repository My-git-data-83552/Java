package com.sunbeam;

public class Palindrome {
	public static void main(String[] args) {
		String name = "987654321";
		String rev = "";

		int length = name.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		 System.out.println("reverse string is - \n"+rev);
		
	}
}
