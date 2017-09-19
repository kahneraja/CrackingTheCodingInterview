package c3.t3_StackOfPlates;

import java.util.Stack;

public class SetOfStacks {

    Stack<Stack<Integer>> stacks = new Stack();
    int maxHeight;
    int currentIndex;

    public SetOfStacks(int maxHeight) {
        this.maxHeight = maxHeight;
        this.currentIndex = 0;
    }

    public void push(int v) {
        if (currentIndex % maxHeight == 0){
            stacks.push(new Stack<>());
        }
        stacks.peek().push(v);
        currentIndex++;
    }

    public int pop() {
        int v = stacks.peek().pop();
        if (stacks.peek().isEmpty()){
            stacks.pop();
        }
        currentIndex--;
        return v;
    }
}
