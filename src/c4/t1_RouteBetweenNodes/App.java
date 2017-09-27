package c4.t1_RouteBetweenNodes;

import java.util.LinkedList;
import java.util.Queue;

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

    public static boolean hasBFSRoute(Node a, Node b) {
        return bfs(a, b, 1) || bfs(b, a, 2);
    }

    private static boolean bfs(Node a, Node b, int visited) {
        Queue<Node> toVisit = new LinkedList();

        if (a == null || b == null){
            return false;
        }

        toVisit.add(a);

        while (!toVisit.isEmpty()) {
            Node n = toVisit.remove();
            n.visitedKey = visited;
            for (Node adj : n.nodes) {
                if (adj == b) {
                    return true;
                }
                if (adj.visitedKey != visited) {
                    toVisit.add(adj);
                }
            }
        }

        return false;
    }
}
