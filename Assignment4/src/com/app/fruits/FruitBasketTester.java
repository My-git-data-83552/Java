package com.app.fruits;

import java.util.Scanner;

public class FruitBasketTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int choice;
		int size;
		System.out.print("What size of basket do you want? - ");
		size = sc.nextInt();
		Fruit basket[] = new Fruit[size];

		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits in the basket.");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale");
			System.out.print("Enter your choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you!");
				break;

			case 1:
				if (counter < size)
					basket[counter] = new Mango();
				basket[counter].accept(sc);
				counter++;
				break;

			case 2:
				if (counter < size)
					basket[counter] = new Orange();
				basket[counter].accept(sc);
				counter++;
				break;

			case 3:
				if (counter < size)
					basket[counter] = new Apple();
				basket[counter].accept(sc);
				counter++;
				break;

			case 4:

				for (int i = 0; i < counter; i++) {
					if (basket[i] != null)
						System.out.println(basket[i].getName());
				}
				break;

			case 5:
				for (Fruit element : basket) {
					if (element != null) {
						System.out.println(element.toString());
						System.out.println(element.isFresh());
						System.out.println(element.taste());

					}
				}
				break;

			case 6:
				for (Fruit element : basket)
					if (element.isFresh() == false) {
						System.out.println(element.getName());
						System.out.println(element.taste());
					}
				break;

			case 7:
				System.out.print("Which fruit is stale? - ");
				counter = sc.nextInt();
				if (counter < size)
					basket[counter].setFresh(false);
				else
					System.out.println("Invalid Index number...");
				break;

			case 8:
				for (Fruit ele : basket)
					if (ele.taste() == "sour" || ele.taste() == "sweet and sour") {
						ele.setFresh(false);
						System.out.println(ele.getName());
					}
				break;

			default:
				System.out.println("CDAC");
				break;
			}

		} while (choice != 0);
	}

}
