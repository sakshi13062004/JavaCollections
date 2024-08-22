package JavaCollections.Stack;

import java.util.Stack;

public class Lifo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(7);
       
        st.push(5);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        boolean isEmpty = st.isEmpty();
        System.out.println("Is Stack empty? " + isEmpty);
        System.out.println("Stack size: " + st.size());
        for(int element:st){
            System.out.println(element);
        }

        
    }
}
