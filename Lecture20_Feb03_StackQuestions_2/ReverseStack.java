package Lecture20_Feb03_StackQuestions_2;

import java.util.Stack;

public class ReverseStack {

    static Stack<Integer> reverseUsingAnotherStack(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();

        while (!st.empty()) {
            temp.push(st.pop());
        }

        return temp;
    }

    static void insertAtBottom (Stack<Integer> st, int item){

        if(st.isEmpty()){
            st.push(item);  
            return;  
        }

        int top = st.pop();
        insertAtBottom(st, item);
        st.push(top);
    }

    static void reverseUsingRecursion (Stack<Integer> st){

        if(st.isEmpty())
            return;

        int top = st.pop();
        reverseUsingRecursion(st);
        insertAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> reversedStack;
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);

        /* Uncomment this for brute force solution 
        reversedStack = reverseUsingAnotherStack(st);

        System.out.println(reversedStack); */

        reverseUsingRecursion(st);
        System.out.println(st);
    }

}
