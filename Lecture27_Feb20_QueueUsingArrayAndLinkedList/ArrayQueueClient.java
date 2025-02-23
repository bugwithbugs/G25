package Lecture27_Feb20_QueueUsingArrayAndLinkedList;

public class ArrayQueueClient {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Size of queue: " + q.size());
        System.out.println("Deleting front of queue: " + q.dequeue());
        System.out.println("New front of queue: "  + q.peek());
        System.out.println("Is queue empty? " + q.isEmpty());

        q.dequeue();
        q.dequeue();

        System.out.println("Deleted 2 elements.");
    }
}
