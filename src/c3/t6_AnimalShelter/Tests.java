package c3.t6_AnimalShelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue('c');
        shelter.enqueue('d');
        shelter.enqueue('c');
        char a = shelter.dequeueAny();
        char d = shelter.dequeueDog();
        char c = shelter.dequeueCat();
        assertEquals('c', a);
        assertEquals('c', c);
        assertEquals('d', d);
    }

    /**
     * seems this questions is primarily about type safety rather than queue / stack performance. bleh. pass.
     */

}
