package turtle;

import static turtle.Direction.*;

public class Turtle {

    private Direction currentDirection = EAST;
    private boolean isPenUp;
    public void penUp() {
        isPenUp = true;
    }
    public boolean isPenUp() {
        return isPenUp;

    }
    public void penDown() {
        isPenUp = false;
    }

    public Direction getCurrentDirection(){
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == WEST) face(NORTH);
        else if(currentDirection == SOUTH) face(WEST);
        else if(currentDirection == EAST) face(SOUTH);
        else face(EAST);

    }

    public void turnLeft() {
        if(currentDirection == WEST) face(SOUTH);
        else if(currentDirection == NORTH) face(WEST);
        else if(currentDirection == EAST) face(NORTH);
        else face(EAST);

    }

    public void face(Direction newDirection){
        currentDirection = newDirection;
    }
}
