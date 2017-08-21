package c2.t1_RemoveDups;

import java.util.HashSet;

public class App {
    public static void removeDupsWithHashSet(Node node) {
        HashSet<String> set = new HashSet();
        Node n = node;
        set.add(n.value);
        while (n.next != null) {
            if (set.contains(n.next.value)) {
                n.next = n.next.next;
            } else {
                set.add(n.next.value);
            }
            n = n.next;
        }
    }

    public static void removeDupsWithoutHashSet(Node node) {
        if (node.next == null) {
            return;
        }

        Node left = node;

        while (left.next != null) {

            Node right = left.next;

            if (left.value == right.value){
                if (right.next != null){
                    left.next = right.next;
                } else {
                    left.next = null;
                    break;
                }
            }

            left = left.next;
        }

    }
}
