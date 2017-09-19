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
        StackSorter.sort(s);
        assertEquals(1, (int)s.pop());
        assertEquals(2, (int)s.pop());
        assertEquals(3, (int)s.pop());
    }

    @Test
    public void testB(){
        Stack<Integer> s = new Stack();
        s.push(3);
        s.push(9);
        s.push(1);
        s.push(4);
        s.push(7);
        s.push(2);
        s.push(6);
        s.push(5);
        s.push(8);
        StackSorter.sort(s);
        assertEquals(1, (int)s.pop());
        assertEquals(2, (int)s.pop());
        assertEquals(3, (int)s.pop());
        assertEquals(4, (int)s.pop());
        assertEquals(5, (int)s.pop());
        assertEquals(6, (int)s.pop());
        assertEquals(7, (int)s.pop());
        assertEquals(8, (int)s.pop());
        assertEquals(9, (int)s.pop());
    }

}
