package com.library;

import java.util.*;

public class BookTester {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		Set<BookLibrary> b1 = new HashSet<>();

		do {
			System.out.println("\n==============Book Library==============");
			System.out.println("1. Accept book details and add in collection");
			System.out.println("2. Display all books from collection");
			System.out.println("3. Sort the book details as per category and display it.");
			System.out.println("4. Sort the book details as per author and display it.");
			System.out.println("5. Find book by id.");
			System.out.print("Enter your choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you!");
				break;
			case 1:
				BookLibrary b = new BookLibrary();
				b.accept(sc);
				b1.add(b);
				break;

			case 2:
				for (BookLibrary bookLibrary : b1) {
					System.out.println(bookLibrary);
				}
				break;

			case 3:
				class AuthorNameCompare implements Comparator<BookLibrary> {

					@Override
					public int compare(BookLibrary o1, BookLibrary o2) {
						return o1.getEcat().compareTo(o2.getEcat());
					}
				}
				Comparator<BookLibrary> a1 = new AuthorNameCompare();
				List<BookLibrary> l2 = new ArrayList<>(b1);
				Collections.sort(l2, a1);
				for (BookLibrary bookLibrary : l2) {
					System.out.println(bookLibrary);
				}
				break;

			case 4:
				class AuthorNameCompare implements Comparator<BookLibrary> {

					@Override
					public int compare(BookLibrary o1, BookLibrary o2) {
						return o1.getAuthorName().compareTo(o2.getAuthorName());
					}
				}
				Comparator<BookLibrary> a = new AuthorNameCompare();
				List<BookLibrary> l1 = new ArrayList<>(b1);
				Collections.sort(l1, a);
				for (BookLibrary bookLibrary : l1) {
					System.out.println(bookLibrary);
				}
				break;

			case 5:
				System.out.println("Enter the id of the book - ");
				String find = sc.next();
				BookLibrary b2 = new BookLibrary();
				b2.setIsbn(find);

				if (b1.contains(b2))
					System.out.println("Book fetched - \n" + b1.toString());
				else
					System.out.println("Book does not exist");
				break;

			default:
				System.out.println("Wrong choice...");
				break;
			}

		} while (choice != 0);

	}

}
