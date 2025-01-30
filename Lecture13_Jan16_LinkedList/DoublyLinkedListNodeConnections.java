package Lecture13_Jan16_LinkedList;

//DLL -> Doubly Linked List
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedListNodeConnections {

    public static void main(String[] args) {
        DLLNode n1 = new DLLNode(10);
        DLLNode n2 = new DLLNode(20);
        DLLNode n3 = new DLLNode(30);
        DLLNode n4 = new DLLNode(40);

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        // here n1 will be head, n4 will be tail

        // ways to access the nodes and their data
        System.out.println("N2 data: " + n2.data);
        System.out.println("N2 data via n1.next: " + n1.next.data);
        System.out.println("N3 data via n1.next.next: " + n1.next.next.data);
        System.out.println("N3 data via n2.next: " + n2.next.data);
        System.out.println("N3 data: " + n3.data);

        // Accessing previous node from a given node
        System.out.println("N2's previous node data: " + n2.prev.data);
        System.out.println("N3's previous node data: " + n3.prev.data);
        System.out.println("N4's previous node data: " + n4.prev.data);
    }
}
