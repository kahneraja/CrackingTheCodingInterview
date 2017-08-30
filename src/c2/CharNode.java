package c2;

public class CharNode {
    public char v;
    public CharNode next;

    public CharNode(char value) { this.v = value; }

    public String print() {
        String s = "";
        CharNode n = this;
        while(n.next != null){
            s += String.format("%s,", n.v);
            n = n.next;
        }
        s += n.v;
        return s;
    }
}
