package c3.t6_AnimalShelter;

import java.util.LinkedList;

public class AnimalShelter {

    LinkedList<Character> list = new LinkedList();

    public void enqueue(char v) {
        list.add(v);
    }

    /**
     * seems this questions is primarily about type safety rather than queue / stack performance. bleh. pass.
     */

    public char dequeueAny() {
        return list.removeLast();
    }

    public char dequeueDog() {
        int index = list.lastIndexOf('d');
        return list.remove(index);
    }

    public char dequeueCat() {
        int index = list.lastIndexOf('c');
        return list.remove(index);
    }
}
