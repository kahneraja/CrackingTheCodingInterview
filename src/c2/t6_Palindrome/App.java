package c2.t6_Palindrome;

import c2.CharNode;

import java.util.Stack;

public class App {
    public static boolean isPalindrom(CharNode head) {
        Stack stack = new Stack<Character>();
        if (head == null){
            return false;
        }
        if (head.next == null){
            return false;
        }
        if (head.v == head.next.v){
            return true;
        }

        CharNode slowHead = head;
        CharNode fastHead = head.next;

        while(fastHead != null){
            stack.push(slowHead.v);
            slowHead = slowHead.next;
            if (fastHead.next == null){
                break;
            }
            fastHead = fastHead.next.next;
        }

        if (fastHead == null){
            slowHead = slowHead.next;
        }

        while(slowHead != null){
            if (stack.isEmpty()){
                return false;
            }
            char c = (char)stack.pop();
            if (c != slowHead.v){
                return false;
            }
            slowHead = slowHead.next;
        }

        return true;
    }
}
