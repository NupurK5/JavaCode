package AboutJava;

public class javaDataTypes {

	public static void main(String[] args) {
		
		// Data type specifies the different sizes and values that can be stored in the variable
		
		/* 
		 * It is divided into 2 parts - primitive and Non-primitive(reference type / user-defined)
		 * 
		 * primitive is further divided into 2 parts - Numeric and Non-numeric
		 * 
		 * Numeric is also divided into 2 parts - integral and decimal
		 * 
		 * Integral has 4 datatypes :-
		 * 
		 * byte - (takes 1 byte)
		 * short - (takes 2 byte)
		 * int - (takes 4 byte)
		 * long - (takes 8 byte)
		 * 
		 * Decimal has 2 datatypes :-
		 * 
		 * float - (takes 4 byte)
		 * double - (takes 8 byte)
		 * 
		 * Non-numeric :-
		 * 
		 * char - (takes 2 byte)
		 * boolean - (takes 1 bit)
		 * 
		 * 
		 * Non-primitive / Reference type / user-defined
		 * 
		 * Class
		 * Interface
		 * Array
		 * String
		 * */
		
		
		int a = 5;   // value '5' will be stored in the memory 
		
		int b = a;   // 'b' also has the value '5' in the memory
		
		System.out.println("integer values : " + a + " " + b);
		
		// "The string "Java" is stored in the String Pool (inside Heap memory), and s1 will reference that object."
		String s1 = "Java";  
		String s2 = "Java";
		String s3 = new String("Java") ;
		String s4 = "java";
		
		System.out.println(s1 == s2); // Both s1 and s2 refer to the same object in the String Pool.
		System.out.println(s1 == s3); // refers to "Java" in the String Pool & s3 refers to a newly created "Java" object in Heap (outside the pool).
		System.out.println(s1 == s4); // s1  and s4 refer to the different object in the String Pool - one will have "Java" And other will have "java" because Java is case-sensitive

	}

}
