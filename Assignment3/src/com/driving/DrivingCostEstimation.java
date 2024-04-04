package com.driving;

//Q2. Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.
public class DrivingCostEstimation {

	double totalmiles;

	double galloncost;
	double averagecost;

	double parkingfees;
	double tollfees;

	public DrivingCostEstimation() {
		// TODO Auto-generated constructor stub
	}

	public DrivingCostEstimation(double totalmiles, double galloncost, double averagecost, double parkingfees,
			double tollfees) {
		super();
		this.totalmiles = totalmiles;
		this.galloncost = galloncost;
		this.averagecost = averagecost;
		this.parkingfees = parkingfees;
		this.tollfees = tollfees;
	}

	public double getAveragecost() {
		return averagecost;
	}

	public void setAveragecost(double averagecost) {
		this.averagecost = averagecost;
	}

	public double getTotalmiles() {
		return totalmiles;
	}

	public void setTotalmiles(double totalmiles) {
		this.totalmiles = totalmiles;
	}

	public double getGalloncost() {
		return galloncost;
	}

	public void setGalloncost(double galloncost) {
		this.galloncost = galloncost;
	}

	public double getParkingfees() {
		return parkingfees;
	}

	public void setParkingfees(double parkingfees) {
		this.parkingfees = parkingfees;
	}

	public double getTollfees() {
		return tollfees;
	}

	public void setTollfees(double tollfees) {
		this.tollfees = tollfees;
	}

	public double calculateCostEstimation() {
		return ((totalmiles / galloncost) * averagecost) + tollfees + parkingfees;
		
	}

}
