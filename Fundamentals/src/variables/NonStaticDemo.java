package variables;

public class NonStaticDemo {
	
	//non-static variable
	int x = 0;
	
	NonStaticDemo nsd = null;
	
	//non-static method
	void nonStaticMethod()
	{
		nsd = new NonStaticDemo();
		nsd.x = 10;
		System.out.println("Inside NonStaticMethod x:" + x); //400
		System.out.println("Inside NonStaticMethod nsd.x:" + nsd.x); //10
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticDemo nsd = new NonStaticDemo();
		nsd.x = 400;
		nsd.nonStaticMethod();
		System.out.println("Inside static main method nsd.nsd.x:" + nsd.nsd.x); //10
		System.out.println("Inside static main method nsd.x:" + nsd.x); //400

	}

}
