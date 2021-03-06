package c2.t4_Partition;

import c2.IntNode;
import org.junit.jupiter.api.Test;

import static c2.NodeUtils.setupDisorderedLinkedList;
import static c2.NodeUtils.setupIntList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {


    @Test
    public void testA(){
        IntNode head = setupIntList("3,1,3,1,3,1,3");
        IntNode partitioned = App.partition(head, 2);
        assertEquals("1,1,1,3,3,3,3", partitioned.print());
    }

    @Test
    public void testB(){
        IntNode head = setupIntList("3,1");
        IntNode partitioned = App.partition(head, 2);
        assertEquals("1,3", partitioned.print());
    }

    @Test
    public void testC(){
        IntNode head = setupIntList("3");
        IntNode partitioned = App.partition(head, 2);
        assertEquals("3", partitioned.print());
    }

    @Test
    public void testD(){
        IntNode head = setupDisorderedLinkedList(100);
        IntNode partitioned = App.partition(head, 50);
        assertEquals("3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,48,46,44,42,40,38,36,34,32,30,28,26,24,22,20,18,16,14,12,10,8,6,4,2,1,99,97,95,93,91,89,87,85,83,81,79,77,75,73,71,69,67,65,63,61,59,57,55,53,51,50,52,54,56,58,60,62,64,66,68,70,72,74,76,78,80,82,84,86,88,90,92,94,96,98", partitioned.print());
    }

    @Test
    public void testBA() {
        IntNode head = setupDisorderedLinkedList(100);
        App.trim(head, 3);
        assertEquals("1,99,2", head.print());
    }

    @Test
    public void testBB(){
        IntNode head = setupIntList("5,4,3,2,1");
        assertEquals("5,4,3,2,1", head.print());
    }

}
