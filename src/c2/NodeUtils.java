package c2;

import java.util.Random;

public class NodeUtils {
    public static Node setup(String sequence) {
        Node head = null;
        Node current = null;
        for(String s: sequence.split(",")){
            int i = Integer.parseInt(s);
            if (head == null){
                head = new Node(i);
                current = head;
            } else {
                current.next = new Node(i);
                current = current.next;
            }
        }
        return head;
    }

    public static Node setupDisorderedLinkedList(int len) {
        Random r = new Random();

        Node current = new Node(1);
        Node head = current;
        for (int i = 1; i < len - 1; i++) {
            int j = i;
            if (i % 2 != 0){
                j = len - i;
            }
            current.next = new Node(j);
            current = current.next;
        }
        return head;
    }
}
