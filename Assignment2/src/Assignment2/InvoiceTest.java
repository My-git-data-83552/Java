package Assignment2;

import java.util.Scanner;

// Create a class called Invoice that a hardware store might use to represent an invoice for an item
// sold at the store. An Invoice should include four pieces of information as fields—a part number
// (type String), a part description (type String), a quantity of the item being purchased (type int) and a
// price per item (double). Your class should have a constructor
// that initializes the four instance variables. Provide a set and a get method for each instance variable.
// calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
// amount as a double value.
// If the quantity is not positive, it should be set to 0.
// If the price per item is not positive, it should be set to 0.0.
// Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String partDes;
		int quantity;
		double price;
		String partNo;
		double invoice = 0;
		int a;

		do {
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter the part name - ");
			partDes = sc.next();

			System.out.print("Enter the part number - ");
			partNo = sc.next();

			System.out.print("Enter the quantity - ");
			quantity = sc.nextInt();
			if (quantity < 0) {
				quantity = 0;
			}

			System.out.print("Enter the price - ");
			price = sc.nextDouble();
			if (price < 0) {
				price = 0.0;
			}

			Invoice i = new Invoice(partDes, quantity, price, partNo);
			invoice = i.invoiceAmt();

			System.out.println("Do you want to continue - \nYes = 1 \nNo= 0");
			a = sc.nextInt();
			if (a == 0)
				break;

		} while (a != 0);

		System.out.println("The invoice for your order is - " + invoice);

	}
}
