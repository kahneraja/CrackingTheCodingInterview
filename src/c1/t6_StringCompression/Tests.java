package c1.t6_StringCompression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    /**
     *
     * Implement a method to perform basic string compression using the counts of repeated characters.
     * For example, the string aabcccccaaa would become a2b1c5a3.
     * If the "compressed" string would not become smaller than the original string,
     * your method should return the original string. You can assume the string has
     * only uppercase and lowercase letters (a - z).
     *
     * Hints: #92, # 110
     *
     *
     *
     *
     */

    @Test
    public void test1(){
        char c = '\0';
        assertEquals(c, '\0');
    }

    @Test
    public void testA(){
        assertEquals("a3", App.run("aaa"));
        assertEquals("a2b1c5a3", App.run("aabcccccaaa"));
        assertEquals("a", App.run("a"));
        assertEquals("abcdefg", App.run("abcdefg"));

    }
}
