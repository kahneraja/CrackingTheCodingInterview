package c3.t4_QueueVsStack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        MyQueue q = new MyQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        int v = q.remove();
        assertEquals(1, v);
    }
}
