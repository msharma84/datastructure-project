package com.arrays;

/**
 *  Given an array arr of size N, create a linked list from the given array and return the head of the
 *  linked list.
 *
 *  Input: N=3, arr[]=[0,1,2]
 *  Output: 0->1->2
 *  Explanation: After converting the array into a linked list, the head of the linked list would be
 *  the start of the array.
 *
 * */
public class ConvertArrayToLinkedList {

    public static void main(String[] args) {

        int [] arr = {0,1,2,3,4,5};
        Node node =  conversion(arr);
        displayNode(node);
    }

    private static Node conversion(int [] arr){
        int len = arr.length;
        if(len == 0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node currrentNode = head;
        for(int i = 1; i < len; i++){
            currrentNode.setNext(new Node(arr[i]));
            currrentNode = currrentNode.getNext();
        }
        return head;
    }

    private static void displayNode(Node head){
        while(head.getNext() != null){
            System.out.println(head.getData());
            head = head.getNext();
        }
    }
}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
