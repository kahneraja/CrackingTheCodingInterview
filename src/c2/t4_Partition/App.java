package c2.t4_Partition;

public class App {
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
                if (tail == start){
                    start.next = new Node(i);
                    tail = start.next;
                } else {
                    int currentTailValue = tail.value;
                    tail.value = i;
                    tail.next = new Node(currentTailValue);
                    tail = tail.next;
                }
            }
            head = head.next; // deallocate
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
