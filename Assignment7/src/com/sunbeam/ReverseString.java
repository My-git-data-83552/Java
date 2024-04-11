package com.sunbeam;

public class ReverseString {

	public static void main(String[] args) {
		String name = "1234321";
		String rev = "";

		int length = name.length();
		
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		if (name.equals(rev))
			System.out.println(rev + " Is Palindrome");
		else
			System.out.println(rev + " Not palindrome");
	}
}
