package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruit {

	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public void accept(Scanner sc) {
		System.out.println("Enter the name of Apple - ");
		setName(sc.next());

		System.out.println("Enter the wight of Apple - ");
		setWeight(sc.nextDouble());

		System.out.println("Enter the color of Apple - ");
		setColor(sc.next());
	}
	public void display()
	{
		System.out.println("Name - "+getName());
		System.out.println("weight - "+getWeight());
		System.out.println("color - "+getColor());
	}
	

	@Override
	public String toString() {
		return "name - " + getName() + "\nColor - " + getColor() + "\nweight - " + getWeight();
	}

	public String taste() {
		return "sweet n sour";

	}
}
