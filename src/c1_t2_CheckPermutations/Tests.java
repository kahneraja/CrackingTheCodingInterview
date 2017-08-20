package c1_t2_CheckPermutations;

/**
 * Created by kahneraja on 8/12/17.
 */
/**
 * Created by kahneraja on 8/12/17.
 */


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * approaches:
 * - loop through both strings from left to right and track a running count using a hashmap. if at the end the hashmap is empty then. bingo!
 * - step through one, find the string and then remove it.
 * - sort both O(n log n) and then compare them.
 *
 * Describe what it means for two strings to be permutations of each other. Now, look at that definition you provided. Can you check the strings against that definition?
 *
 * A permutation is of a string is a repetition of the same characters in any order. for example. "aaab" is a permutation of "abaa".
 *
 *
 **/


public class Tests {

    @Test
    public void testA() {

        assertEquals(App.runWithSorting("abc", "cba"), true);
        assertEquals(App.runWithSorting("apple", "papel"), true);
        assertEquals(App.runWithSorting("carrot", "tarroc"), true);
        assertEquals(App.runWithSorting("hello", "llloh"), false);

    }

    @Test
    public void testB() {

        assertEquals(App.runWithMap("abc", "cba"), true);
        assertEquals(App.runWithMap("apple", "papel"), true);
        assertEquals(App.runWithMap("carrot", "tarroc"), true);
        assertEquals(App.runWithMap("hello", "llloh"), false);
    }

    @Test
    void testC() {
        assertEquals('1', 49);
        assertEquals('a', 97);
        assertEquals('\0', 0);
        assertEquals('\u007F', 127);
    }
}
