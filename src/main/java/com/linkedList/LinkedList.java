package com.nirvi.linkedList;

public class LinkedList {

	// head of list
	Node head;
	
	/* Linked list Node.  This inner class is made static so that
    main() can access it */
	static class Node{
		
		int data;
		Node next;
		
		// constructor
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	/* This function prints contents of linked list starting from head */
	public void printLinkedList() {
		
		Node n = head;
		while(n!= null) {
			System.out.println("Data : "+n.data);
			n = n.next;
		}
	}
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		
		Node second = new Node(2);
		
		Node third = new Node(3);
		
		 /* Three nodes have been allocated dynamically.
        We have references to these three blocks as head,  
        second and third

        llist.head        second              third
           |                |                  |
           |                |                  |
       +----+------+     +----+------+     +----+------+
       | 1  | null |     | 2  | null |     |  3 | null |
       +----+------+     +----+------+     +----+------+ */
		list.head.next = second; // Link first node with the second node
		
		/*  Now next of the first Node refers to the second.  So they
	        both are linked.
	
	     llist.head        second              third
	        |                |                  |
	        |                |                  |
	    +----+------+     +----+------+     +----+------+
	    | 1  |  o-------->| 2  | null |     |  3 | null |
	    +----+------+     +----+------+     +----+------+ */
		second.next = third; // Link second node with the third node
		
		/*  Now next of the second Node refers to third.  So all three
        nodes are linked.

	     llist.head        second              third
	        |                |                  |
	        |                |                  |
	    +----+------+     +----+------+     +----+------+
	    | 1  |  o-------->| 2  |  o-------->|  3 | null |
	    +----+------+     +----+------+     +----+------+ */
		list.printLinkedList();
		
	}

}
