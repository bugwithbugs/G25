package Lecture24_Feb11_StackUsingLinkedList;

public class StackUsingLinkedList {
    class Node{
        
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int size;

    StackUsingLinkedList(){
        top = null;
        size = 0;
    }

    void push (int item) {
        Node newNode = new Node(item);

        newNode.next = top;
        top = newNode;

        size ++;
    } 

    int pop () {
        if(isEmpty())
            throw new IllegalStateException("Stack is empty.");

        int item = top.data;

        top = top.next;

        size --;

        return item;
    }

    int peek () {
        if(isEmpty())
            throw new IllegalStateException("Stack is empty.");

        return top.data;
    }

    int size () {
        return size;
    }

    boolean isEmpty () {
        return top == null;
    }

    void display () {
        Node curr = top;

        while (curr != null) {
            System.out.print(curr.data);
            curr = curr.next;

            if(curr!=null)
            System.out.print(" -> ");
        }

        System.out.println();
    }

    

}
