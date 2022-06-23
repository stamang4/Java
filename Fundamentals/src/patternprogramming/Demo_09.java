package patternprogramming;

public class Demo_09 {

	public static void main(String[] args) {
		// Showcase of pattern programming
		/**
		 * Pattern
		 	2 4 6 8 10 
			12 14 16 18 20 
			22 24 26 28 30 
			32 34 36 38 40 
			42 44 46 48 50 
		 */

		//For number of rows = 50 number/ 5 columns = 10 / 2 = 5
		int a = 2;
		for (int b = 0; b < 5; b++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(a + " ");
				a += 2;
			}
			System.out.println();
		}

	}

}
