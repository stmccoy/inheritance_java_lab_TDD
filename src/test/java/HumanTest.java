import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    Human human;

    @Before
    public void before(){
        human = new Human();
    }

    @Test
    public void humanCanEat(){
        assertEquals("Animal is eating", human.eat());
    }

    @Test
    public void humanCanBreath(){
        assertEquals("Animal is breathing", human.breathe());
    }

    @Test
    public void humanCanTalk(){
        assertEquals("Mammal is talking", human.talk());
    }

    @Test
    public void humanCanWalk(){
        assertEquals("Human walks to pub", human.walk());
    }
}
