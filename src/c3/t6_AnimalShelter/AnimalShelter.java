package c3.t6_AnimalShelter;

import java.util.LinkedList;

public class AnimalShelter {

    int order = 0;
    LinkedList<Animal> cats = new LinkedList();
    LinkedList<Animal> dogs = new LinkedList();

    public void enqueue(Animal a) {
        a.order = order;
        if (a.getClass() == Cat.class){
            cats.add(a);
        } else {
            dogs.add(a);
        }
        order++;
    }

    public Animal dequeueAny() {
        Animal cat = cats.peekLast();
        Animal dog = dogs.peekLast();
        if (cat != null && cat.order > dog.order){
            cats.removeLast();
            return cat;
        }

        dogs.removeLast();
        return dog;
    }

    public Animal dequeueDog() {
        return dogs.removeLast();
    }

    public Animal dequeueCat() {
        return cats.removeLast();
    }
}
