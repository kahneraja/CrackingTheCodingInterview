package c1.t3_PalindromePermutation;

/**
 * Created by kahneraja on 8/12/17.
 */
public class App {
    public static boolean run(String abc) {

        return true;
    }

    public static boolean runWithMap(String s) {
        /**
         * trim spaces
         * shift to lower case
         * for each char
         *  increment the map
         * end
         * check map
         *  if odd length then only one item can be missing a pair
         *  if even then no items can be missing a pair
         */

        String cleaned = s.toLowerCase().replace(" ", "");
        int[] map = new int[127];
        int unmatchedPairsCounter = 0;
        for (char c : cleaned.toCharArray()) {
            map[c]++;
            if (map[c] % 2 != 0){
                unmatchedPairsCounter++;
            } else {
                unmatchedPairsCounter--;
            }
        }

        boolean isEvenLengthString = cleaned.length() % 2 == 0;
        return (isEvenLengthString && unmatchedPairsCounter == 0)
                || (!isEvenLengthString && unmatchedPairsCounter == 1);
    }

    public static boolean runBitwise(String s) {
        // works for only upper and lower case standard ascii using a 32bit int.
        String cleaned = s.toLowerCase().replace(" ", "");
        int map = 0;
        for (char c : cleaned.toCharArray()) {
            map = toggleIndex(map, c);
        }
        boolean isEvenLengthString = cleaned.length() % 2 == 0;
        return (isEvenLengthString && map == 0)
                || (!isEvenLengthString && hasSingleBitActive(map));
    }

    private static int toggleIndex(int map, char c) {
        map ^= 1 << c - 97;
        return map;
    }

    private static boolean hasSingleBitActive(int map) {
        return (map & (map-1)) == 0;
    }

}
