package operators;

public class AssignmentOperator {
	public static void main(String[] args) {
		int a = 10;
		a += 3; 
		System.out.println(a); //13
		a -= 4;
		System.out.println(a); //9
		a *= 4;
		System.out.println(a); //36
		a /= 2;
		System.out.println(a); //18
		a %= 2;
		System.out.println(a); //0
	}

}
