package c2.t5_SumList;

import c2.IntNode;
import org.junit.jupiter.api.Test;

import static c2.NodeUtils.setupIntList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        IntNode x = setupIntList("6,8");
        IntNode y = setupIntList("5,3,2");
        IntNode r = App.sumList(x, y);
        assertEquals("1,2,3", r.print()); // 321
    }

    @Test
    public void testB(){
        IntNode x = setupIntList("9,9");
        IntNode y = setupIntList("2");
        IntNode r = App.sumList(x, y);
        assertEquals("1,0,1", r.print());
    }

    @Test
    public void testC(){
        IntNode x = setupIntList("1,1");
        IntNode y = setupIntList("0");
        IntNode r = App.sumList(x, y);
        assertEquals("1,1", r.print());
    }

    @Test
    public void testD(){
        IntNode x = setupIntList("7,1,6");
        IntNode y = setupIntList("5,9,2");
        IntNode r = App.sumList(x, y);
        assertEquals("2,1,9", r.print());
    }

}
