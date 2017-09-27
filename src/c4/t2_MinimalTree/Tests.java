package c4.t2_MinimalTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        Node n = App.createTree(new int[] {1,2,3,4,5,6,7,8,9});
        assertEquals(5, n.value);
        assertEquals(3, n.left.value);
        assertEquals(1, n.left.left.value);
        assertEquals(7, n.right.value);
        assertEquals(9, n.right.right.value);
    }


    @Test
    public void testB(){
        Node n = App.createTree(new int[] {1,2,3,4});
        assertEquals(3,n.value);
        assertEquals(2,n.left.value);
        assertEquals(1,n.left.left.value);
        assertEquals(4,n.right.value);
    }

}
