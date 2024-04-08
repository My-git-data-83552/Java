package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruit {

	public void accept(Scanner sc) {
		System.out.println("Enter the name of Orange - ");
		setName(sc.next());

		System.out.println("Enter the wight of Orange - ");
		setWeight(sc.nextDouble());

		System.out.println("Enter the color of Orange - ");
		setColor(sc.next());
	}

	public void display() {
		System.out.println("Name - " + getName());
		System.out.println("weight - " + getWeight());
		System.out.println("color - " + getColor());
	}

	@Override
	public String toString() {
		return "name - " + getName() + "\nColor - " + getColor() + "\nweight - " + getWeight();
	}

	public String taste() {
		return "sour";

	}
}
