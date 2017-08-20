package c1_t1_IsUnique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by kahneraja on 8/12/17.
 */
public class Tests {

    @Test
    void testA(){
        assertEquals(App.run("a"), true);
    }


    @Test
    void testB() {
        assertEquals(App.runBitWise("abcdde"), false);
    }

    @Test
    void bitwiseShifting() {
        assertEquals(2,1 << 1); // 00000001 > 00000010
        assertEquals(8,1 << 3); // 00000001 > 00001000
        assertEquals(4,8 >> 1); // 00000100 > 00000100
        assertEquals(3,24 >> 3); // 00001100 > 00000011

        assertEquals('e' - 'a', 4);
        assertEquals(16, 1 << 4);


        assertEquals(16, 16 & (1 << 4));
    }
}
