package c3.t3_StackOfPlates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        SetOfStacks s = new SetOfStacks(6);
        s.push(4);
        int v = s.pop();
        assertEquals(4, v);
    }

    @Test
    public void testB(){
        SetOfStacks s = new SetOfStacks(2);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        int v = s.pop();
        assertEquals(1, v);
    }
}
