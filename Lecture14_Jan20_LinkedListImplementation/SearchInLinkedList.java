package Lecture14_Jan20_LinkedListImplementation;

class Node {

    int data;
    Node next;

    // create constructor to create new nodes by just providing the data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchInLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        int target = 40;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node head = n1;
        while (head != null) {
            if (head.data == target) {
                if (head.next != null)
                    System.out.println(head.next.data);
                else
                    System.out.println(-2);
                return;
            }
            head = head.next;
        }
        
        System.out.println(-1);
    }
}