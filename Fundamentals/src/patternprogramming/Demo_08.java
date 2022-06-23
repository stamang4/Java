package patternprogramming;

public class Demo_08 {

	public static void main(String[] args) {
		// Showcase of pattern programming
		/**
		 * Pattern
		 	1 3 5 7 9 
			11 13 15 17 19 
			21 23 25 27 29 
			31 33 35 37 39 
			41 43 45 47 49 
		 */
		//For rows = 50 numbers/ 5 columns = 10 / 2 = 5
		int d = 1;
		for (int e = 0; e < 5; e++) {
			for (int f = 0; f < 5; f++) {
				System.out.print(d + " ");
				d += 2;
			}
			System.out.println();
		}

	}

}
