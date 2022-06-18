package operators;

public class LogicalOperator {

	public static void main(String[] args) {

		// Logical &&
		int a = 10;
		int b = 5;
		int c = 20;

		System.out.println(a < b && a++ < c); // false
		// Since first condition is false, it never goes to the second condition
		System.out.println(a); // 10

		System.out.println(a > b && a++ < c); // true
		// Both conditions need to be true, if one is false, the statement is false
		System.out.println(a); // 11

		//////////////////////////////////////
		
		// Logical ||
		System.out.println(a > b || a++ < c); // true
		// Since first condition is true, it doesn't go to the second condition
		// Only one condition needs to be true, for the statement to be true
		System.out.println(a); // 11
	}

}
