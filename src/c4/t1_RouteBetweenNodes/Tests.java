package c4.t1_RouteBetweenNodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA() {
        Node a = new Node();
        Node b = new Node();
        boolean result = App.hasRoute(a, b);
        assertEquals(result, false);
    }

    @Test
    public void testB() {
        Node a = new Node();
        Node b = new Node();
        a.nodes.add(b);
        boolean result = App.hasRoute(a, b);
        assertEquals(result, true);
    }

}
