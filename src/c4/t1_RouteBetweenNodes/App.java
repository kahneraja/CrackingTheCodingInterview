package c4.t1_RouteBetweenNodes;

public class App {
    public static boolean hasRoute(Node a, Node b) {
        return dfs(a, b, 1) || dfs(b, a, 2);
    }

    private static boolean dfs(Node b, Node a, int key) {
        if (a == b) {
            return true;
        }
        a.visitedKey = key;
        boolean foundMatch = false;
        for (Node n : a.nodes) {
            if (n.visitedKey != key) {
                foundMatch = foundMatch || dfs(n, b, key);
            }
        }
        return foundMatch;
    }
}
