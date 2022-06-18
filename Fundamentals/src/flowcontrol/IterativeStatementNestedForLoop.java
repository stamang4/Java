package flowcontrol;

public class IterativeStatementNestedForLoop {

	public static void main(String[] args) {
		// Showcase of pattern programming
		/** Pattern 1 
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/** Pattern 2
			1 1 1 1 1 
			1 1 1 1 1 
			1 1 1 1 1 
		 */
		for (int k = 0; k < 3; k++) {
			for (int l = 0; l < 5; l++) {
				System.out.print("1" + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/** Pattern 3
			1 1 1 1 1 
			2 2 2 2 2 
			3 3 3 3 3 
			4 4 4 4 4 
		 */
		int p = 1;
		for (int m = 0; m < 4; m++) {
			for (int n = 0; n < 5; n++) {
				System.out.print(p + " ");
			}
			System.out.println();
			p++;
		}
		
		System.out.println();
		
		
		/** Pattern 4
		 * To find number of rows numbers = 100 numbers/ 10 columns = 10 rows
			1 2 3 4 5 6 7 8 9 10 
			11 12 13 14 15 16 17 18 19 20 
			21 22 23 24 25 26 27 28 29 30 
			31 32 33 34 35 36 37 38 39 40 
			41 42 43 44 45 46 47 48 49 50 
			51 52 53 54 55 56 57 58 59 60 
			61 62 63 64 65 66 67 68 69 70 
			71 72 73 74 75 76 77 78 79 80 
			81 82 83 84 85 86 87 88 89 90 
			91 92 93 94 95 96 97 98 99 100 
		 */
			int a = 1;
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					System.out.print(a + " ");
					a += 1;
				}
				System.out.println();
			}
		
			System.out.println();
			
			/** Pattern 5
			 * To find number of rows numbers = 100 numbers/ 5 columns / 2(for even numbers) = 10 rows
				2 4 6 8 10 12 14 16 18 20 
				22 24 26 28 30 32 34 36 38 40 
				42 44 46 48 50 52 54 56 58 60 
				62 64 66 68 70 72 74 76 78 80 
				82 84 86 88 90 92 94 96 98 100 
			 */
				int d = 2;
				for (int e = 0; e < 10; e++) {
					for (int f = 0; f < 5; f++) {
						System.out.print(d + " ");
						d += 2;
					}
					System.out.println();
				}
			
		
		
	}

}
