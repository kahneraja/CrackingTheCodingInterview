package c3.t2_StackMin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        MinStack stack = new MinStack();
        stack.push(3);
        int v = stack.pop();
        assertEquals(v,3);
    }

    @Test
    public void testB(){
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(1);
        stack.push(2);
        int a = stack.pop();
        int b = stack.pop();
        int c = stack.pop();
        assertEquals(1, a);
        assertEquals(1, b);
        assertEquals(3, c);
    }

    @Test
    public void testC(){
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(9);
        stack.push(9);
        stack.push(9);
        stack.push(9);
        stack.push(9);
        int a = stack.pop();
        int b = stack.pop();
        int c = stack.pop();
        int d = stack.pop();
        int e = stack.pop();
        int f = stack.pop();
        assertEquals(1, a);
        assertEquals(1, a);
        assertEquals(1, a);
        assertEquals(1, a);
        assertEquals(1, b);
        assertEquals(1, b);
    }

}
