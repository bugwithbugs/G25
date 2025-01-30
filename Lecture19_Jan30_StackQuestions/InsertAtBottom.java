package Lecture19_Jan30_StackQuestions;

import java.util.Stack;

public class InsertAtBottom {

    static void bruteForceUsingAnotherStack(Stack<Integer> st, int item){
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }

        st.push(item);

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }

    static void optimizedApproachUsingRecursion (Stack<Integer> st, int item){

        if(st.isEmpty()){
            st.push(item);  
            return;  
        }

        int top = st.pop();
        optimizedApproachUsingRecursion(st, item);
        st.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        int n = 5;
        int item = 60; // item to insert

        for(int i = 1; i <= n; i++) {
            st.push(10 * i);
        }

        //obj.bruteForceUsingAnotherStack(st, item);
        optimizedApproachUsingRecursion(st, item);
        System.out.println(st);

    }
}
