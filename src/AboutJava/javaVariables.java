package AboutJava;

public class javaVariables {

	// Java has 3 types of variables
	/*
	 * 1. Local variable - Which is define inside a method or in its parameter 2.
	 * Instance variable - which is define inside the class but outside all the
	 * methods 3. Static variable - which is define inside the class and outside all
	 * the methods using static keyword
	 */

	int a = 10; // instance variable

	static int b = 20; // static variable

	public static void main(String[] args) {

		int c = 30; // local variable

		javaVariables jv = new javaVariables();

		System.out.println("Value of local variable is " + c);
		
		// Instance variable is non-static and it belongs to an object of the class

		System.out.println("Value of instance variable is " + jv.a);
		
		// static variable is a class variable and can be called using class name
		
		System.out.println("Value of static variable is " + javaVariables.b); 

	}

}
