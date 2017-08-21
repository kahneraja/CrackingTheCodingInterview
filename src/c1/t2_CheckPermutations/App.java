package c1.t2_CheckPermutations;

import java.util.Arrays;

/**
 * Created by kahneraja on 8/12/17.
 */
public class App {
    public static boolean run(String a, String b) {
        return true;
    }

    public static boolean runWithMap(String a, String b) {
        // check they are equal length
        // loop through a
        // add or remove count from map
        //
        if (a.length() != b.length()){
            return false;
        }
        int[] charMap = new int[127];
        for(int i = 0; i < a.length(); i++){
            char x = a.charAt(i);
            char y = b.charAt(i);
            addOrRemoveMap(charMap, x);
            addOrRemoveMap(charMap, y);
        }
        return isPending(charMap);
    }

    private static boolean isPending(int[] charMap) {
        for(int i: charMap){
            if (i > 0){
                return false;
            }
        }
        return true;
    }

    private static void addOrRemoveMap(int[] charMap, char x) {
        if (charMap[x] > 0){
            charMap[x]--;
        } else {
            charMap[x]++;
        }
    }

    public static boolean runWithSorting(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        return Arrays.equals(aChars, bChars);
    }
}