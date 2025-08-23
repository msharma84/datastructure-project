package com.nirvi.linkedList;

public class LinkedListInsertion {

	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	/* This function is in LinkedList class. Inserts a
	   new Node at front of the list. This method is
	   defined inside LinkedList class shown above */
	public void push(int data) {
		
		/* 1 & 2: Allocate the Node &
        Put in the data*/
		Node newNode = new Node(data);
		
		/* 3. Make next of new Node as head */
		newNode.next = head;
		
		 /* 4. Move the head to point to new Node */
		head = newNode;
	}
	public static void main(String[] args) {

	}

}
