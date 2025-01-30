package Lecture16_Jan23_LinkedList_Questions_2;

public class Reverse_LinkedList {

    static Node reverse(Node head){

        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(20);
        list.insertAtEnd(25);

        list.display();
        
        list.head = reverse(list.getHead());

        list.display();
    }
}
