package turtle;

import org.junit.jupiter.api.BeforeEach;
import turtle.Turtle;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;

public class TurtleTest {
    Turtle ijapa;
    @BeforeEach
    public void jennyWantsThis(){
        ijapa = new Turtle();
    }

    @Test
    public void thereIsATurtle(){
        assertNotNull(ijapa);
    }

    @Test
    public void turtleCanMovePenUp(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void tutleCanMovePenDownTest(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());

        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void turtleCanTurnRight_whileFacingEast(){

        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRight_whileFacingSouth(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());

    }

    @Test
    public void turtleCanTurnLeft_whileFacingEastTest(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());

    }



}
