package patternprogramming;

public class Demo_14 {

	public static void main(String[] args) {
		/**
		 * Print prime numbers 1 to 100
		  2  3  5  7  11  13  17  19  23  29  31  37  41  43  47  53  59  61  67  71  73  79  83  89  97
		 */

		int num = 100;
		for (int j = 2; j <= num; j++) {
			int count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.print(j + "  ");
		}
	}

}
