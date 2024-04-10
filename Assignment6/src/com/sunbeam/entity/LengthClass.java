package com.sunbeam.entity;

import java.util.Scanner;

import com.sunbeam.exception.ExceptionLineTooLong;

public class LengthClass {
	private static String line;

	public void acceptData(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string name - ");
		line = sc.next();
		if (calculateLength() > 80)
			throw new ExceptionLineTooLong("The string is too long");
	}

	public int calculateLength() {
		return line.length();

	}

}
