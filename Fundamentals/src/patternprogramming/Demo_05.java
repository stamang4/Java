package patternprogramming;

public class Demo_05 {

	public static void main(String[] args) {
		// Showcase of pattern programming
		/**
		 * Pattern
		 	* 
			* * 
			* * * 
			* * * * 
			* * * * *
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
