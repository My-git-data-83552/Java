package com.app.geometry;

public class TestPoint {

	public static void main(String[] args) {
		Point2D p1 = new Point2D(2, 4);
		p1.accept();

		Point2D p2 = new Point2D();
		p2.accept();

		System.out.println("The x-y cords are - " + p1.getDetails());
		System.out.println("The x-y cords are - " + p2.getDetails());

		if (p1.isEqual(p2))
			System.out.println("p1 & p2 are at same position");
		else {
			System.out.println("p1 & p2 are not at same position");
			System.out.println("Distance between p1 & p2 = " + p1.distance(p2));

		}
	}
}
