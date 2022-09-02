package turtle;

public class Sketchpad {

    private int[][] floor;
    public Sketchpad(int noOfRows, int noOfCols){
        floor = new int[noOfRows][noOfCols];

    }

    public int[][] getFloor() {
        return floor;
    }
}
