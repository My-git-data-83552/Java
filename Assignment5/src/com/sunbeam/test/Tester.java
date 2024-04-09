package com.sunbeam.test;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import com.sunbeam.BasePlusCommisionEmployee;
import com.sunbeam.CommisionEmployee;
import com.sunbeam.Employee;
import com.sunbeam.HourlyEmployee;
import com.sunbeam.SalariedEmpleoyee;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Employee e;
		Scanner sc = new Scanner(System.in);

		System.out.print("Which type of employee calculation you want to do? - ");
		choice = sc.nextInt();

		switch (choice) {
		case 0:
			System.out.println("Thank you!");
			break;

		case 1:
			e = new SalariedEmpleoyee();
			e.accept(sc);
			e.display();
			break;

		case 2:
			e = new HourlyEmployee();
			e.accept(sc);
			e.display();
			break;

		case 3:
			e = new CommisionEmployee();
			e.accept(sc);
			e.display();
			break;

		case 4:
			e = new BasePlusCommisionEmployee();
			e.accept(sc);
			e.display();
			BasePlusCommisionEmployee b = (BasePlusCommisionEmployee) e;
			b.SalaryAfterIncreament();
			System.out.println("=====Salary after Reward=====");

			e.display();
			break;

		default:
			System.out.println("Wrong choice...");
			break;
		}
	}

}
