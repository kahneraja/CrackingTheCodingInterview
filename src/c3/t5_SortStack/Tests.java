package c3.t5_SortStack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        Stack<Integer> s = new Stack();
        s.push(3);
        s.push(1);
        s.push(2);
        Stack sorted = StackSorter.sort(s);
        assertEquals(1, sorted.pop());
    }

}
