package flowcontrol;

import java.util.Scanner;

public class SelectionStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");

		int age = sc.nextInt();

		// if statements
		if (age == 18)
			System.out.println("You are just 18");

		// if-else statements
		if (age > 18)
			System.out.println("You are eligible");
		else
			System.out.println("You are a minor");

	}

}
