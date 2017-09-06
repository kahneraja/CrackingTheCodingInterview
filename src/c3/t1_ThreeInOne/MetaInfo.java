package c3.t1_ThreeInOne;

public class MetaInfo {

    int index;
    int startPosition;
    int length;

    public MetaInfo(int i) {
        index = i;
    }

    public int getCurrentPosition() {
        if (length == 0){
            return startPosition;
        }
        return startPosition + length;
    }
}
