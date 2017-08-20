package c1_t6_StringCompression;

public class App {
    public static String run(String s) {

        /** walk backwards from the end.
         * from repeating characters
         * swap out repeating sets
         *
         * question:
         * - how to work with an array size that is incorrect/
         * - how to remove replicating chars and replace them?
         * - how to shift ranges in an array.
         *
         * approach:
         * - create a new empty string
         * - walk through from left to right
         * - keep track of the matching count.
         *
         */

        if (s.length() < 3){
            return s;
        }

        String compressed = "";

        char[] chars = s.toCharArray();
        int range = 0;

        for (int i = 0; i < chars.length - 1; i++) {
            char left = chars[i];
            char right = chars[i + 1];

            if (left != right) {
                compressed += String.valueOf(left) + String.valueOf(range + 1);
                range = 0;
            } else if (i >= chars.length - 2) {
                compressed += String.valueOf(left) + String.valueOf(range + 2);
                range = 0;
            } else {
                range++;
            }

        }

        if (compressed.length() < s.length()){
            return compressed;
        }
        return s;
    }


}
