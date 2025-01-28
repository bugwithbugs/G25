package Lecture_20_28Jan_Stack;

import java.nio.channels.IllegalSelectorException;

public class MyStack {
    private int[] arr;
    private int index = -1;

    MyStack(){
        arr = new int[20];
    }

    MyStack(int size){
        arr = new int[size];
    }

    public boolean isEmpty(){
        return index == -1;
    }

    public void push(int item){

        // Stack overflow condition
        if(isFull())
        throw new IllegalStateException("Stack is at its full capacity.");
        
        index ++;
        arr[index] = item;
    }

    public int peek() {

        // Stack underflow condition
        if(isEmpty())
            throw new IllegalStateException("Stack is Empty.");

        return arr[index];
    }

    public int pop () {

        // Stack underflow condition
        if(isEmpty())
        throw new IllegalStateException("Stack is Empty.");

        int top = arr[index];
        index--;
        return top;
    }

    public int size(){
        return index + 1; 
    }

    public void display() {
        for(int i = index; i >= 0; i--){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public boolean isFull () {
        return index + 1 == arr.length;
    }

}
