package c2.t8_LoopDetection;

import c2.IntNode;

public class App {
    public static IntNode findCollection(IntNode head) {
        if (head == null || head.next == null || head.next.next == null){
            return null;
        }
        IntNode fast = findANodeAnywhereInLoop(head);
        if (fast == null){
            return null;
        }
        IntNode slow = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    private static IntNode findANodeAnywhereInLoop(IntNode head) {
        IntNode slow = head;
        IntNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return fast;
            }
        }
        return null;
    }
}
