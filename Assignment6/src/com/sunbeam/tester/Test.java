package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.entity.LengthClass;
import com.sunbeam.exception.ExceptionLineTooLong;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LengthClass l = new LengthClass();
			Scanner sc = new Scanner(System.in);
			l.acceptData(sc);
			l.calculateLength();
		} catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
	}
}
