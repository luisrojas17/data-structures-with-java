package com.acme.algorithms;

/**
 * @author josel.rojas
 *
 */
public class TestStringComparation {

	public static void main(String... args) {
		
		/**
		 * In this example, you are letting Java figure out the best way of creating the strings.
		 * String are objects and object variables are references. They refer to an object at a particular
		 * memory location. When you assign a string variable to a literal or an existing known value,
		 * Java looks up that value in a table it maintains in memory. If it finds an existing object 
		 * that represents the same value it assigns the new variable as a reference to that object 
		 * instead of creating a new one.
		 * This process is known as interning and you can actually force it to happen by calling the intern
		 * method from the String class. This method (inter()) checks if the pool already contains a string 
		 * equal to this String object as determined by the equals(Object) method.
		 * 
		 * 	1.- When the intern() method is executed then it checks whether the String equals to this 
		 * 		String Object is in the pool or not.
         * 	2.- If it is available, then the string from the pool is returned. Otherwise, this String object 
         * 		is added to the pool and a reference to this String object is returned.
    	 * 	3.- It follows that for any two strings s and t, s.intern() == t.intern() is true if and only 
    	 * 		if s.equals(t) is true.
		 * 
		 * Note: The pool (literal pool) is management by String class.
		 * 
		 */
		String s1 = "Hello!";
		//var s2 = s1.intern();
		var s2 = "Hello!";
		
		if(s1 == s2) {
			System.out.println("They match!");
		} else {
			System.out.println("They do not match!");
		}
	
		/**
		 * When you use the object creation syntax, you forcing the creation of a new object.
		 * The double equals operator when used with objects, does not compare the values, it asks whether
		 * the two variables reference to the same object. So that, in this case you must use the equals
		 * method to compare the object�s values since, the == operator compares memory locations, 
		 * while equals() method compares the content stored in two objects.
		 */
		String s3 = new String("Hello!");
		String s4 = new String("Hello!");
		
		if(s3 == s4) {
			System.out.println("They match!");
		} else {
			System.out.println("They do not match!");
		}
	}
}
