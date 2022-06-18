package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int min = (a > b) ? a : b;
		System.out.println(min); // 5

		String num = (10 % 2 == 0) ? "Even" : "Odd";
		System.out.println(num); // Even
	}

}
