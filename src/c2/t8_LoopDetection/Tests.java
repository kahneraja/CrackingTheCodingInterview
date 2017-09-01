package c2.t8_LoopDetection;

import c2.IntNode;
import org.junit.jupiter.api.Test;

import static c2.NodeUtils.setupIntList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        IntNode head = setupIntList("1,2,3,4,5,6,7,8,9");
        head.next.next.next.next.next.next.next.next.next = head.next.next.next.next.next;
        assertEquals(App.findCollection(head), head.next.next.next.next.next);
    }

    @Test
    public void testB(){
        IntNode head = null;
        assertEquals(App.findCollection(head), null);
    }

    @Test
    public void testC(){
        IntNode head = setupIntList("1,2,3,4,5,6,7,8,9");
        assertEquals(App.findCollection(head), null);
    }

    @Test
    public void testD(){
        IntNode head = setupIntList("1,2");
        head.next = head;
        assertEquals(App.findCollection(head), head);
    }

    @Test
    public void testE(){
        IntNode head = setupIntList("1");
        head.next = head;
        assertEquals(App.findCollection(head), head);
    }

    @Test
    public void testF(){
        IntNode head = setupIntList("1,2,3,4,5,6,7,8,9");
        head.next.next.next.next.next.next.next.next.next = head;
        assertEquals(App.findCollection(head), head);
    }

}
