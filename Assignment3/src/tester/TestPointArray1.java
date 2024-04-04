package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {

		Point2D[] points;
		int choice;
		int count;
		int index;
		int index1;
		int index2;
		Scanner sc = new Scanner(System.in);
		System.out.println("how many no of points to plot - ");
		count = sc.nextInt();
		points = new Point2D[count];
		for (int i = 0; i < count; i++) {

			points[i] = new Point2D();
			points[i].accept();
		}
		do {

			System.out.println("1. Display details of a specific point");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. User i/p : 2 indices for the points , validate the indices");
			System.out.println("4. Exit");
			System.out.println("Enter your choice - ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter the index : ");
				index = sc.nextInt();
				System.out.print("Point at index " + index + " is - ");
				System.out.println(points[index].getDetails());
				break;

			case 2:
				for (Point2D element : points)
					System.out.println(element.getDetails());

			case 3: {
				System.out.println("Enter the index 1 - ");
				index1 = sc.nextInt();
				if (!(0 <= index1 && index1 <= count - 1)) {
					System.out.println("Invalid index");
					break;
				}

				System.out.println("Enter the index 2 - ");
				index2 = sc.nextInt();
				if (!(0 <= index1 && index1 < count - 1)) {
					System.out.println("Invalid index");
					break;
				}

				if (points[index1].isEqual(points[index2]))
					System.out.println("p1 & p2 are at same position");
				else {
					System.out.println("index1 & index2 are not at same position");
					System.out.println("Distance between index1 & index2 = " + points[index1].distance(points[index2]));
					break;
				}
			}
			case 4:
				System.out.println("Thank you");
				break;

			default:
				System.out.println("Wrong choice");
				break;
			}

		} while (choice != 4);
	}
}
