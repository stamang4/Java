package variables;

public class StaticDemo {

	int i = 10; //non-static variable
	static int j = 20; //static variable
	
	public static void main(String[] args) {
		//Create an object reference variable
		StaticDemo sd = new StaticDemo();
		
	//	System.out.println(i); //Can't access non-static variable without object reference variable inside static method
		
		System.out.println(sd.i); // 10
		
		System.out.println(j); // 20
		
		System.out.println(sd.j); //20
		
		j = 30;
		
		System.out.println(j); //30
		
		StaticDemo sd1 = new StaticDemo(); //creating new object reference variable 
		
		sd1.i = 40;
		
		System.out.println(sd1.i); //40
		
		System.out.println(sd1.j); //30 Static allocates memory once and we use that value entire application
		
		sd1.j = 50; 
		
		System.out.println(sd1.j); //50

	}

}
