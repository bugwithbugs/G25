package Lecture16_Jan23_LinkedList_Questions_2;

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

public class Reverse_DLL {

    static DLLNode reverseDLL(DLLNode head) {
        DLLNode curr = head;
        DLLNode temp = null;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }
        
        if (temp != null) {
            return temp.prev; // The new head of the list
        }
        return null;
    }

    static void display(DLLNode head) {
        DLLNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        DLLNode n1 = new DLLNode(5);
        DLLNode n2 = new DLLNode(10);
        DLLNode n3 = new DLLNode(15);
        DLLNode n4 = new DLLNode(20);
        DLLNode n5 = new DLLNode(25);

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        n4.next = n5;
        n5.prev = n4;

        display(n1);  
        
        DLLNode newHead = reverseDLL(n1);  
        System.out.println();
        display(newHead);
    }
}

/* package DLL;

class DLLNode{
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
} 

public class Reverse_DLL {
   
    static DLLNode reverseDLL(DLLNode head){

        DLLNode curr = head;
        DLLNode temp = null;
        while(curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }

        if(temp!=null)
        return temp.prev;
        return null;

    }

    static void display(DLLNode head){
        DLLNode curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        Reverse_DLL rd = new Reverse_DLL();

        DLLNode n1 = new DLLNode(5);
        DLLNode n2 = new DLLNode(10);
        DLLNode n3 = new DLLNode(15);
        DLLNode n4 = new DLLNode(20);
        DLLNode n5 = new DLLNode(25);
    
        n1.next = n2;
        n2.prev = n1;
    
        n2.next = n3;
        n3.prev = n2;
    
        n3.next = n4;
        n4.prev = n3;
    
        n4.next = n5;

        display(n1);
        
        DLLNode newHead = reverseDLL(n1);
        System.out.println();
        display(newHead);
    }

}
 */