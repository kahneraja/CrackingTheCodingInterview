package c2.t7_Intersection;

import c2.CharNode;

public class App {
    public static CharNode findInsection(CharNode aHead, CharNode bHead) {

        int aLength = 1;
        int bLength = 1;
        CharNode aTail = aHead;
        CharNode bTail = bHead;
        int diff = 0;
        CharNode longHead;
        CharNode shortHead;

        while(aTail.next != null){
            aLength++;
            aTail = aTail.next;
        }
        while(bTail.next != null){
            bLength++;
            bTail = bTail.next;
        }

        if (aTail != bTail){
            return null;
        }

        if (aLength > bLength){
            diff = aLength - bLength;
            longHead = aHead;
            shortHead = bHead;
        } else {
            diff = bLength - aLength;
            longHead = bHead;
            shortHead = aHead;
        }

        while (diff > 0){
            longHead = longHead.next;
            diff--;
        }

        while(longHead != null){
            if (longHead == shortHead){
                return longHead;
            }
            longHead = longHead.next;
            shortHead = shortHead.next;
        }

        return null;
    }
}
