package variables;

public class LocalVariables {

	// JVM will assign default values to the non-static and static variables
	int nonStaticA, nonStaticB = 900;
	static int staticA, staticB = 800;
	// nonStaticA = 400; //can't do modifications outside methods
	// System.out.println(new LocalVariables().nonStaticA); //Can't do these outside
	// of methods

	public static void main(String[] args) {

		// This is an error
		// JVM will not assign default value for the local variables
		int a, b, c = 300;
		// System.out.println(a + b + c);

		System.out.println(new LocalVariables().nonStaticA); // 0
		System.out.println(new LocalVariables().nonStaticA = 400);// 400
		System.out.println(new LocalVariables().nonStaticB); // 900

		System.out.println(staticA); // 0
		System.out.println(staticB); // 800

	}

}
