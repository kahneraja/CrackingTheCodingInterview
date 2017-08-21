package c1.t4_OneWay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * One Way
 *
 * String Editing.
 *
 * 1. insert a char
 * 2. remove a char
 * 3. replace a char
 *
 * Write a function to check if a string is one edit away.
 *
 * Approaches:
 *
 * - String must be have a length of at most 1.
 * - If the string is equal in length then only one char must be different. (to be replaced)
 * - If the string is different in length then all the existing chars must be identical. (one to be removed or added)
 *
 */

public class Tests {

    @Test
    public void testA(){

            assertEquals(App.run("abcd", "abce"), true);
        assertEquals(App.run("abcd", "abc"), true);
        assertEquals(App.run("abcd", "abcdef"), false);
        assertEquals(App.run("abc", "cde"), false);

        assertEquals(App.run("", "d"), true);
        assertEquals(App.run("d", "de"), true);
        assertEquals(App.run("pale", "pse"), false);
        assertEquals(App.run("acdsfdsfadsf", "acdsgdsfadsf"), true);
        assertEquals(App.run("acdsfdsfadsf", "acdsfdfadsf"), true);
        assertEquals(App.run("acdsfdsfadsf", "acdsfdsfads"), true);
        assertEquals(App.run("acdsfdsfadsf", "cdsfdsfadsf"), true);
        assertEquals(App.run("adfdsfadsf", "acdfdsfdsf"), false);
        assertEquals(App.run("adfdsfadsf", "bdfdsfadsg"), false);
        assertEquals(App.run("adfdsfadsf", "affdsfads"), false);
        assertEquals(App.run("pale", "pkle"), true);
        assertEquals(App.run("pkle", "pable"), false);


    }

}
