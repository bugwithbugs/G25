package Lecture17_Jan27_LinkedList_Questions;

public class DetectCycleInLinkedList {

    public boolean detectCycle(Node head){

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        DetectCycleInLinkedList dc = new DetectCycleInLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(12);
        list.insertAtEnd(4);
        list.insertAtEnd(15);
        list.insertAtEnd(7);

        Node head = list.getHead();

        list.display();

        System.out.println(dc.detectCycle(head));
        
        head.next.next.next.next.next = head.next;

        System.out.println(dc.detectCycle(head));
    }
}
