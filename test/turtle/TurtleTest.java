package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;

public class TurtleTest {
    Turtle ijapa;
    Sketchpad sketchpad;

    @BeforeEach
    public void jennyWantsThis(){
        ijapa = new Turtle();
        sketchpad = new Sketchpad(5,5);
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

    @Test
    public void turtleCanMoveWhileFacingEastAndPenIsUpTest(){
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
        ijapa.penUp();

        ijapa.move(3, sketchpad);

        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());
        ijapa.move(3, sketchpad);

        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveWhileFacingSouth(){
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
        ijapa.penUp();
        Sketchpad sketchpad = new Sketchpad(5,5);
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(6, sketchpad);
        assertEquals(new Position(5, 0), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.move(5, sketchpad);
        assertEquals(new Position(5, 4), ijapa.getCurrentPosition());

    }
    @Test
    public void turtleCanWriteWhenPenIsDownTest(){
        ijapa.penDown();
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
        assertFalse(ijapa.isPenUp());

        ijapa.move(3, sketchpad);
        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());

        int[][] floor = sketchpad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, floor[0][3]);
        sketchpad.display();
    }
    @Test
    public void turtleCanWriteWhenPenisFacingSouthTest(){
        ijapa.penDown();
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());

        ijapa.move(3, sketchpad);
        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.move(3, sketchpad);
        assertEquals(new Position(2, 2), ijapa.getCurrentPosition());

        int[][] floor = sketchpad.getFloor();

        assertEquals(1, floor[1][2]);
        assertEquals(1, floor[2][2]);
        assertEquals(0, floor[3][2]);

        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.move(3, sketchpad);
        assertEquals(new Position(2, 0), ijapa.getCurrentPosition());

        assertEquals(1, floor[2][1]);
        assertEquals(1, floor[2][2]);

        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.move(3, sketchpad);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        sketchpad.display();


    }



}
