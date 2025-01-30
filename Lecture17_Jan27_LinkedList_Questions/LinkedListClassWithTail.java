package Lecture17_Jan27_LinkedList_Questions;

    class LinkedListClassWithTail {
        Node head;
        Node tail;
    
        public LinkedListClassWithTail() {
            head = null;
            tail = null;
        }
    
        public void insertTail(int data) {
            Node newNode = new Node(data);
    
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    
        public void deleteTail() {
            if (head == null) {
                System.out.println("The list is empty, no node to delete.");
                return;
            }
    
            if (head == tail) {  // If there is only one node in the list
                head = null;
                tail = null;
                return;
            }
    
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
    
            current.next = null;
            tail = current;
        }
    
        public void display() {
            if (head == null) {
                System.out.println("The list is empty.");
                return;
            }
    
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
