package c3.t4_QueueVsStack;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> a = new Stack<>();
    Stack<Integer> b = new Stack<>();

    public void add(int v) {
        a.push(v);
    }

    public int remove() {
        sendItems(a,b);
        int v = b.pop();
        sendItems(b,a);
        return v;
    }

    public void sendItems(Stack source, Stack target){
        while(!source.isEmpty()){
            target.push(source.pop());
        }
    }
}
