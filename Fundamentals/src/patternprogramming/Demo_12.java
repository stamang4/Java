package patternprogramming;

public class Demo_12 {
	public static void main(String[] args) {
		// Showcase of pattern programming
		/**
		 * Pattern 
		 	A B C D E 
			A B C D E 
			A B C D E 
			A B C D E 
			A B C D E 
			A B C D E
		 */

		// For rows = 26 letters/ 6 column = 4

		for (int i = 0; i < 6; i++) {
			for (char alphabet = 'A'; alphabet <= 'E'; alphabet++) {
				System.out.print(alphabet + " ");
			}
			System.out.println();
		}

	}
}
