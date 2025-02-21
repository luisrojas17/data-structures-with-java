package com.acme.algorithms.chp4.demos;

import com.acme.algorithms.chp4.LinkedList;

/**
 * @author josel.rojas
 *
 */
public class LinkedListDemo {

	public static void main(String... args) {
		
		LinkedList ll = new LinkedList();
		ll.insertAtHead(5);
		ll.insertAtHead(10);
		ll.insertAtHead(2);
		ll.insertAtHead(12);
		ll.insertAtHead(19);
		ll.insertAtHead(20);
		
		System.out.println(ll);
		System.out.println("Length: " + ll.length());
		
		ll.deleteFromHead();
		System.out.println("\nAfter delete head:");
		System.out.println(ll);
		System.out.println("Length: " + ll.length());
		
		System.out.println("\nFind: " + ll.find(12));
		System.out.println("\nFind: " + ll.find(15));
		
	}
}
