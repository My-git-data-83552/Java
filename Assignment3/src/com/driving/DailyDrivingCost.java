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
			System.out.println("1. Total miles driven per day");
			System.out.println("2. Cost per gallon of gasoline.");
			System.out.println("3. Average miles per gallon");
			System.out.println("4. Parking fees per day");
			System.out.println("5. Tolls per day.");
			System.out.println("6. Estimate cost per day");
			System.out.println("Enter your choice - ");

			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you!");
				break;
			case 1:
				System.out.println("Enter Total miles driven per day - ");
				d.setTotalmiles(sc.nextDouble());
				break;

			case 2:
				System.out.println("Enter Cost per gallon of gasoline - ");
				d.setGalloncost(sc.nextDouble());
				break;

			case 3:
				System.out.println("Average miles per gallon = ");
				d.setAveragecost(sc.nextDouble());
				break;

			case 4:
				System.out.println("Parking fees per day - ");
				d.setParkingfees(sc.nextDouble());
				break;
			case 5:
				System.out.println("Tolls per day - ");
				d.setTollfees(sc.nextDouble());
				break;
				
			case 6:
				System.out.println("The Driving cost for Today is - "+d.calculateCostEstimation());
				
				break;

			default:
				System.out.println("Wrong choice");
				break;
			}

		} while (choice != 0);
	}

}
