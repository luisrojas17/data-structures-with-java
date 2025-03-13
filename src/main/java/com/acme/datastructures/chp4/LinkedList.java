package com.acme.datastructures.chp4;

/**
 *  LinkedList is a collection which can contain many objects of the same type.
 *  Each item in a inked list is represented by a node and that node contains the
 *  data and the next node's reference.  
 * 
 * @author josel.rojas
 *
 */
public class LinkedList {

	/**
	 * Head represents the first node in the linked list.
	 *  
	 * We can access the elements only through the head element. 
	 * So the order in which we connect the nodes is very important.
	 */
	private Node head;
	
	/**
	 * This method inserts a new item in linked list. Each insertion is always made at the beginning of the list.
	 * So, the new item to insert always becomes a head and the previous head becomes a simple node and so on. 
	 * 
	 * @param data represents the data will be stored in a node to insert in the linked list.
	 */
	public void insertAtHead(int data) {
		
		// The first time is assigned the node with data value.
		Node newNode = new Node(data);
		// The first time next node is null because head have not been initialized. This indicate that newNode is
		// the last one.
		newNode.setNextNode(this.head);
		
		// First time newNode is head. That is to say, it is assigned like first element in linked list.
		this.head = newNode;
		
		// Next times it will be linked newNode with the head (23). Once linked the nodes,
		// the newNode will becomes (line 26).
		
	}
	
	/**
	 * Gets the list's length.
	 *  
	 * @return an integer
	 */
	public int length() {
		int length = 0;
		
		//Gets the first node's reference
		Node current = this.head;
		
		// If there is a valid reference, there is an node.
		while(current != null) {
			
			// Increase the counter
			length++;
			
			// Get next reference 
			current = current.getNextNode();
			
			// Check again if the reference is valid to increase the length.
		}
		
		return length;
	}
	
	/**
	 * This method delete the head that is to say, the first node since the head is always the first node.
	 * 
	 * Make the head reference point to the next node of the current head. 
	 * So:
	 * 
	 * 	Node 1(head) -> Node 2 (next) -> Node N -> Node N+1
	 * 
	 * With the change we have:
	 * 
	 * 	Node 2 (head) -> Node N (next) -> Node N+1 
	 * 
	 * The Node 1 is candidate to garbage collector because this node do not have any reference. 
	 * 	
	 */
	public void deleteFromHead() {
		
		//Gets next node's reference to delete the current head.
		this.head = this.head.getNextNode();
	}
	
	public Node find(int data) {
		
		// Gets first reference, that is to say, gets head's reference.
		Node current = this.head;
		
		// While the reference is valid compare the data to determine if the current node is the correct.
		while(current != null) {
			
			// We compare node's data vs data to find out.
			if(current.getData() == data) {
				return current;
			}
			
			// Gets next node's reference.
			current = current.getNextNode();
			
		}
		
		// Current is null so, the list do not have more nodes and the node was not in the list.
		return null;
	}
	
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder("{");
		
		// All the references created are in memory.
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
