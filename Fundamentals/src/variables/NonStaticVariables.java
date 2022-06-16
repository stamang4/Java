package variables;

import java.util.*;

public class NonStaticVariables {

	// Initialization of Non-static or Instance Variables
	int firstNumber;
	String firstName;
	double studentFee;

	public static void main(String[] args) {
		// To access non-static variable, create object using user defined datatype which is the classname
		NonStaticVariables objectReference = new NonStaticVariables();

		System.out.println(
				objectReference.firstNumber + "\t" + objectReference.firstName + "\t" + objectReference.studentFee);

		// Declaration of non-static variables
		objectReference.firstNumber = 1000;
		objectReference.firstName = "Hello World";
		objectReference.studentFee = 900;

		System.out.println(
				objectReference.firstNumber + "\t" + objectReference.firstName + "\t" + objectReference.studentFee);

		// Creating a new object to show that each and every object have separate memory
		NonStaticVariables objectReference1 = new NonStaticVariables();
		System.out.println(
				objectReference1.firstNumber + "\t" + objectReference1.firstName + "\t" + objectReference1.studentFee);

		// Each object has different address
		System.out.println(objectReference); // address is showcased as classname@hashCode
		System.out.println(objectReference1);
		
		//Example of showcasing NullPointerException 
		//Reference variable when assigned null gives this error
		NonStaticVariables objectReference2 = null;
		System.out.println(
				objectReference2.firstNumber + "\t" + objectReference2.firstName + "\t" + objectReference2.studentFee);
	}
}
