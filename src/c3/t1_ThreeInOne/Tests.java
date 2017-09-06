package c3.t1_ThreeInOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA() {
        MultiStack stack = new MultiStack<Integer>(4, 10);
        stack.push(0, 3);
        int v = (int)stack.pop(0);
        assertEquals(v,3);
        assertEquals(stack.isEmpty(), true);
    }

    @Test
    public void testB() {
        MultiStack stack = new MultiStack<Integer>(3, 3);
        stack.push(0, 5);
        stack.push(1, 6);
        stack.push(2, 7);
        assertEquals(stack.isFull(), true);
    }

    @Test
    public void testC() {
        MultiStack stack = new MultiStack<Integer>(1, 3);
        stack.push(0, 1);
        stack.push(0, 2);
        stack.push(0, 3);
        assertEquals(stack.isFull(), true);
        assertEquals(stack.print(), "1,2,3");
    }

    @Test
    public void testD() {
        MultiStack stack = new MultiStack<Integer>(1, 3);
        stack.push(0, 0);
        stack.push(0, 1);
        stack.push(0, 2);
        assertEquals(stack.print(), "0,1,2");
    }

    @Test
    public void testE() {
        MultiStack stack = new MultiStack<Integer>(1, 3);
        stack.push(0, 0);
        stack.push(0, 1);
        stack.push(0, 2);
        stack.pop(0);
        stack.pop(0);
        assertEquals("0,null,null",stack.print());
    }

    @Test
    public void testF() {
        MultiStack stack = new MultiStack<Integer>(2, 6);
        stack.push(0, 1);
        stack.push(0, 2);
        stack.push(0, 3);
        stack.push(1, 4);
        stack.push(1, 5);
        stack.push(1, 6);
        stack.pop(0);
        assertEquals("1,2,4,5,6,null", stack.print());
    }

    @Test
    public void testG() {
        MultiStack stack = new MultiStack<Integer>(2, 6);
        stack.push(0, 1);
        stack.push(0, 2);
        stack.push(0, 3);
        stack.push(1, 4);
        stack.push(1, 5);
        stack.push(1, 6);
        stack.pop(0);
        stack.pop(1);
        assertEquals("1,2,4,5,null,null", stack.print());
    }

    @Test
    public void testH() {
        MultiStack stack = new MultiStack<Integer>(2, 6);
        stack.push(0, 1);
        stack.push(0, 2);
        stack.push(0, 3);
        stack.push(1, 4);
        stack.push(1, 5);
        stack.push(1, 6);
        stack.pop(0);
        stack.pop(1);
        stack.push(0, 5);
        stack.push(1, 6);
        assertEquals("1,2,3,4,5,6", stack.print());
        assserEquals(stack.isFull(),true);
    }

}
