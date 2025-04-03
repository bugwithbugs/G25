package Lecture28_Feb25_DequeUsingDLL;

public class DLLDeque {
    private static class Node {
        int data;
        Node prev = null;
        Node next = null;

        Node(int a) {
            this.data = a;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    DLLDeque() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public void addFront(int a) {

        if (isEmpty()) {
            this.front = this.rear = new Node(a);
        }
        else {
            Node newNode = new Node(a);
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }

        size++;
    }

    public int removeFront() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
    
        int data = front.data;
        front = front.next;

        if (front == null) { 
            rear = null;
        } else {
            front.prev = null;
        }

        size--;
        return data;
    }

    public int peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Front is empty");
        }
        else {
            return front.data;
        }
    }

    public void addRear(int a) {
        
        if (isEmpty()) {
            front = rear = new Node(a);
        }
        else {
            Node newNode = new Node(a);
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    public int removeRear() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
    
        int data = rear.data;
        rear = rear.prev;
    
        if (rear == null) { 
            front = null;
        } else {
            rear.next = null;
        }

        size--;

        return data;
    }

    public int peekRear() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        else {
            return rear.data;
        }
    }

    public int getSize() {
        return size;
    };

    public boolean isEmpty() {
        return getSize() == 0;
    };

    public void display() {
        Node tempHead = front;

        System.out.println("\nPrinting your queue :-)\n");

        while(tempHead != null) {
            System.out.print(tempHead.data + " ");
            tempHead = tempHead.next;
        }

        System.out.println("\n\n");
    }
}