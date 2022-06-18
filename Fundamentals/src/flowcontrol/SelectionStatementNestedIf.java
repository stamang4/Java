package flowcontrol;

import java.util.Scanner;

public class SelectionStatementNestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks : ");

		int marks = sc.nextInt();

		if (marks >= 90) {
			if (marks == 100)
				System.out.println("Extra bonus will be added");
			else
				System.out.println("Partial extra bonus will be added");
		} else if (marks >= 80 && marks <= 90)
			System.out.println(marks + "is B Grade");
		else if (marks >= 70 && marks <= 80)
			System.out.println(marks + "is C Grade");
		else
			System.out.println(marks + "is below average");

	}

}
