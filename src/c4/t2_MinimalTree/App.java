package c4.t2_MinimalTree;

public class App {
    public static Node createTree(int[] items) {
        int middleIndex = items.length / 2;
        Node node = new Node(items[middleIndex]);
        node.left = createTree(items, 0, middleIndex);
        node.right = createTree(items, middleIndex, items.length);
        return node;
    }

    private static Node createTree(int[] items, int startIndex, int endIndex) {
        int middleIndex = ((endIndex - startIndex) / 2) + startIndex;
        int currentIndex = startIndex;
        Node node = new Node(items[middleIndex]);
        if (middleIndex > 0) {
            node.left = createTree(items, 0, middleIndex - 1);
        }
        if (middleIndex + 1 < endIndex) {
            node.right = createTree(items, middleIndex + 1, endIndex);
        }
        return node;
    }
}
