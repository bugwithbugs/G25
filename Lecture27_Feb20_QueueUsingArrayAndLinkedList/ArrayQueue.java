package Lecture27_Feb20_QueueUsingArrayAndLinkedList;

public class ArrayQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    ArrayQueue() {
        capacity = 20;
        front = 0;
        rear = 0;
        size = 0;
        arr = new int[capacity];
    }

    ArrayQueue(int length) {
        capacity = length;
        front = 0;
        rear = 0;
        size = 0;
        arr = new int[capacity];
    }

    void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException("Queue is full, cannot add more items.");

        arr[rear] = item;
        rear = (rear + 1) % capacity;
        size++;
    }

    int dequeue() {

        if (isEmpty())
            throw new IllegalStateException("No elements in Queue to remove.");

        int first = arr[front];

        front = (front + 1) % capacity;
        size--;

        return first;
    }

    int peek() {

        if (isEmpty())
            throw new IllegalStateException("No elements in Queue.");

        return arr[front];
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void display () {
        
    }
}
