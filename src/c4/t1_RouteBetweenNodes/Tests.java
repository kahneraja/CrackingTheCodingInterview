package c4.t1_RouteBetweenNodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA() {
        Node a = new Node('A');
        Node b = new Node('B');
        boolean result = App.hasRoute(a, b);
        assertEquals(result, false);
    }

    @Test
    public void testB() {
        Node a = new Node('A');
        Node b = new Node('B');
        a.nodes.add(b);
        boolean result = App.hasRoute(a, b);
        assertEquals(result, true);
    }

    @Test
    public void testC(){
        Node a = new Node('A');
        Node b = new Node('B');
        a.nodes.add(b);
        boolean result = App.hasBFSRoute(a, b);
        assertEquals(result, true);
    }

    @Test
    public void testD(){
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        a.nodes.add(b);
        b.nodes.add(c);
        boolean result = App.hasBFSRoute(a, d);
        assertEquals(result, false);
    }

    @Test
    public void testE(){
        Node a = new Node('A');
        Node c = new Node('C');
        Node d = new Node('D');
        Node b = new Node('B');
        a.nodes.add(c);
        c.nodes.add(d);
        d.nodes.add(a);
        c.nodes.add(b);
        boolean result = App.hasBFSRoute(a, b);
        assertEquals(result, true);
    }

    @Test
    public void testF(){
        Node a = new Node('A');
        Node c = new Node('C');
        Node d = new Node('D');
        Node b = new Node('B');
        a.nodes.add(c);
        c.nodes.add(d);
        d.nodes.add(a);
        boolean result = App.hasBFSRoute(a, b);
        assertEquals(result, false);
    }

    @Test
    public void testG(){
        Node a = new Node('A');
        a.nodes.add(a);
        boolean result = App.hasBFSRoute(a, a);
        assertEquals(result, true);
    }

    @Test
    public void testH(){
        boolean result = App.hasBFSRoute(null,null);
        assertEquals(result, false);
    }

    @Test
    public void testI(){
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        a.nodes.add(b);
        boolean result = App.hasBFSRoute(a,a);
        assertEquals(result, false);
    }

}
