package com.acme.datastructures;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author josel.rojas
 *
 */
public class TestNumberFormat {
	
	public static void main(String... args) {
		
		var doubleValue = 10_000_000.53;
		var nFormat = NumberFormat.getInstance();
		
		System.out.println("Number formatted: " + nFormat.format(doubleValue));
		
		//Gets only part integer and round the number in case that you want to format a decimal value.
		var intF = NumberFormat.getIntegerInstance();
		intF.setGroupingUsed(false);
		System.out.println("Integer formatted: " + intF.format(doubleValue));
		
		var locale = new Locale("de", "DE");
		var currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		System.out.println(currencyFormatter.format(doubleValue));
	}

}
