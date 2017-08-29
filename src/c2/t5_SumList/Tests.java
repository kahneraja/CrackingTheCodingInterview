package c2.t5_SumList;

import c2.Node;
import org.junit.jupiter.api.Test;

import static c2.NodeUtils.setup;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        Node x = setup("6,8");
        Node y = setup("5,3,2");
        Node r = App.sumList(x, y);
        assertEquals("1,2,3", r.print()); // 321
    }

    @Test
    public void testB(){
        Node x = setup("9,9");
        Node y = setup("2");
        Node r = App.sumList(x, y);
        assertEquals("1,0,1", r.print());
    }

    @Test
    public void testC(){
        Node x = setup("1,1");
        Node y = setup("0");
        Node r = App.sumList(x, y);
        assertEquals("1,1", r.print());
    }

    @Test
    public void testD(){
        Node x = setup("7,1,6");
        Node y = setup("5,9,2");
        Node r = App.sumList(x, y);
        assertEquals("2,1,9", r.print());
    }

}
