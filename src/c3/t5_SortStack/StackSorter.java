package c3.t5_SortStack;

import java.util.Stack;

public class StackSorter {
    public static void sort(Stack<Integer> a) {
        Stack<Integer> b = new Stack();
        int hold;

        while(!a.isEmpty()){
            if (b.isEmpty() || a.peek() >= b.peek()){
                b.push(a.pop());
            } else {
                hold = a.pop();
                while(!b.isEmpty() && b.peek() > hold){
                    a.push(b.pop());
                }
                b.push(hold);
            }
        }

        while(!b.isEmpty()){
            a.push(b.pop());
        }
    }


}
