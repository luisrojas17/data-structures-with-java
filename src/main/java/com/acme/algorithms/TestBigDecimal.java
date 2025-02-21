package com.acme.algorithms;

import java.math.BigDecimal;

/**
 * @author josel.rojas
 *
 */
public class TestBigDecimal {
	
	public static void main(String... args) {
		
		var a = .012d;
		var b = .012d;
		var c = .012d;
		var result = a + b + c;
		System.out.println("Result of sum using variables of double type: " + result);
		
		//With the before solution has a problem with the precision -> 0.036000000000000004
		//To resolve this you must use BigDecimal class.
		var myStringValue = ".012";
		var vDecimal = new BigDecimal(myStringValue);
		var vResult = vDecimal.add(vDecimal).add(vDecimal);
		System.out.println("Ensuring the precision with BigDecimal: " + vResult);
		
		//To convert BigDecimal to double
		var vDouble = vResult.doubleValue();
		System.out.println("Convert BigDecimal to double: " + vDouble);
	}
}
