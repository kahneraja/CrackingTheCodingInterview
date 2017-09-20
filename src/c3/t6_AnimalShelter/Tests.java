package c3.t6_AnimalShelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testA(){
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Cat());
        shelter.enqueue(new Dog());
        shelter.enqueue(new Cat());
        Animal a = shelter.dequeueAny();
        Animal b = shelter.dequeueDog();
        Animal c = shelter.dequeueCat();
        assertEquals(Cat.class, a.getClass());
        assertEquals(Dog.class, b.getClass());
        assertEquals(Cat.class, c.getClass());
    }

}
