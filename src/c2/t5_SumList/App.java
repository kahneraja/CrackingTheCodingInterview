package c2.t5_SumList;

import c2.Node;

public class App {
    public static Node sumList(Node a, Node b) {
        Node head = null;
        Node tail = null;
        boolean hasRemainder = false;
        while(a != null || b != null) {

            int sum = sum(a, b);
            if (hasRemainder) {
                sum += 1;
            }

            if (sum >= 10){
                sum -= 10;
                hasRemainder = true;
            } else {
                hasRemainder = false;
            }

            if (head == null){
                head = new Node(sum);
                tail = null;
            } else if (tail == null) {
                tail = new Node(sum);
                head.next = tail;
            } else {
                tail.next = new Node(sum);
                tail = tail.next;
            }

            if(a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }

        }

        if (hasRemainder){
            tail.next = new Node(1);
        }

        return head;
    }


    private static int sum(Node a, Node b) {
        int sum = 0;
        if (a != null){
            sum += a.value;
        }
        if (b != null){
            sum += b.value;
        }
        return sum;
    }
}
