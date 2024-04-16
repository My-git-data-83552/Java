package com.library;

import java.util.Objects;
import java.util.Scanner;

enum Ecategory {
	ADVENTURE, AUTOBIOGRAPHY, FANTASY, HORROR, MYSTERY, SCIFI;
}

public class BookLibrary implements Comparable<BookLibrary> {

	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	private Ecategory ecat;

	public BookLibrary() {
		// TODO Auto-generated constructor stub
	}

	public BookLibrary(String isbn) {
		// TODO Auto-generated constructor stub
		this.isbn = isbn;
	}

	public Ecategory acceptCategory() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0. ADVENTURE,\n 1. AUTOBIOGRAPHY,\n 2. FANTASY,\n 3. HORROR,\n 4. MYSTERY,\n 5. SCIFI");

		System.out.print("Enter your choice - ");
		int choice = sc.nextInt();
		switch (choice) {
		case 0:
			ecat = ecat.ADVENTURE;
			break;
		case 1:
			ecat = ecat.AUTOBIOGRAPHY;
			break;
		case 2:
			ecat = ecat.FANTASY;
			break;
		case 3:
			ecat = ecat.HORROR;
			break;
		case 4:
			ecat = ecat.MYSTERY;
			break;

		case 5:
			ecat = ecat.SCIFI;
			break;
		}
		return ecat;

	}

	public BookLibrary(String isbn, double price, String authorName, int quantity, Ecategory ecat) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
		this.ecat = ecat;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter the ISBN of book - ");
		isbn = sc.next();
		System.out.println("Enter the category - ");
		ecat = acceptCategory();

		System.out.println("Enter the Author name - ");
		authorName = sc.next();
		System.out.println("Enter the quantity - ");
		quantity = sc.nextInt();
		System.out.println("Enter the price - ");
		price = sc.nextDouble();

	}

	public void display() {
		System.out.println("ISBN of book - " + isbn);
		System.out.println("Author name - " + authorName);
		System.out.println("Quantity - " + quantity);
		System.out.println("Price - " + price);
	}

	@Override
	public String toString() {
		return "BookLibrary [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity="
				+ quantity + ", ecat=" + ecat + "]";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Ecategory getEcat() {
		return ecat;
	}

	public void setEcat(Ecategory ecat) {
		this.ecat = ecat;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		BookLibrary other = (BookLibrary) obj;
//		return Objects.equals(authorName, other.authorName) && Objects.equals(isbn, other.isbn)
//				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
//	}

	@Override
	public int compareTo(BookLibrary o) {
		return this.isbn.compareTo(o.isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookLibrary other = (BookLibrary) obj;
		return Objects.equals(isbn, other.isbn);
	}

}
