package com.acme.algorithms.chp4;

/**
 * A double ended linked list has next features:
 *  - node contain references of next node.
 *  - have two pointers for first and the last node.
 *  - can't go back and forth in the list.
 *
 * @author josel.rojas
 *
 */
public class DoublyEndedList {
	
	private Node head;
	
	/**
	 * The tail refers to the last element if the linked list.
	 */
	private Node tail;
	
	public void insertAtTail(int data) {
		
		Node newNode = new Node(data);
		
		// There is no items in the list so. newNode becomes head.
		if(null == this.head ){//&& null == this.tail) {
			this.head = newNode;
			
			this.tail = this.head;
			
		} /*else {
			
			this.tail.setNextNode(newNode);
			this.tail = newNode;
		}*/
		
		
		// There is NewNode becomes the current tail's nextNode
		if(null != this.tail) {
			this.tail.setNextNode(newNode);
			this.tail = newNode;
		}
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder("{");
		
		Node current = this.head;
		
		while(null != current) {
			result.append(current.toString());
			
			current = current.getNextNode();
			
			if(null != current) {
				result.append(", ");
			}
		}
		
		result.append("}");
		
		return result.toString();
	}

}
