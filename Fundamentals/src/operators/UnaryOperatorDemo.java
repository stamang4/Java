package operators;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		int x = 1;
		int y = ++x; // pre-increment
		System.out.println(x); // 2
		System.out.println(y); // 2

		x = 2;
		y = x++; // post-increment
		System.out.println(x); // 3
		System.out.println(y); // 2

		System.out.println(-y); // -2 (as a string)
		System.out.println(--y); // 1 pre-decrement
		System.out.println(y); // 1

		// System.out.println(y-); //error
		System.out.println(y--); // 1 post-decrement
		System.out.println(y); // 0

		// System.out.println(10++); //Can't increment values

		// System.out.println(true++); //Can't increment boolean

		char number = 1;
		System.out.println(number++); // 
		System.out.println(+number); // 2
		System.out.println(number--); // 
		System.out.println(-number); // -1

		char one = '5';
		System.out.println(+one); // 53
		System.out.println(one++); // 5
		System.out.println(+one); // 54
		System.out.println(one--); // 6
		System.out.println(-one); // -53

		char alphabet = 'a';
		System.out.println(alphabet++); // a
		System.out.println(+alphabet); // 98
		System.out.println(alphabet--); // b
		System.out.println(-alphabet); // -97

		double doubleDataType = 99;
		System.out.println(doubleDataType++); // 99.0
		System.out.println(+doubleDataType); // 100.0
		System.out.println(doubleDataType--); // 100.0
		System.out.println(-doubleDataType); // -99.0

		byte byteDataType = 99;
		System.out.println(byteDataType++); // 99.0
		System.out.println(+byteDataType); // 100.0
		System.out.println(byteDataType--); // 100.0
		System.out.println(-byteDataType); // -99.0

		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a); // 10+12 = 22
		System.out.println(b++ + b++); // 10+11 = 22

	}

}
