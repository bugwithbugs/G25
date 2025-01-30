package Lecture18_Jan28_Stack;

public class StackUsingArray {
    public static void main(String[] args) {
       try {
        MyStack ms = new MyStack();
        //MyStack ms2 = new MyStack(100); // test all the function by yourself

        ms.push(10);
        ms.push(20);
        ms.push(30);
        ms.push(40);

        System.out.println(ms.peek());
        
        System.out.println(ms.pop());

        ms.display();

        System.out.println("Size of the stack: " + ms.size());

        System.out.println("Is stack empty? " + ms.isEmpty());

        ms.pop();
        ms.pop();
        ms.pop();

        ms.pop();

        System.out.println("Is stack empty? " + ms.isEmpty());
       } catch (IllegalStateException e) {
        System.out.println(e.getMessage());
    }

    }
}
