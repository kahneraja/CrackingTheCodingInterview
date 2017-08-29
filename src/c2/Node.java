package c2;

public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    public String print() {
        String s = "";
        Node n = this;
        while(n.next != null){
            s += String.format("%s,", n.value);
            n = n.next;
        }
        s += n.value;
        return s;
    }
}
