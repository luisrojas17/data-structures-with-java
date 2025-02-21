package com.acme.algorithms.chp3;

import java.util.Arrays;

/**
 * This algorithm compare the current value vs before value.
 * 
 * This is relatively good for small list and is better than Selection Sort algorithm.
 * 
 * @author josel.rojas
 *
 */
public class TestInsertionSort {

	public void sort(int[] numbers) {
		
		System.out.println("Ordering array with insertion sort method.");
		Arrays.stream(numbers).forEach(x -> System.out.println("\t" + x));
		
		for(int i = 0; i < numbers.length; i++) {
			
			// Keep the current value to swap.
			int currentValue = numbers[i];
			
			// We always go back one position to compare with current value.
			int j = i - 1;
			
			// From second time this code is executed.
			// This iteration compares current value VS all before values. So, this is a comparison in reverse mode.
			// If this condition is true the values are interchanged.
			while(j >= 0 && numbers[j] >= currentValue) {
				
				// Move the left side to right side. 
				// We override the current value for the before value. So, J+1 = i
				numbers[j+1] = numbers[j];
				
				// For go back up to at the beginning of array or the position according to i.
				j--;
			}
			
			// First time there is no changes.
			// We confirm the swap moving value to the right side to left side.
			numbers[j+1] = currentValue;
			
			
		}
		
		System.out.println("Result:");
		
		Arrays.stream(numbers).forEach((x) -> {
			System.out.println("\t" + x);
		});
		
	}
	
	public static void main(String... args) {
		
		int[] numbers = new int[] {7,3,6,8,2};
		
		TestInsertionSort tis = new TestInsertionSort();
		tis.sort(numbers);
	}
}
