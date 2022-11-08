package turtle;

public class Sketchpad {
    int noOfRows;
    int noOfCols;
    private int[][] floor;
    public Sketchpad(int noOfRows, int noOfCols){
        floor = new int[noOfRows][noOfCols];
        this.noOfRows = noOfRows;
        this.noOfCols = noOfCols;
    }
    public int[][] getFloor() {
        return floor;
    }

    public void display(){
        for(int i = 0; i < noOfRows; i++){
            for(int j = 0; j < noOfCols; j++){
                if (floor[i][j] == 1) {
                    System.out.print(" x |");
                } else{
                    System.out.print(" o |");
                }
            }
            System.out.println();
        }
    }

}
