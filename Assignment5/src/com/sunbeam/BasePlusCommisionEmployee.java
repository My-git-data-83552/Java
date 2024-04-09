package com.sunbeam;

import java.util.Scanner;

public class BasePlusCommisionEmployee extends CommisionEmployee {

	private double baseSalary;

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return ((getCommisionRate() * getGrossSales()) + baseSalary);
	}

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter the base salary - ");
		baseSalary = sc.nextDouble();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
//		System.out.println("Total salary - "+calculateSalary());
	}

	public void SalaryAfterIncreament() {
		setBaseSalary((1 + 0.1) * baseSalary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

}
