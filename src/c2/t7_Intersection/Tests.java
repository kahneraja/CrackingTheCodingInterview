package c2.t7_Intersection;

import c2.CharNode;
import org.junit.jupiter.api.Test;

import static c2.NodeUtils.setupCharList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        CharNode aHead = setupCharList("A,B,C,D");
        CharNode bHead = setupCharList("C,D,E,F,G,H,I");
        aHead.next.next.next.next = bHead.next.next;
        CharNode i = App.findInsection(aHead, bHead);
        assertEquals(i, aHead.next.next.next.next);
    }

}
