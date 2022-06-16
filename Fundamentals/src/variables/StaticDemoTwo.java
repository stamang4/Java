package variables;

public class StaticDemoTwo {

	int i;
	static int j;
	
	static void staticMethod()
	{
		System.out.println("j value is = " + j); 
		j = j + 1;
		System.out.println("j value is = " + j); 
		StaticDemoTwo sdt = new StaticDemoTwo();
		sdt.i = 30;
		System.out.println(sdt.i); //30
		
	}
	
	public static void main(String[] args) {
		staticMethod(); // 0 1 30
		staticMethod(); //1 2 30
		staticMethod();//2 3 30
		StaticDemoTwo sdt = new StaticDemoTwo();
		System.out.println(sdt.i); //0
		sdt.i = 150;
		System.out.println(sdt.i); //150
		System.out.println(sdt.j); //3

	}

}
