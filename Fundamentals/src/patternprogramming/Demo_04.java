package patternprogramming;

public class Demo_04 {

	public static void main(String[] args) {
		// Showcase of pattern programming
		/**
		 * Pattern
		 	* * * * * 
			* * * * 
			* * * 
			* * 
			* 
		 */
		for (int m = 5; m >= 1; m--) {
			for (int n = m; n >= 1; n--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
