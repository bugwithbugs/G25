package Lecture_20_28Jan_Stack;

import java.util.Stack;

public class JavaStackClass {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Current Size: " + st.size());

        System.out.println("Current Top Element: " + st.peek());

        System.out.println("Deleting top: " + st.pop());

        System.out.println("Is Stack Empty: " + st.isEmpty());

        st.pop();
        st.pop();
        st.pop();
        st.pop();

        System.out.println("Is Stack Empty: " + st.empty());
    }
}
