package c2.t4_Partition;

import c2.Node;

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

    public static Node partition(Node head, int p) {
        if (head == null || head.next == null){
            return head;
        }
        Node start = new Node(head.value);
        Node tail = start;
        while(head.next != null){
            int i = head.next.value;
            if (i < p){
                int currentStartValue = start.value;
                Node start2 = new Node(currentStartValue);
                start2.next = start.next;
                start.value = i;
                start.next = start2;
                if (tail == start){
                    tail = start.next;
                }
            } else {
                Node tail2 = new Node(i);
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

    public static void trim(Node head, int i) {
        Node n = head;
        int j = 0;
        while(j < i - 1 && n.next != null){
            n = n.next;
            j++;
        }
        n.next = null;
    }
}
