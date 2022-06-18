package operators;

public class ShiftOperator {
	public static void main(String[] args) {
		// Left-Shift Operator
		System.out.println(10 << 2); // 10*2^2 = 10*4 = 40
		System.out.println(10 << 3); // 10*2^3 = 10*8 = 80
		System.out.println(20 << 1); // 20*2^1 = 20*2 = 40
		System.out.println(15 << 3); // 15*2^3 = 15*8 = 120

		// Right-Shift Operator
		System.out.println(10 >> 2); // 10/2^2 = 10/4 = 2
		System.out.println(10 >> 3); // 10/2^3 = 10/8 = 1
		System.out.println(20 >> 1); // 20/2^1 = 20/2 = 10
		System.out.println(15 >> 3); // 15/2^3 = 15/8 = 1

	}

}
