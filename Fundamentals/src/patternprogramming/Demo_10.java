package patternprogramming;

public class Demo_10 {

	public static void main(String[] args) {
		// Showcase of pattern programming
		/**
		 * Pattern
		 	1 4 7 10 13 
			16 19 22 25 28 
			31 34 37 40 43
		 */

		//For number of rows = 50 number/ 5 columns = 10 / 3 = 3
		int a = 1;
		for (int b = 0; b < 3; b++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(a + " ");
				a += 3;
			}
			System.out.println();
		}

	}

}
