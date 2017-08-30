package c2;

import java.util.Random;

public class NodeUtils {
    public static IntNode setupIntList(String sequence) {
        IntNode head = null;
        IntNode current = null;
        for(String s: sequence.split(",")){
            int i = Integer.parseInt(s);
            if (head == null){
                head = new IntNode(i);
                current = head;
            } else {
                current.next = new IntNode(i);
                current = current.next;
            }
        }
        return head;
    }

    public static CharNode setupCharList(String sequence) {
        CharNode head = null;
        CharNode current = null;
        for(String s: sequence.split(",")){
            char c = s.charAt(0);
            if (head == null){
                head = new CharNode(c);
                current = head;
            } else {
                current.next = new CharNode(c);
                current = current.next;
            }
        }
        return head;
    }

    public static IntNode setupDisorderedLinkedList(int len) {
        Random r = new Random();

        IntNode current = new IntNode(1);
        IntNode head = current;
        for (int i = 1; i < len - 1; i++) {
            int j = i;
            if (i % 2 != 0){
                j = len - i;
            }
            current.next = new IntNode(j);
            current = current.next;
        }
        return head;
    }
}
