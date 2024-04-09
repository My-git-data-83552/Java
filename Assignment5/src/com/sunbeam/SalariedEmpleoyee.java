package com.sunbeam;

import java.util.Scanner;

public class SalariedEmpleoyee extends Employee {
	private double weeklySalary;

	public SalariedEmpleoyee() {
		// TODO Auto-generated constructor stub
		weeklySalary = 40000;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 40000;

	}

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter the weekly Salary - ");
		weeklySalary=sc.nextDouble();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Weekly salary - "+weeklySalary);
	}
}
