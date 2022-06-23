package patternprogramming;

public class Demo_13 {

	public static void main(String[] args) {
		// Showcase of pattern programming
		/**
		 * Pattern
		 	2 4 6 8 10 12 14 16 18 20 
			22 24 26 28 30 32 34 36 38 40 
			42 44 46 48 50 52 54 56 58 60 
			62 64 66 68 70 72 74 76 78 80 
			82 84 86 88 90 92 94 96 98 100 
		 */

		//For rows = 100 numbers/ 10 column = 10 /2 = 5
		int a = 2;
		for (int b = 0; b < 5; b++) {
			for (int c = 0; c < 10; c++) {
				System.out.print(a + " ");
				a += 2;
			}
			System.out.println();
		}

	}

}
