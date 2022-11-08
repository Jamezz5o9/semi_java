package Television;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    private Television television;

    @BeforeEach
    public void setUp(){
        television = new Television();
    }

    @Test
    public void testThatTelevisionIsOn(){
        television.turnOn();
        assertTrue(television.isOn());
    }

    @Test
    public void testThatWeCanSwitchOffTelevision(){
        television.turnOff();
        assertFalse(television.isOn());
    }

    @Test
    public void testThatWeCanIncreaseVolume(){
        television.turnOn();
        television.increaseVolume();
        assertEquals(1, television.getVol());
        for(int i = 0; i < 4; i++){
            television.increaseVolume();
        }
        assertEquals(5, television.getVol());
    }

    @Test
    public void testThatWeCanDecreaseVolume(){
        television.turnOn();
        for(int i = 0; i < 4; i++){
            television.increaseVolume();
        }
        television.decreaseVolume();
        assertEquals(3, television.getVol());
    }

    @Test
    public void testThatWeCanSetChannel(){
        television.turnOn();
        television.setChannel(40);
        assertEquals(40, television.getChannel());
        television.setChannel(60);
        assertEquals(60, television.getChannel());
    }

    @Test
    public void testThatWeCanMuteChannel(){

    }

}
