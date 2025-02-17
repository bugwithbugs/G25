package Lecture26_Feb17_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class QueueClass {
    private static final int MAX_SIZE = 3;

    public static void main(String[] args) {
        Queue<Integer> mq = new LinkedList<>();

        System.out.println("Demonstrating add() vs offer():");
        System.out.println("add() throws exception if queue is full");
        System.out.println("offer() returns false if queue is full");

        System.out.println("\nTrying to add elements using add():");
        try {
            for (int i = 1; i <= 4; i++) {
                if (mq.size() < MAX_SIZE) {
                    mq.add(i * 10);
                    System.out.println("Successfully added: " + (i * 10));
                } else {
                    System.out.println("Queue is full, still trying add(): " + (i * 10));
                    mq.add(i * 10);
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: Queue is full!");
        }

        mq.clear();
        System.out.println("\nTrying to add elements using offer():");
        for (int i = 1; i <= 4; i++) {
            boolean success = mq.offer(i * 10);
            System.out.println("Trying to offer " + (i * 10) + ": " + (success ? "Successful" : "Failed"));
        }

        System.out.println("\nDemonstrating element() vs peek():");
        System.out.println("element() throws exception if queue is empty");
        System.out.println("peek() returns null if queue is empty");

        System.out.println("\nCurrent queue: " + mq);
        System.out.println("Front element using element(): " + mq.element());
        System.out.println("Front element using peek(): " + mq.peek());

        mq.clear();
        System.out.println("\nTrying on empty queue:");
        try {
            System.out.println("Calling element() on empty queue");
            mq.element();
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught: Queue is empty!");
        }

        System.out.println("Calling peek() on empty queue: " + mq.peek());

        System.out.println("\nDemonstrating remove() vs poll():");
        System.out.println("remove() throws exception if queue is empty");
        System.out.println("poll() returns null if queue is empty");

        mq.offer(100);
        mq.offer(200);
        System.out.println("\nCurrent queue: " + mq);
        System.out.println("Removing using remove(): " + mq.remove());
        System.out.println("Removing using poll(): " + mq.poll());

        System.out.println("\nTrying to remove from empty queue:");
        try {
            System.out.println("Calling remove() on empty queue");
            mq.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught: Queue is empty!");
        }

        System.out.println("Calling poll() on empty queue: " + mq.poll());
    }
}