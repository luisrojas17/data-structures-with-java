package com.acme.algorithms.chp4;

/**
 * @author josel.rojas
 *
 */
public class DoublyLinkedList {

	private DoublyLinkedNode head;
	
	public void insertAtHead(int data) {
		
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		newNode.setNextNode(this.head);
		
		if(null != this.head) {
			this.head.setPreviousNode(newNode);
		}
		
		this.head = newNode;
	}
	
	public int length() {
				
		int length = 0;
		DoublyLinkedNode current = this.head;
		
		while(null != current) {
			length += 1;
			current = current.getNextNode();
		}
		
		return length;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		DoublyLinkedNode current = this.head;
		
		while(null != current) {
			result.append("Node data: ");
			result.append(current);
			result.append("\n");
			
			current = current.getNextNode();
		}
		
		return result.toString();
	}
}
