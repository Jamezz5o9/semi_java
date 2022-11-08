package DisplayTicTac;
import DisplayTicTac.exceptions.*;

import static DisplayTicTac.Mark.*;

public class Player {
    private Mark mark;
    private String name;

    public Player(Mark mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    public void move(Board board, int position){
        Mark[][] floor = board.getMarks();

        int currentRow = 0;
        int currentCol = position - 1;


        if(position < 1 || position > 9) throw new InvalidPosition("value should be >= 1 or <= 9");

        if(position > 3){
            currentRow = 1;
            currentCol = position - 4;
        }
        if(position > 6){
            currentRow = 2;
            currentCol = position - 7;
        }

    if(floor[currentRow][currentCol] == E){
        floor[currentRow][currentCol] = mark;
    } else{
        throw new InvalidSpace("You can only move to an empty space");
    }

    }
    public Mark getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

}
