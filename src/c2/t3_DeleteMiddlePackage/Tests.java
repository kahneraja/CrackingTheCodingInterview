package c2.t3_DeleteMiddlePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        Node head = new Node("A");
        head.next = new Node("B");
        head.next.next = new Node("C");
        head.next.next.next = new Node("D");
        head.next.next.next.next = new Node("E");
        App.deleteAt(head, 2);
        assertEquals(head.next.next.value, "D");
    }

    @Test
    public void testB(){
        Node head = new Node("A");
        head.next = new Node("B");
        App.deleteAt(head, 1);
        assertEquals(head.next, null);
    }

    @Test
    public void testC(){
        Node head = new Node("A");
        head.next = new Node("B");
        head.next.next = new Node("C");
        App.deleteAt(head, 1);
        assertEquals(head.next.value, "C");
    }

    @Test
    public void addToStart(){
        Node head = new Node("B");
        addToStart(head, new Node("A"));
        assertEquals("A", head.value);
        assertEquals("B", head.next.value);
    }

    private void addToStart(Node head, Node a) {
        String headValue = head.value;
        head.value = a.value;
        a.value = headValue;
        head.next = a;
    }

}
