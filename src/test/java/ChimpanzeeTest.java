import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChimpanzeeTest {

    Chimpanzee chimpanzee;                                                                       

    @Before
    public void before(){
        chimpanzee = new Chimpanzee();
    }

    @Test
    public void chimpanzeeCanEat(){
        assertEquals("Animal is eating", chimpanzee.eat());
    }

    @Test
    public void chimpanzeeCanBreath(){
        assertEquals("Animal is breathing", chimpanzee.breathe());
    }

    @Test
    public void chimpanzeeCanTalk(){
        assertEquals("Mammal is talking", chimpanzee.talk());
    }

    @Test
    public void chimpanzeeCanWalk(){
        assertEquals("Chimpanzee walks to tree", chimpanzee.walk());
    }

}
