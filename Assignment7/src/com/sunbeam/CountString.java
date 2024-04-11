package com.sunbeam;

import java.util.Scanner;

public class CountString {

//	public static void main(String[] args) {
//		 String s1 = "abcd def ghi";
//
//		String arr1[] = s1.split(" ");
//		for (String string : arr1)
//			System.out.println(arr1.length);
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string - ");

		String s2 = sc.nextLine();
		String[] srr = s2.split(" ");
		s2.trim();

		System.out.println("Number of String of - " + s2 + " is - " + srr.length);

	}

}
