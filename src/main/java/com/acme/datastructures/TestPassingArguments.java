package com.acme.datastructures;

import java.util.Arrays;

/**
 * In general, when you pass an argument into a method in Java, you are always making a copy of the variable.
 * But the values referenced by the two copies may be the same.
 * 
 * @author josel.rojas
 *
 */
public class TestPassingArguments {
	
	public void incrementValue(int intValue) {
		intValue++;
		System.out.println("In method: " + intValue);
	}
	
	public void incrementValue(int[] values) {
		values[0]++;
		System.out.println("In method: " + Arrays.toString(values));
	}
	
	public void changeString(String str) {
		str = "New!";
		System.out.println("In method: " + str);
	}
	
	public static void main(String... args) {
			
		/**
		 * In java, all arguments are always passed by copy. In this case a new copy is passed into a method.
		 * So, in method you can modify the variable without affect the original value.
		 */
		System.out.println("Test change primitive values");
		var originalValue = 10;
		System.out.println("Original value before to increment: " + originalValue);
		System.out.println("So, In java all arguments are always passed by copy.");
		
		var obj = new TestPassingArguments();
		obj.incrementValue(originalValue);
		System.out.println("Original value after to increment: " + originalValue);
				
		/**
		 * But, Remember that object variables are references, they are not the actual values and memory.
		 * So:
		 * 	1.- A reference variable points to a location in memory
		 * 	2.- When a references is passed, a new reference is created
		 * 	3.- Both references point to the original objects or values. This is important!!!
		 * 
		 */
		System.out.println("\nTest change object values");
		var values = new int[] {10, 20, 30};
		System.out.println("Original value before to increment: " + Arrays.toString(values));
		
		obj.incrementValue(values);
		System.out.println("Original value after to increment: " + Arrays.toString(values));
		System.out.println("So, In java all arguments are always passed by copy.");
		
		/**
		 * The big exception with the previous example is that with any kind of variables that contains 
		 * immutable values, and the biggest example of this that you will see the time is the java String class.
		 * Instances o strings are immutables so, when you modify the value of a string you are really creating 
		 * a copy of it because you can�t change that reference.
		 *  
		 */
		System.out.println("\nTest change String values");
		var strOriginal = "Original String!!!";
		System.out.println("Original value before to change it: " + strOriginal);
		
		obj.changeString(strOriginal);
		System.out.println("Original value after to change it: " + strOriginal);
		System.out.println("So, Strings are immutable then, a copy of the entire string is created when passed to a method.");
		
	}

}
