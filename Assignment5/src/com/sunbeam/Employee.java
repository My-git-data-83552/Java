package com.sunbeam;

import java.util.Scanner;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private int ssn;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, int ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public void accept(Scanner sc) {

		System.out.println("Enter the first name - ");
		firstName = sc.next();
		System.out.println("Enter the last name - ");
		lastName = sc.next();
		System.out.println("Enter the social security number - ");
		ssn = sc.nextInt();
	}

	public void display() {
		System.out.println("first name - "+firstName);
		System.out.println("last name - "+lastName);
		System.out.println("social security number - "+ssn);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public abstract double calculateSalary();
	

}
