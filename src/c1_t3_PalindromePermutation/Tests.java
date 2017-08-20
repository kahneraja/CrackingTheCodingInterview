package c1_t3_PalindromePermutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by kahneraja on 8/12/17.
 *
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * Spaces and upper / lower cases are not significant.
 *
 *#106, #121, #134, #136
 * Approaches:
 * - If the sentence has an even number of letters then each letter must have a pair. Otherwise the middle letter can be unpaired. This can be achieved with a map or a bit vector
 *
 */
public class Tests {


    @Test
    void testA() {
        assertEquals(0 % 2, 0);
        assertEquals(4 % 2, 0);
        assertNotEquals(3 % 2, 0);
    }

    @Test
    public void testB(){
        assertEquals(App.runWithMap("Tact Coa"), true);
        assertEquals(App.runWithMap("Tact Coad"), false);
        assertEquals(App.runWithMap("aba"), true);
        assertEquals(App.runWithMap("Red Roses run no risk, sir, on nurses order"), true);
        assertEquals(App.runWithMap("rdReses rird Ro, on nursesun no risk, s oer"), true);
    }

    @Test
    public void testC(){
        assertEquals(App.runBitwise("Tact Coa"), true);
        assertEquals(App.runBitwise("Tact Coad"), false);
        assertEquals(App.runBitwise("aba"), true);
        assertEquals(App.runBitwise("Red Roses run no risk, sir, on nurses order"), true);
        assertEquals(App.runBitwise("rdReses rird Ro, on nursesun no risk, s oer"), true);
    }

    @Test
    public void testD(){
        assertEquals(0 | 'a', 97);
        assertEquals(1 << 1, 2);
    }

}
