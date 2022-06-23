package patternprogramming;

public class Demo_11 {

	public static void main(String[] args) {
		// Showcase of pattern programming
		/**
		 * Pattern 
		 	A B C D E F 
			G H I J K L 
			M N O P Q R 
			S T U V W X
		 */
		
		//For rows = 26 letters/ 6 column = 4
		char alphabet = 'A'; 
		for (int b = 0; b < 4; b++) {
			for (int c = 0; c < 6; c++) {
				System.out.print(alphabet  + " ");
				alphabet++;
			}
			System.out.println();
		}

	}

}
