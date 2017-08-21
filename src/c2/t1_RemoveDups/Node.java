package c2.t1_RemoveDups;

public class Node {
    public String value;
    public Node next;

    public Node(String value) {
        this.value = value;
    }

    public int length() {
        Node n = this;
        int length = 1;
        while(n.next != null){
            length++;
            n = n.next;
        }
        return length;
    }
}
