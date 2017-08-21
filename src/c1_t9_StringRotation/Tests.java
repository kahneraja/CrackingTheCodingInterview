package c1_t9_StringRotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        assertEquals(App.run("watermelon", "melonwater"), true);
        assertEquals(App.run("watermelon", "melonwat3r"), false);
    }
}
