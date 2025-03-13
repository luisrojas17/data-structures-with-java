package com.acme.datastructures.chp4.demos;

import com.acme.datastructures.chp4.DoublyEndedList;

/**
 * @author josel.rojas
 *
 */
public class DoublyEndedListDemo {

	public static void main(String... args) {
		
		DoublyEndedList dList = new DoublyEndedList();
		dList.insertAtTail(19);
		dList.insertAtTail(18);
		dList.insertAtTail(17);
		dList.insertAtTail(16);
		
		System.out.println(dList);
		
	}
}
