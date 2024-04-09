package com.sunbeam;

import java.util.Scanner;

public class CommisionEmployee extends Employee {
	
	private double grossSales;
	private double commisionRate;

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return commisionRate*grossSales;
	}
	
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter the gross Sales - ");
		grossSales=sc.nextDouble();
		System.out.println("Enter the commision rate - ");
		commisionRate=sc.nextDouble();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Total salary - "+calculateSalary());
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}

	

}
