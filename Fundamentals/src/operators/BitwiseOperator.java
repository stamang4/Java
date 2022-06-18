package operators;

public class BitwiseOperator {
	public static void main(String[] args) {

		// Bitwise &
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a < b & a++ < c); // false
		// Even if first condition is false, it goes to the second condition
		System.out.println(a); // 11

		System.out.println(a > b & a++ > c); // false
		// Both conditions need to be true, if one is false, the statement is false
		System.out.println(a); // 12

		//////////////////////////////////////

		// Bitwise |
		System.out.println(a > b | a++ < c); // true
		// Since first condition is true, it goes to the second condition
		// Only one condition needs to be true, for the statement to be true
		System.out.println(a); // 13
	}

}
