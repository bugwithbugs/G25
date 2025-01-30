package Lecture14_Jan20_LinkedListImplementation;


public class Learn_LinkedList {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.insertAtPosition(25, 3);

        System.out.print("Linked List: ");
        list.display();

        list.deleteFirst();
        System.out.print("After deleting first node: ");
        list.display();

        list.deleteAtEnd();
        System.out.print("After deleting last node: ");
        list.display();

        list.deleteAtPosition(2);
        System.out.print("After deleting node at position 2: ");
        list.display();

        list.deleteByValue(25);
        System.out.print("After deleting node with value 25: ");
        list.display();
    }
}
