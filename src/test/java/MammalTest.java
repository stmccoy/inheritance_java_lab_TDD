import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    Mammal mammal;

    @Before
    public void before(){
        mammal = new Mammal();
    }

    @Test
    public void mammalCanEat(){
        assertEquals("Animal is eating", mammal.eat());
    }

    @Test
    public void mammalCanBreath(){
        assertEquals("Animal is breathing", mammal.breathe());
    }

    @Test
    public void mammalCanTalk(){
        assertEquals("Mammal is talking", mammal.talk());
    }
}
