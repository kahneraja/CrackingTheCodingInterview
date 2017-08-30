package c2;

public class IntNode {
    public int v;
    public IntNode next;

    public IntNode(int value) {
        this.v = value;
    }

    public String print() {
        String s = "";
        IntNode n = this;
        while(n.next != null){
            s += String.format("%s,", n.v);
            n = n.next;
        }
        s += n.v;
        return s;
    }
}
