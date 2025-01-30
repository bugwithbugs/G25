package Lecture13_Jan16_LinkedList;

class Node {

    int data;
    Node next;

    //create constructor to create new nodes by just providing the data
    Node(int data){
        this.data = data;
        this.next = null;
    } 
}

public class LinkedListNodeConnections {
    
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next = n2;

        n2.next = n3;

        n3.next = n4;

        // here n1 will be head, n4 will be tail

        // ways to access the nodes and their data
        System.out.println("N2 data: " + n2.data);
        System.out.println("N2 data via n1.next: " + n1.next.data);
        System.out.println("N3 data via n1.next.next: " + n1.next.next.data);
        System.out.println("N3 data via n2.next: " + n2.next.data);
        System.out.println("N3 data: " + n3.data);
    }
}
