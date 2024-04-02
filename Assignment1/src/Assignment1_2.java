//2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods

import java.util.Scanner;

public class Assignment1_2 {

	public static void main(String[] args) {
		double dnum1;
		double dnum2;
		double avg;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter double value = ");

//		dnum1=sc.nextDouble();
//		dnum2=sc.nextDouble();

		if (sc.hasNextDouble()) {
			dnum1 = sc.nextDouble();
			if (sc.hasNextDouble()) {
				dnum2 = sc.nextDouble();

				avg = (dnum1 + dnum2) / 2;
				System.out.println("Average of both numbers = " + avg);
			} else

				System.out.println("Error - The entered values are not of type double");

		} else {
			System.out.println("Error - The entered values are not of type double");

		}

	}

}
