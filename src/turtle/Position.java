package turtle;

import java.util.function.BooleanSupplier;

public class Position{
private int row = 0;
private int column = 0;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void setRow(int row){
        this.row = row;
    }
    public int getRow(){
        return row;
    }
    public void setColumn(int column){
        this.column = column;
    }
    public int getColumn(){
        return column;
    }

    @Override
    public boolean equals(Object obj){
        if(!obj.getClass().equals(this.getClass())) return false;
        boolean isEqual = false;
        Position comparedPosition = (Position) obj;
        boolean rowsAreEqual = comparedPosition.row ==this.row;
        boolean columnsAreEqual = comparedPosition.column == this.column;
        if(columnsAreEqual == rowsAreEqual) isEqual = true;

        return isEqual;
    }


    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
