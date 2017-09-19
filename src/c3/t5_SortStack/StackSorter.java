package c3.t5_SortStack;

import java.util.Stack;

public class StackSorter {
    public static Stack sort(Stack<Integer> a) {


        Stack<Integer> b = new Stack();

        Tuple minMax = findMinMax(a, b);

        while(minMax.min < minMax.max){
            sort(a,b, minMax);
        }

        return a;
    }

    private static void sort(Stack<Integer> a, Stack<Integer> b, Tuple minMax) {
        int count = 0;
        while(!a.isEmpty()){
            int v = a.pop();
            if (v == minMax.min){
                count++;
            } else {
                b.push(v);
            }
        }

        while(!b.isEmpty()){
            int v = b.pop();
            if (v > minMax.min){
                a.push(v);
            } else {
                while(count > 0){
                    a.push(minMax.min);
                    count--;
                }
            }

            while(count > 0){
                a.push(minMax.min);
                count--;
            }
        }
    }

    private static Tuple findMinMax(Stack<Integer> a, Stack<Integer> b) {
        Integer min = null;
        Integer max = null;

        while(!a.isEmpty()){
            int v = a.pop();
            if (min == null || min > v){
                min = v;
            }
            if (max == null || max < v){
                max = v;
            }
            b.push(v);
        }

        while(!b.isEmpty()){
            a.push(b.pop());
        }

        return new Tuple(min, max);
    }

}
