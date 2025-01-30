package Lecture17_Jan27_LinkedList_Questions;

public class MergeSortedLists {

    public Node mergeSortedLists(Node head1, Node head2){

        Node dummyNode = new Node(101);
        Node tail = dummyNode;

        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        if(head1 == null)
        tail.next = head2;
        else tail.next = head1;

        return dummyNode.next;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        MergeSortedLists msl = new MergeSortedLists();

        list1.insertAtEnd(2);
        list1.insertAtEnd(6);
        list1.insertAtEnd(8);
        list1.insertAtEnd(11);
        list1.insertAtEnd(15);

        list2.insertAtEnd(3);
        list2.insertAtEnd(5);
        list2.insertAtEnd(7);

        list1.display();
        list2.display();

        Node head1 = list1.getHead();
        Node head2 = list2.getHead();

        Node mergedListHead = msl.mergeSortedLists(head1, head2);

        while (mergedListHead != null) {
            System.out.print(mergedListHead.data + " ");
            mergedListHead = mergedListHead.next;
        }

    }
}
