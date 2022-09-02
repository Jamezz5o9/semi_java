package turtle;

import static turtle.Direction.*;

public class Turtle {
    private Position currentPosition = new Position(0, 0);

    private Direction currentDirection = EAST;
    private boolean penIsUp;
    public void penUp() {
        penIsUp = true;
    }
    public boolean isPenUp() {
        return penIsUp;

    }
    public void penDown() {
        penIsUp = false;
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
    public Position getCurrentPosition(){
        return currentPosition;
    }

    private void move(int noOfSteps) {
        noOfSteps = noOfSteps - 1;
        int newColumn = currentPosition.getColumn() + noOfSteps;
        int newRow = currentPosition.getRow() + noOfSteps;
        if(currentDirection == EAST) currentPosition.setColumn(newColumn);
        if(currentDirection == WEST) currentPosition.setColumn(newColumn);
        if (currentDirection == SOUTH) currentPosition.setRow(newRow);
        if(currentDirection == NORTH) currentPosition.setRow(newRow);
    }

    public  void move(int noOfSteps, Sketchpad sketchpad){
        if(!penIsUp) writeOn(sketchpad, noOfSteps);

        move(noOfSteps);
    }

    private void writeOn(Sketchpad sketchpad, int noOfSteps) {
    }

}
