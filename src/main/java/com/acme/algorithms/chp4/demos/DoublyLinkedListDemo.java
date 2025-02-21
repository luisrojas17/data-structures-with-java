package com.acme.algorithms.chp4.demos;

import com.acme.algorithms.chp4.DoublyLinkedList;

/**
 * @author josel.rojas
 *
 */
public class DoublyLinkedListDemo {

	public static void main(String... args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertAtHead(5);
		dll.insertAtHead(10);
		dll.insertAtHead(2);
		dll.insertAtHead(12);
		dll.insertAtHead(19);
		dll.insertAtHead(20);
		
		System.out.println(dll);
		
	}
}
