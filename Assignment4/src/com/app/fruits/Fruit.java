package com.app.fruits;

import java.util.Objects;
import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;

	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String taste() {
		return "no specific taste";

	}

	public void accept(Scanner sc) {
		System.out.println("Enter the name of fruit - ");
		name = sc.next();
		System.out.println("Enter the wight of fruit - ");
		weight = sc.nextDouble();
		System.out.println("Enter the color of fruit - ");
		color = sc.next();
	}
	
	public void display()
	{
		System.out.println("Name - "+name);
		System.out.println("weight - "+weight);
		System.out.println("color - "+color);
	}
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

}
