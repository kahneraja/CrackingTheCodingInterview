package c3.t1_ThreeInOne;

public class MultiStack<T> {

    private MetaInfo[] meta; // [{startPos: 0, len: 2}, {}]
    private T[] a;  // [1,2,4,5,null,null]

    public MultiStack(int size, int allocation) {
        setup(size);
        a = (T[]) new Object[allocation];
    }

    private void setup(int size) {
        meta = new MetaInfo[size];
        for (int i = 0; i < size; i++) {
            meta[i] = new MetaInfo(i);
        }
    }

    public void push(int index, T v) {
        shiftRight(index);
        MetaInfo info = meta[index];
        a[info.getCurrentPosition()] = v;
        info.length++;
    }

    public T pop(int index) {
        MetaInfo info = meta[index];
        info.length--;
        T value = a[info.getCurrentPosition()];
        shiftLeft(index);
        return value;
    }

    private void shiftLeft(int index) {
        for (int i = index + 1; i < meta.length; i++) {
            meta[i].startPosition--;
        }
        int startPosition = meta[index].getCurrentPosition();
        for (int position = startPosition; position < a.length - 1; position++) {
            a[position] = a[position + 1];
        }
        a[a.length - 1] = null;
    }

    private void shiftRight(int index) {
        for (MetaInfo info : meta) {
            if (info.index > index) {
                info.startPosition++;
            }
        }
        if (index < meta.length - 1) {
            int startPosition = meta[index + 1].startPosition;
            for (int position = a.length - 1; position >= startPosition; position--) {
                a[position] = a[position - 1]; //
            }
        }
    }

    public boolean isEmpty() {
        int count = getSize();
        return count == 0;
    }

    public boolean isFull() {
        int count = getSize();
        return count == a.length;
    }

    public String print() {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            T c = a[i];
            if (c != null) {
                s += c.toString();

            } else {
                s += "null";
            }
            if (i < a.length - 1) {
                s += ",";
            }
        }
        return s;
    }

    private int getSize() {
        int count = 0;
        for (MetaInfo info : meta) {
            count += info.length;
        }
        return count;
    }

}
