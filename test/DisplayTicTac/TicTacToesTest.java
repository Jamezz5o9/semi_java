package DisplayTicTac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static DisplayTicTac.Mark.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToesTest {

    private Board board;
    private Player player1;
    private Player player2;


    @BeforeEach()
    public void setUp(){
        board = new Board();
        player1 = new Player(X, "James");
        player2 = new Player(O, "Bolaji");
    }

    @Test
    public void testThatWeHaveABoard(){
        assertNotNull(board);
    }

    @Test
    public void testThatBoardIsEmpty(){
        board.display();
    }

    @Test
    public void testThatWeHaveTwoHumanPlayers(){
        assertEquals(X, player1.getMark());
        assertEquals(O, player2.getMark());
    }

    @Test
    public void testThatPlayersCanMove(){

        Mark[][] floor = board.getMarks();
        player1.move(board, 1);
        assertEquals(X, floor[0][0]);
        player2.move(board, 2);
        player1.move(board, 3);
        player1.move(board, 9);
        player1.move(board, 4);
        assertEquals(X, floor[1][0]);
        board.display();
    }
    @Test
    public void testThatCanPlayer1CanWinAtFirstPosition(){
        player1.move(board, 1);
        player1.move(board, 2);
        player1.move(board, 3);
        assertTrue(board.playerWins());
    }

    @Test
    public void testThatPlayer2CanWinAtSecondPosition(){
        player2.move(board, 4);
        player2.move(board, 5);
        player2.move(board, 6);
        assertTrue(board.playerWins());
    }
    @Test
    public void testThatPlayerCanWinAtThirdPositionOnBoard(){
        player1.move(board, 1);
        player1.move(board, 4);
        player1.move(board, 7);
        assertTrue(board.playerWins());
    }

    @Test
    public void testThatPlayerCanWinAtFourthPositionOnBoard(){
        player1.move(board, 7);
        player1.move(board, 8);
        player1.move(board, 9);
        assertTrue(board.playerWins());
    }
    @Test
    public void testThatPlayerCanWinAtFifthPositionOnBoard() {
        player1.move(board, 2);
        player1.move(board, 5);
        player1.move(board, 8);
        assertTrue(board.playerWins());
    }
    @Test
    public void testThatPlayerCanWinAtSixthPosition(){
        player1.move(board, 4);
        player2.move(board, 1);
        player1.move(board, 2);
        player2.move(board, 5);
        player1.move(board, 3);
        player2.move(board, 9);
        assertTrue(board.playerWins());
    }

    @Test
    public void testThatPlayerHaveTie(){

        player1.move(board, 1);
        player2.move(board, 2);
        player1.move(board, 3);
        player2.move(board, 9);
        player1.move(board, 5);
        player2.move(board, 6);
        player1.move(board, 4);
        player2.move(board, 7);
        player1.move(board, 8);
        board.display();
        assertTrue(board.isATie());

    }
}
