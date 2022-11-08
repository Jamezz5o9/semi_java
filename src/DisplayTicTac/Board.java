package DisplayTicTac;

import static DisplayTicTac.Mark.*;

public class Board {

    private final Mark[][] marks = {{E, E, E}, {E, E, E}, {E, E, E}};

    public Mark[][] getMarks() {
        return marks;
    }

    public void display() {
        for(int i = 0; i < marks.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " | ");
            }
            System.out.println();
        }
    }
    public boolean playerWins(){
        if(isFirstWinner()) return true;
        else if(isSecondWinner()) return true;
        else if(isThirdWinner()) return true;
        else if(isFourthWinner()) return true;
        else if(isFifthWinner()) return true;
        else if(isSixthWinner()) return true;
        else if(isSeventhWinner()) return true;
        else return isEightWinner();
    }

    private boolean isEightWinner() {
        boolean XWins = marks[0][1] == X && marks[1][1] == X && marks[2][1] == X;
        boolean OWins = marks[0][1] == O && marks[1][1] == O && marks[2][1] == O;
        isTheWinner(XWins, OWins);
        return XWins || OWins;
    }

    private boolean isSeventhWinner() {
        boolean XWins = marks[0][2] == X && marks[1][1] == X && marks[2][0] == X;
        boolean OWins = marks[0][2] == O && marks[1][1] == O && marks[2][0] == O;
        isTheWinner(XWins, OWins);
        return XWins || OWins;
    }

    private boolean isSixthWinner() {
        boolean XWins = marks[0][0] == X && marks[1][1] == X && marks[2][2] == X;
        boolean OWins = marks[0][0] == O && marks[1][1] == O && marks[2][2] == O;
        isTheWinner(XWins, OWins);
        return XWins || OWins;
    }

    private boolean isFifthWinner() {
        boolean XWins = marks[1][0] == X && marks[1][1] == X && marks[1][2] == X;
        boolean OWins = marks[1][0] == O && marks[1][1] == O && marks[1][2] == O;
        isTheWinner(XWins, OWins);
        return XWins || OWins;
    }

    private boolean isFourthWinner() {
        boolean XWins = marks[2][0] == X && marks[2][1] == X && marks[2][2] == X;
        boolean OWins = marks[2][0] == O && marks[2][1] == O && marks[2][2] == O;
        isTheWinner(XWins, OWins);
        return XWins || OWins;
    }

    private boolean isThirdWinner() {
        boolean XWins = marks[0][0] == X && marks[1][0] == X && marks[2][0] == X;
        boolean OWins = marks[0][0] == O && marks[1][0] == O && marks[2][0] == O;
        isTheWinner(XWins, OWins);
        return XWins || OWins;
    }

    private boolean isSecondWinner() {
        boolean XWins = marks[0][2] == X && marks[1][2] == X && marks[2][2] == X;
        boolean OWins = marks[0][2] == O && marks[1][2] == O && marks[2][2] == O;
        isTheWinner(XWins, OWins);
        return XWins || OWins;
    }

    private boolean isFirstWinner() {
        boolean XWins = marks[0][0] == X && marks[0][1]== X && marks[0][2] == X;
        boolean OWins = marks[0][0] == O && marks[0][1]== O && marks[0][2] == O;
        isTheWinner(XWins, OWins);
        return XWins || OWins;
    }

    private void isTheWinner(boolean xWins, boolean oWins) {
        if(xWins) System.out.println("Player 1 is the winner of this game");
        if(oWins) System.out.println("Player 2 is the winner of this game");
    }
    public boolean isATie(){
        boolean isDraw = !(playerWins() && emptyTie());
        if(isDraw) System.out.println("The game is a tie");
        return isDraw;
    }

    private boolean emptyTie() {
        for(Mark[] displayBoard: marks){
            for(Mark board: displayBoard){
                if(board == E) return true;
            }
        }
        return false;
    }


}

