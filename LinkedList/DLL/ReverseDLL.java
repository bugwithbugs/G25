//Doubly Linked List
package DLL;

class Node { 
    int data; 
    Node next; 
    Node prev; 
    Node(int data) { 
        this.data = data; 
        this.next = null; 
        this.prev = null; 
    } 
} 

class ReverseDLL { 
    Node head; 
    public void reverse() { 
        if (head == null) return;
        
        Node current = head;
        Node newHead = null;
        
        while (current != null) {
            Node temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            
            newHead = current;
            
            current = temp;
        }
        
        head = newHead;
    } 
    
    public void printList() { 
        Node temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        } 
        System.out.println(); 
    } 
    
    public static void main(String[] args) { 
        ReverseDLL list = new ReverseDLL(); 
        Node first = new Node(1); 
        Node second = new Node(2); 
        Node third = new Node(3); 
        Node fourth = new Node(4); 
        list.head = first; 
        first.next = second; 
        second.prev = first; 
        second.next = third; 
        third.prev = second; 
        third.next = fourth; 
        fourth.prev = third; 
        
        System.out.println("Original List:"); 
        list.printList(); 
        
        list.reverse(); 
        
        System.out.println("Reversed List:"); 
        list.printList(); 
    } 
}