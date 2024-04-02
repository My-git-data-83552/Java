//3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dose
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.
//(No need of any class, and no need to display the food details. Only display the total of order
//food)

import java.util.Scanner;

public class Assignment1_3 {
	public static void main(String[] args) {
		int choice;
		int amount = 0;
		int order = 0;

		do {
			System.out.println("\n======Breakfast Menu======");
			System.out.println("0. Generate Bill");
			System.out.println("1. Dosa");
			System.out.println("2. Samosa");
			System.out.println("3. Idli");
			System.out.println("Your choice - ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Generate Bill");
				break;
			case 1:
				System.out.println("Dosa is Rs. 90/-");
				amount += 90;
				order++;
				break;
			case 2:
				System.out.println("Samosa is Rs. 30/-");
				amount += 30;
				order++;
				break;
			case 3:
				System.out.println("Idli is Rs. 100/-");
				amount += 100;
				order++;
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}

		} while (choice != 0);
		System.out.println("Total orders - " + order);
		System.out.println("Total Amount - " + amount);

	}
}
