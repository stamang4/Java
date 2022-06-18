package flowcontrol;

import java.util.Scanner;

public class IterativeStaementForLoop {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		for (int i = 1; i <= number; ++i)
			System.out.println(i);

		int j = 0;
		for (System.out.println("Initialization"); j <= number; System.out.println("Increment or Decrement 1")) {
			System.out.println(j);
			++j;
		}

		int k = 0;
		for (System.out.println("Initialization1"); k <= number; System.out.println("Increment or Decrement 2"), ++k)
			System.out.println(k);

		// Initialization we can write more than one values
		// Condition only one
		// Increment or Decrement section more than one values
		int l;
		for (l = 0, System.out.println("Initialization3"); l <= number; System.out.println("Increment or Decrement 3"), ++l)
			System.out.println(l);

	}

}
