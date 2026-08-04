package com.arraylist;

import java.util.Arrays;

/**
 * Creating custom arraylist to behave exactly same as the java.util.ArrayList class
 * An arraylist contains an internal array on which data will be placed, it's an auto-increment
 * array which expands on demands.
 * Methods implemented -> insert, get, remove, display, getSize
 *
 * */
public class CustomArrayList {

    // contains the count of the elements in the array
    private int size = 0;

    // array of type Object class for the data
    private Object [] myObject;

    public CustomArrayList() {
        // initialize array with size 10
        this.myObject = new Object[10];
    }

    // insert the data in the object array
    public void insert(Object o){
        if(myObject.length - size <= 5){
            increaseSize();
        }
        myObject[size] = o;
        size++;
    }

    // get the value from the index, check size first
    // if greater the size in the array, it will return ArrayIndexOutOfBoundsException, else data
    public Object get(int index){
        if(index > size){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            return myObject[index];
        }
    }

    // remove the index value from the array
    public void remove(int index){
        if(index > size){
            throw new ArrayIndexOutOfBoundsException();
        }else{
           for(int i = index; i <= size; i++){
               myObject[i] = myObject[i+1];
           }
            myObject[size] = null;
            size--;
        }
    }

    // display the values in the array
    public void display(){
        System.out.print("[");
        for(int i =0; i < size; i++){
            System.out.print(myObject[i]);
            if(i < size-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    // increases the size of the ArrayList by 10 more
    private void increaseSize(){
        myObject = Arrays.copyOf(myObject,myObject.length+10);
    }

    public int getSize(){
        return this.size;
    }

    // Implementation of the above created method
    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();

        list.insert("A");
        list.insert("B");
        list.insert("C");
        list.insert("D");

        list.remove(2);

        list.insert("E");
        list.insert("F");
        list.insert("G");
        list.insert("H");
        list.insert("I");
        list.insert("J");
        list.insert("K");
        list.insert("L");

        list.remove(7);

        list.display();
        System.out.println(list.getSize());
    }
}
