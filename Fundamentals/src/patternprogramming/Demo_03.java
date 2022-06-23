package patternprogramming;

public class Demo_03 {

	public static void main(String[] args) {
		// Showcase of pattern programming
		/**
		 * Pattern 
		 * 	1 2 3 4 5 
			1 2 3 4 5 
			1 2 3 4 5 
			1 2 3 4 5 
			1 2 3 4 5 
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
