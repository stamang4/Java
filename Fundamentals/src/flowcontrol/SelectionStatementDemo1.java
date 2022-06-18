package flowcontrol;

import java.util.Scanner;

public class SelectionStatementDemo1 {

	public static void main(String[] args) {
		// Check for odd or even number
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");

		int number = sc.nextInt();

		if (number % 2 == 0)
			System.out.println(number + "is even number.");
		else
			System.out.println(number + "is odd number.");

		// Check if the year is a leap year
		System.out.println("Enter the year : ");

		int year = sc.nextInt();

		if (year % 4 == 0)
			System.out.println(year + "is leap year.");
		else
			System.out.println(year + "is not a leap year.");

	}

}
