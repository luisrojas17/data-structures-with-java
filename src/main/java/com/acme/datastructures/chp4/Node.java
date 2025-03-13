package com.acme.datastructures.chp4;

/**
 * This class is a representation of the each item in linked list. Each node is like a container 
 * that wraps the data in the linked list. 
 * 
 * @author josel.rojas
 *
 */
public class Node {

	/**
	 * The data to be wrapped by this node.
	 */
	private int data;
	
	/**
	 * Represents the next node (item or element). 
	 * Each representation is in memory.
	 */
	private Node nextNode;
	
	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Data: " + this.data;
	}
}
