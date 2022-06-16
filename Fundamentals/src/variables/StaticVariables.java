package variables;

public class StaticVariables {
	
	static int i = 900;
	
	static void staticMethodTest() {
		System.out.println("Inside Static Method");
	}
	
	public static void main(String[] args) {
		//Rule 1: Static variables and methods can be directly accessed inside static methods 
		System.out.println("Directly " + i );
		staticMethodTest();
		
		//Rule 2: Static variables and methods can be accessed using classname inside static methods
		System.out.println("Using classname " + StaticVariables.i);
		StaticVariables.staticMethodTest();
		
		//Rule 3: Static variables and methods can be accessed using object reference 
		StaticVariables staticObjectReference = new StaticVariables();
		System.out.println("Using object reference varaible " + staticObjectReference.i);
		staticObjectReference.staticMethodTest();
		
		//Rule 4: Object Reference variables once have a Null can access static variables and methods
		StaticVariables staticObjectReference1 = null;
		System.out.println("Using object reference varaible to show that null works " + staticObjectReference1.i);
		staticObjectReference1.staticMethodTest();
		
		
		//Testing non-static method through object reference
		staticObjectReference.nonStaticMethodTest();
		
		//Testing non-static method through null object reference gives null point exception 
		staticObjectReference1.nonStaticMethodTest();
	}
	
	void nonStaticMethodTest()
	{
		System.out.println("Inside non-static method");
		
	}
	
}
