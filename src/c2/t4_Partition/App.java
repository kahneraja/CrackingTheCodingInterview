package c2.t4_Partition;

import c2.IntNode;

public class App {

    /**
     * @param head
     * @param p
     * @return
     *
     * Edge cases:
     * - head is null
     * - head.next is null
     * - start = tail
     */

    public static IntNode partition(IntNode head, int p) {
        if (head == null || head.next == null){
            return head;
        }
        IntNode start = new IntNode(head.v);
        IntNode tail = start;
        while(head.next != null){
            int i = head.next.v;
            if (i < p){
                int currentStartValue = start.v;
                IntNode start2 = new IntNode(currentStartValue);
                start2.next = start.next;
                start.v = i;
                start.next = start2;
                if (tail == start){
                    tail = start.next;
                }
            } else {
                IntNode tail2 = new IntNode(i);
                if (tail == start){
                    start.next = tail2;
                    tail = start.next;
                } else {
                    tail.next = tail2;
                    tail = tail.next;
                }
            }
            head = head.next; // head deallocated
        }
        return start;
    }

    public static void trim(IntNode head, int i) {
        IntNode n = head;
        int j = 0;
        while(j < i - 1 && n.next != null){
            n = n.next;
            j++;
        }
        n.next = null;
    }
}
