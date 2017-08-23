package c2.t3_DeleteMiddlePackage;

public class App {
    public static void deleteAt(Node node, int i) {
        if (node == null || node.next == null){
            return;
        }

        node.value = node.next.value;
        node.next = node.next.next;
    }
}
