package c4.t1_RouteBetweenNodes;

import java.util.ArrayList;
import java.util.List;

public class Node {

    int visitedKey;
    List<Node> nodes = new ArrayList();
    private char v;

    public Node(char v) {
        this.v = v;
    }
}
