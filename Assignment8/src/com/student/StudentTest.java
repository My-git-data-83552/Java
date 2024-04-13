package com.student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		int choice;
		StudentEntity[] arr = new StudentEntity[5];
		arr[0] = new StudentEntity(1, "Shantanu", "New York", 101);
		arr[1] = new StudentEntity(2, "Ganesh", "Antartica", 89);
		arr[2] = new StudentEntity(3, "Shubham", "China", 76);
		arr[3] = new StudentEntity(4, "Sahil", "London", 78);
		arr[4] = new StudentEntity(5, "Anand", "San Fransisco", 67);

		do {
			System.out.println("=================================");
			System.out.println("0. Exit");
			System.out.println("1. sorted on their city (asc)");
			System.out.println("2. sorted on their on marks (desc)");
			System.out.println("3. sorted on their on name (asc)");

			System.out.println("Enter your choice - ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you!");
				break;

			case 1: {
				class StudentCompare implements Comparator<StudentEntity> {

					@Override
					public int compare(StudentEntity q1, StudentEntity q2) {
						int v = q1.getCity().compareTo(q2.getCity());
						return v;
					}
				}
				StudentCompare s = new StudentCompare();
				Arrays.sort(arr, s);
				for (StudentEntity studentEntity : arr) {
					System.out.println(studentEntity);
				}
				break;
			}
			case 2: {
				class StudentCompare implements Comparator<StudentEntity> {
					@Override
					public int compare(StudentEntity q1, StudentEntity q2) {
						int v = Double.compare(q2.getMarks(), q1.getMarks());
						return v;
					}
				}
				StudentCompare s = new StudentCompare();
				Arrays.sort(arr, s);
				for (StudentEntity studentEntity : arr) {
					System.out.println(studentEntity);
				}
				break;
			}

			case 3: {
				class StudentCompare implements Comparator<StudentEntity> {

					@Override
					public int compare(StudentEntity q1, StudentEntity q2) {
						int v = q1.getName().compareTo(q2.getName());
						return v;
					}
				}
				StudentCompare s = new StudentCompare();
				Arrays.sort(arr, s);
				for (StudentEntity studentEntity : arr) {
					System.out.println(studentEntity);
				}
				break;
			}
			default:
				System.out.println("Wrong choice...");
				break;
			}
		} while (choice != 0);
	}

}
