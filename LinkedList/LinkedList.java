
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertAtPosition(int data, int position) {
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void deleteFirst() {
        if (head == null) return;
        head = head.next;
    }

    void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void deleteAtPosition(int position) {
        if (head == null) return;
        if (position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }

    void deleteByValue(int value) {
        if (head == null) return;
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next == null) return;
        temp.next = temp.next.next;
    }
}
