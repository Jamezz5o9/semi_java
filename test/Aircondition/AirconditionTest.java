package Aircondition;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirconditionTest {
    private Aircondition aircondition;
    @BeforeEach
    public void setUp(){
        aircondition = new Aircondition();
    }

    @Test
    public void testThatAcCanBeTurnedOn(){
        aircondition.turnOn();
       assertTrue(aircondition.isOn());
    }
    @Test
    public void testThatAcCanBeTurnedOff(){
        aircondition.turnOn();
        aircondition.turnOff();
        assertFalse(aircondition.isOn());
    }
    @Test
    public void testThatWeCanIncreaseTempByOne(){
        aircondition.turnOn();
        aircondition.increaseTemp();
        assertEquals(17, aircondition.getTemp());
        aircondition.increaseTemp();
        aircondition.increaseTemp();
        assertEquals(19, aircondition.getTemp());
    }
    @Test
    public void testThanAirconditionCannotGoBellowItsInitialTemp(){
        aircondition.turnOn();
       for(int i = 0; i < 7; i++){
           aircondition.decreaseTemp();
       }
        assertEquals(16, aircondition.getTemp());
    }
    @Test
    public void testThanAirconditionCannotGoAboveItsMaxTemp(){
        aircondition.turnOn();
        for(int i = 0; i < 17; i++){
            aircondition.increaseTemp();
        }
        assertEquals(30, aircondition.getTemp());
    }
    @Test
    public void testThanAirconditionCanDecreaseByOne(){
        aircondition.turnOn();
        for(int i = 0; i < 4; i++){
            aircondition.increaseTemp();
        }
        aircondition.decreaseTemp();
        aircondition.decreaseTemp();
        assertEquals(18, aircondition.getTemp());
        aircondition.decreaseTemp();
        assertEquals(17, aircondition.getTemp());
    }
}
