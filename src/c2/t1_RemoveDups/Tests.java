package c2.t1_RemoveDups;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        Node node = new Node("A");
        node.next = new Node("B");
        node.next.next = new Node("B");
        node.next.next.next = new Node("C");
        App.removeDupsWithHashSet(node);
        assertEquals(node.length(), 3);
    }

    @Test
    public void testB(){
        Node node = new Node("A");
        App.removeDupsWithHashSet(node);
        assertEquals(node.length(), 1);
    }

    @Test
    public void testC(){
        Node node = new Node("A");
        node.next = new Node("B");
        node.next.next = new Node("B");
        node.next.next.next = new Node("C");
        node.next.next.next.next = new Node("C");
        App.removeDupsWithoutHashSet(node);
        assertEquals(node.length(), 3);
    }

    @Test
    public void testD(){
        Node node = new Node("A");
        App.removeDupsWithoutHashSet(node);
        assertEquals(node.length(), 1);
    }

    @Test
    public void testE(){
        Node node = new Node("A");
        node.next = new Node("A");
        App.removeDupsWithoutHashSet(node);
        assertEquals(node.length(), 1);
    }

}
