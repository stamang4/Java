package variables;

import java.util.*;

public class SwapDemo {

	int fno;
	int sno;

	Scanner sc = new Scanner(System.in);

	// non-static Method/instance Methods
	void swap() {
		System.out.println("Enter First Number ");
		fno = sc.nextInt();
		System.out.println("Enter Second Number ");
		sno = sc.nextInt();

		int temp = 0;
		System.out.println("Before Swapping : ");
		System.out.println("Fno : " + fno + " Sno : " + sno);
		// swapping
		temp = fno;
		fno = sno;
		sno = temp;
		System.out.println("After Swapping : ");
		System.out.println("Fno : " + fno + " Sno : " + sno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapDemo demo = new SwapDemo();
		System.out.println(demo.fno + "\t" + demo.sno);

		demo.swap();
		System.out.println(demo.fno + "\t" + demo.sno);

		// int 123a; Invalid Variables can't start with number

		// int @aba = 199; //Variables can't start with @
		// System.out.println(@aba);
		
		int $aba = 99;
		System.out.println($aba);

		int _aba = 199;
		System.out.println(_aba);

	}

}
