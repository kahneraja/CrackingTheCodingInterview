package c2.t5_SumList;

import c2.IntNode;

public class App {
    public static IntNode sumList(IntNode a, IntNode b) {
        IntNode head = null;
        IntNode tail = null;
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
                head = new IntNode(sum);
                tail = null;
            } else if (tail == null) {
                tail = new IntNode(sum);
                head.next = tail;
            } else {
                tail.next = new IntNode(sum);
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
            tail.next = new IntNode(1);
        }

        return head;
    }


    private static int sum(IntNode a, IntNode b) {
        int sum = 0;
        if (a != null){
            sum += a.v;
        }
        if (b != null){
            sum += b.v;
        }
        return sum;
    }
}
