package com.driving;

import java.util.Scanner;

public class DailyDrivingCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrivingCostEstimation d = new DrivingCostEstimation();
		int choice;

		do {
			System.out.println("\n=====Daily Driving Cost Estimation Application=====");
			System.out.println("0. Exit");
			System.out.println("1. Enter the details");
			System.out.println("2. Estimate cost per day");
			System.out.println("Enter your choice - ");

			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you!");
				break;

			case 1:
				d.accept();
				break;

			case 2:
				d.display();
				System.out.println("\nThe Driving cost for Today is - " + d.calculateCostEstimation());
				break;

			default:
				System.out.println("Wrong choice");
				break;
			}

		} while (choice != 0);
	}

}
