package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruit {

	public Mango() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "name - " + getName() + "\nColor - " + getColor() + "\nweight - " + getWeight();
	}

	public String taste() {
		return "sweet";

	}

	public void accept(Scanner sc) {
		System.out.println("Enter the name of Mango - ");
		setName(sc.next());

		System.out.println("Enter the wight of Mango - ");
		setWeight(sc.nextDouble());

		System.out.println("Enter the color of Mango - ");
		setColor(sc.next());
	}
	public void display()
	{
		System.out.println("Name - "+getName());
		System.out.println("weight - "+getWeight());
		System.out.println("color - "+getColor());
	}
}
