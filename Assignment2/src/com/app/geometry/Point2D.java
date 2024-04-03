package com.app.geometry;

import java.util.Scanner;
import java.lang.Math;


public class Point2D {
	private int xaxis;
	private int yaxis;

	public Point2D() {
		// TODO Auto-generated constructor stub
	}

	public Point2D(int xaxis, int yaxis) {
		this.xaxis = xaxis;
		this.yaxis = yaxis;
	}

	public int getxaxis() {
		return xaxis;
	}

	public void setxaxis(int xaxis) {
		this.xaxis = xaxis;
	}

	public int getYaxis() {
		return yaxis;
	}

	public void setYaxis(int yaxis) {
		this.yaxis = yaxis;
	}

	public String getDetails() {
		String details;
		details = xaxis + "," + yaxis;
		return details;
	}

	public boolean isEqual(Point2D p2) {
		if (xaxis == p2.getxaxis() && yaxis == p2.getYaxis())
			return true;
		else
			return false;
	}
	public double distance(Point2D p2)
	{
    double distance = Math.sqrt(this.xaxis * this.yaxis + p2.getxaxis() * p2.getYaxis());
    return distance;
	}

	
	public void accept() {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the point x-y coordinates - ");
		x = sc.nextInt();
		y = sc.nextInt();
		this.xaxis = x;
		this.yaxis = y;
	}
}