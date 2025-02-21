package com.acme.algorithms.chp3;

import java.util.Arrays;

/**
 * This algorithm compare the current value vs next value. 
 * 
 * @author josel.rojas
 *
 */
public class TestSelectionSort {

    public void sort(int[] numbers){

    	System.out.println("Ordering array with selection sort method.");
    	
    	Arrays.stream(numbers).forEach(x -> System.out.println("\t" + x));
    	
    	for(int i = 0; i < numbers.length-1; i++) {
    		
    		// Start with first value.
    		int minIndex = i;
    		
    		// This iteration get the second value to compare.
    		// Always start with next value according to before iteration. 
    		for(int j = i + 1; j < numbers.length; j++) {
    			
    			// Second value < first value start to process to swap
    			if(numbers[j] < numbers[minIndex]) {
    				
    				// Set index to second value to get it  
    				minIndex = j;
    			}
    			
    		}
    		
    		// Interchange positions. 
    		// Backup second value according to second value index.  
    		int tmp = numbers[minIndex];
    		
    		// -> First value is assigned instead of second value.
    		numbers[minIndex] = numbers[i];
    		
    		// <- Second value is assigned instead of first value.
    		numbers[i] = tmp;
    		
    	}
    	
    	System.out.println("Result:");
    	Arrays.stream(numbers).forEach((x) -> {
    		System.out.println("\t" + x);
    	});    	
    	
    	System.out.println("Array ordered.");
    	
    }

    public static void main(String... args){

    	int[] numbers = {9, 2, 8, 12, 7, 10};
        
    	TestSelectionSort tss = new TestSelectionSort();
    	
    	tss.sort(numbers);   
    }
}
