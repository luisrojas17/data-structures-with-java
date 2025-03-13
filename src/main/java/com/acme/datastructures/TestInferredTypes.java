package com.acme.datastructures;

import java.util.Arrays;

/**
 * Inferred Data Types was introduced in Java 10. 
 * This only works with local variables within methods.
 * 
 * @author josel.rojas
 *
 */
public class TestInferredTypes {
	
	//Declaring inferred types is not supported at class level.
	//var myObj;
	
	public void printSomething() {
		System.out.println("Testing Inferred typing...");
	}

	public static void main(String[] args) {
		
		//Inferring data type
		var myObj = new TestInferredTypes();
		myObj.printSomething();
		
		var myInt = 5;
		System.out.println("Inferred integer type: " + myInt);
				
		//Explicit types in literal values.
		var myFloat = 10f;
		System.out.println("Inferred float type: " + myFloat);
		
		var myDouble = 15d;
		System.out.println("Inferred double type: " + myDouble);
		
		var myLong = 9845L;
		System.out.println("Inferred long type: " + myLong);
		
		//declaring using underscores
		var myOtherLong = 3_000_000_000L;
		System.out.println("Long using underscores: " + myOtherLong);
		
		var myString = "Hello world!!!";
		System.out.println("Inferred string type: " + myString);
		
		var c = new int[]{1, 2, 3, 4};
		var ca = new char[] {'1', '2', '3', '4'};
		var charArray = new char[5];
		charArray[0] = 'H';
		charArray[1] = 'e';
		charArray[2] = 'l';
		charArray[3] = 'l';
		charArray[4] = 'o';
		System.out.println("Content of char array: " + Arrays.toString(charArray));
		
		var stringValue = new String(charArray);
		System.out.println("Convertion of Char array to String: " + stringValue);
		System.out.println("Convertion of String to char array: " + stringValue.toCharArray());
		
		//some operation
		var unsigned = Integer.parseUnsignedInt("3000000000");
		var longUnsigned = Long.parseUnsignedLong("3000000000");
		System.out.println("Long unsigned value: " + longUnsigned);
		System.out.println("Int unsigned value: " + unsigned);
		
		var result = Integer.divideUnsigned(unsigned, 2);
		System.out.println("Result: " + result);
		
		System.out.println("Months: ");
		String[] months = {
				"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"
		};
		
		for(var month: months) {
			System.out.println("\t" + month);
		}
		
	}
}
