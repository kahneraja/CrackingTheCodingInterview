package c1_t3_URLify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by kahneraja on 8/12/17.
 *
 * URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
 *
 * EXAMPLE
 *
 *
 * Input: "Mr John Smith    "
 * Output: "Mr%20John%20Smith"
 * Hints: extra spaces provided, work from the end, find the total number of spaces first?
 *
 * Approaches
 *
 * - loop through the array. find the empty char. shift the array along. apply the '%20' 3 chars in the empty space.
 * - create a new array. loop through. apply char or spaces as required. O(n)
 *
 */
public class Tests {

    @Test
    public void testA(){

        assertEquals(App.run("Mr John Smith    "), "Mr%20John%20Smith");

    }

}
