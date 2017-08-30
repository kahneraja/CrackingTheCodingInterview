package c2.t6_Palindrome;

import c2.CharNode;
import org.junit.jupiter.api.Test;

import static c2.NodeUtils.setupCharList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA() {
        CharNode head = setupCharList("A,B");
        assertEquals(App.isPalindrom(head), false);
    }

    @Test
    public void testB() {
        CharNode head = setupCharList("A,B,A");
        assertEquals(App.isPalindrom(head), true);
    }

    @Test
    public void testC() {
        CharNode head = setupCharList("A,A");
        assertEquals(App.isPalindrom(head), true);
    }

    @Test
    public void testD() {
        CharNode head = setupCharList("A,B,B,A");
        assertEquals(App.isPalindrom(head), true);
    }

    @Test
    public void testE() {
        CharNode head = setupCharList("A,B,C,B,A");
        assertEquals(App.isPalindrom(head), true);
    }

    @Test
    public void testF() {
        CharNode head = setupCharList("A,B,C,B,A,C");
        assertEquals(App.isPalindrom(head), false);
    }

}
