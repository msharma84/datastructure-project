package com.karumanchi.linkedlist;

public class LinkedList {
	
	// Head Node
	Node head;
	
	// Length of the LinkedList
	private int length = 0;
	
	// Default Constructor
	public LinkedList() {
		this.length = 0;
	}
	
	// Return the first node in the list
	public Node getHead() {
		return head;
	}

	// Return the length of the list
	public int getLength() {
		return length;
	}

	public void insertAtBegin(int data) {
		
		Node newNode = new Node(data);
		// Make next of new node as head
		newNode.setNext(head);
		head = newNode;
		length++;
	}
	
	public void insertAtEnd(int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			newNode.setNext(null);
			Node node = head;
			while(node.getNext() != null) {
				node = node.getNext();
			}
			node.setNext(newNode);
			length++;
		}
	}
	
	public void insertAtSpecificPosition(int data, int position) {
		
		// if position less then zero then it will insert at begin
		if(position <0) {
			position =0;
		}
		// if position is greater then zero it will insert at last
		if(position > length) {
			position = length;
		}
		
		// if head is null then it will insert at the start
		if(head == null) {
			head = new Node(data);
		}else if(position == 0) {
			Node temp = new Node(data);
			temp.setNext(head);
			head = temp;
		}else {
			Node temp = head;
			for(int i=1;i<position;i+=1) {
				temp = temp.getNext();
			}
			Node newNode = new Node(data);
			newNode.next = temp.next;
			temp.setNext(newNode);
		}
		length++;
	}
	
	public void removeFromBegin() {
		
		Node node = head;
		if(node != null) {
			head = node.getNext();
			node.setNext(null);
		}
		length--;
	}
	
	
	public void printList() {
		
		Node node = head;
		while(node != null) {
			System.out.print(node.getData() +" ");
			node = node.getNext();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.insertAtBegin(2);
		linkedList.insertAtBegin(3);
		linkedList.insertAtBegin(4);
		linkedList.insertAtBegin(5);
		
		System.out.print("Created Linked list is: ");
		linkedList.printList();
		
		linkedList.insertAtBegin(1);
		
		System.out.print("After inserting data at front: ");
		linkedList.printList();
		
		linkedList.insertAtEnd(10);
		System.out.print("After inserting data at last: ");
		linkedList.printList();
		
		linkedList.insertAtSpecificPosition(6, 1);
		System.out.print("Inserting data at position 5: ");
		linkedList.printList();
		
		System.out.println("Length: "+linkedList.getLength());
		linkedList.removeFromBegin();
		linkedList.printList();
		System.out.println("Length: "+linkedList.getLength());
	}
}
// class that contains data
class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
	public int getData() {
		return this.data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setData(int data) {
		this.data = data;
	}
}
