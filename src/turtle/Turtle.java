package turtle;

import static turtle.Direction.*;

public class Turtle {
    private final Position currentPosition = new Position(0, 0);

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
        if(currentDirection == EAST) eastMovement(noOfSteps);
        if(currentDirection == WEST) westMovement(noOfSteps);
        if(currentDirection == SOUTH) southMovement(noOfSteps);
        if(currentDirection == NORTH) northMovement(noOfSteps);
    }

    private void westMovement(int noOfSteps){
        int newColumn = currentPosition.getColumn() - noOfSteps;
        currentPosition.setColumn(newColumn);
    }
    private void northMovement(int noOfSteps){
        int newRow = currentPosition.getRow() - noOfSteps;
        currentPosition.setRow(newRow);
    }
    private void eastMovement(int noOfSteps){
        int newColumn = currentPosition.getColumn() + noOfSteps;
        currentPosition.setColumn(newColumn);
    }
    private void southMovement(int noOfSteps){
        int newRow = currentPosition.getRow() + noOfSteps;
        currentPosition.setRow(newRow);
    }

    public  void move(int noOfSteps, Sketchpad sketchpad){
        noOfSteps = noOfSteps - 1;
        if(!penIsUp) writeOn(sketchpad, noOfSteps);
        move(noOfSteps);
    }

    private void writeOn(Sketchpad sketchpad, int noOfSteps) {
        int[][] floor = sketchpad.getFloor();
        int currentRow = currentPosition.getRow();
        int currentCol = currentPosition.getColumn();

        if(currentDirection == EAST){
            for(int i = 0; i <= noOfSteps; i++){
                floor[currentRow][currentCol++] = 1;
            }

        }
        if(currentDirection == SOUTH){
            for(int i = 0; i <= noOfSteps; i++){
                floor[currentRow++][currentCol] = 1;
            }
        }
        if(currentDirection == WEST){
            for(int i = 0; i < noOfSteps; i++){
                floor[currentRow][--currentCol] = 1;
            }
        }
        if(currentDirection == NORTH){
            for(int i = 0; i < noOfSteps; i++){
                floor[--currentRow][currentCol] = 1;
            }
        }

    }

}
