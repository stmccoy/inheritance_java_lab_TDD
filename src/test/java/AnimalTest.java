import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal;

    @Before
    public void before(){
        animal = new Animal();
    }

    @Test
    public void animalCanEat(){
        assertEquals("Animal is eating", animal.eat());
    }

    @Test
    public void animalCanBreath(){
        assertEquals("Animal is breathing", animal.breathe());
    }

}
