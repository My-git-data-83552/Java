package com.sunbeam;

import java.util.Scanner;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;
	
	
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter the hourly wage - ");
		wage=sc.nextDouble();
		
		System.out.println("Enter the number of hours - ");
		hours=sc.nextDouble();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Total salary - "+calculateSalary());
	}
	
	@Override
	public double calculateSalary() {
			
		// TODO Auto-generated method stub
		if(hours<=40)
			return wage*hours;
		else if(hours>40)
		{
			return (40*wage)+(hours-40)*(wage*1.5);
		}
		else
			return 0.0;
		
	}
	
	
	
		
}
