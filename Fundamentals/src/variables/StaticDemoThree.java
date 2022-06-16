package variables;

public class StaticDemoThree {

	int i; //non-static
	static int j; //static
	public static void main(String[] args) {
		 StaticDemoThree sdt = null;
		//System.out.println(sdt.i); //nullexception error
		System.out.println(sdt.j); //0
		StaticDemoThree sdt1 = new StaticDemoThree();
		System.out.println(sdt1.i); //0
		System.out.println(sdt1.j);//0
		sdt1.i = 25;
		sdt1.j = 35;
		System.out.println(j); //35
		StaticDemoThree sdt2 = new StaticDemoThree();
		StaticDemoThree sdt3 = new StaticDemoThree();
		sdt2.i = 10;
		System.out.println(sdt3.i); //0
		System.out.println(sdt3.j); //35
	}

}
