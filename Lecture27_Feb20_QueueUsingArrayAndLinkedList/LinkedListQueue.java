package Lecture27_Feb20_QueueUsingArrayAndLinkedList;

public class LinkedListQueue {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    LinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    void enqueue(int item) {

        Node newNode = new Node(item);

        if (front == null)
            front = newNode;
        else
            rear.next = newNode;

        rear = newNode;
        size++;
    }

    int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty. No element to remove.");

        int first = front.data;
        front = front.next;
        if (front == null)
            rear = null;

        return first;
    }

    int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty.");

        return front.data;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty.");
        }

        Node curr = front;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
