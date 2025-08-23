package com.nirvi.linkedList;

public class LinkedListTraversal {

	// head of list
	Node head;
	
	/* Linked list Node.  This inner class is made static so that
    main() can access it */
	static class Node{
		
		int data;
		Node next;
		
		// constructor
		Node(int d){
			this.data = d;
			next = null;
		}	
	}
	
	public void printLinkedList() {
		
		Node n = head;
		while(n != null) {
			System.out.println("Data : "+n.data);
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedListTraversal list = new LinkedListTraversal();
		
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		
		list.head.next = second;
		second.next = third;
		
		list.printLinkedList();
		
	}

}
