package variables;

public class StaticDemoFour {

	int i; // non-static variable
	static int j;

	public static void main(String[] args) {
		StaticDemoFour sdf = null;
		// Reference variable once have a null cannot access non-static variables and
		// methods
		// If we are accessing then it generates null pointer exception
		// sdf.i = 25;
		// System.out.println(sdf.i); //25

		sdf.j = 35;
		System.out.println(sdf.j); // 35 - Static variable can get value from object reference
		System.out.println(j); // 35 - Static variable can get value directly
		StaticDemoFour sdf1 = new StaticDemoFour();
		sdf1.i = 10;
		StaticDemoFour sdf2 = new StaticDemoFour();
		System.out.println(sdf2.i); // 0
		sdf2.j = 204;
		System.out.println("s2 = " + sdf2.j); // 204
		System.out.println("s2 = " + sdf1.j); // 204 - static variable gets the latest value, doesn't matter the
		StaticDemoFour sdf3 = null;		     // different object reference
		System.out.println("s3 = " + sdf3.j); // 204

	}

}
