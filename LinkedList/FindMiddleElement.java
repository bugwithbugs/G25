public class FindMiddleElement {

    // Using Slow and Fast Pointer
    static Node middleUsingSlowFastPointer(Node head) {
        if (head == null) {
            return null; // Empty list case
        }

        Node slow = head; // this moves single step
        Node fast = head; // this moves two steps 

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Using Length of LinkedList to find the middle
    static Node middleUsingLength(Node head) {
        int length = 0;
        Node current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        int elementNumberToFind = (length - 1) / 2;
        int cnt = 0;
        
        current = head;

        while (elementNumberToFind > cnt) {
            cnt++;
            current = current.next;
        }

        return current;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        ll.insertAtEnd(60);

        ll.display();

        // Finding the middle using the slow-fast pointer
        Node middle = middleUsingSlowFastPointer(ll.getHead());
        System.out.println("Middle using slow-fast pointer: " + (middle != null ? middle.data : "None"));

        ll.display();
        
        // Finding the middle using length of the linkedlist
        middle = middleUsingLength(ll.getHead());
        System.out.println("Middle using length approach: " + (middle != null ? middle.data : "None"));
        
        //TODO - test this for EDGE CASES: odd number of elements, no elements, single element, two elements in a linkedlist
    }
}
