package flowcontrol;

public class SelectionStatementFacts {

	public static void main(String[] args) {
		if (!true)
			System.out.println("Inside if statement1");
		else
			System.out.println("Inside else statement1"); // this is printed

		if (false == false)
			System.out.println("Inside if statement2"); // this is printed
		else
			System.out.println("Inside else statement2");

		// This gives an compilation error
		// Condition always check if statement is true of false
		// i.e. should be a boolean not an integer
		/*
		 * int x = 10; if (x) System.out.println("Inside if statement3"); else
		 * System.out.println("Inside else statement3");
		 */

		int x = 10;
		if (x == 10)
			System.out.println("Inside if statement4"); // this is printed
		else
			System.out.println("Inside else statement4");

		// Due to the ; statement5 is printed
		// ; marks the end of statement after if condition
		if (x != 10)
			;
		System.out.println("Inside if statement5");

		if (x != 10)
			System.out.println("Inside if statement6");
		else
			System.out.println("Inside else statement6");// this is printed

		/*
		 * if (x == 10) int z = 90; //Gives compilation error //We can't declare a
		 * variable right after if condition without the braces //Thus add enclosure
		 * with the braces else System.out.println("Inside if statement7");
		 */

		if (x == 10) {
			int z = 90; //if condition will enter here
		} else
			System.out.println("Inside if statement8");

	}

}
