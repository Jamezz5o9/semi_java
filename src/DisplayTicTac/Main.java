package DisplayTicTac;
import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import DisplayTicTac.exceptions.*;
import static DisplayTicTac.Mark.*;
import static java.lang.System.exit;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static int count;
    private static final SecureRandom random = new SecureRandom();
    private static final Player player1 = new Player(X, "James");
    private static final Player player2 = new Player(O, "Tade");
    private static final Board board = new Board();

    public static void main(String[] args) {
        startGame();
    }
    private static void startGame() {
        System.out.println();
        welcome();

        String mainMenu = """
                1 -> Play with another player
                2 -> Play with computer
                3 -> Exit;
                """;

            String start = input(mainMenu);
            switch(start) {
                case "1" -> playHuman();
                case "2" -> playComputer();
                case "3" -> exit(3);
            }
    }
    private static void playComputer() {
        try{
            firstPlayer();
            computerTurn();
        }
        catch(InvalidPosition | InvalidSpace e){
            System.out.println("Position doesn't exist pls play to another position");
            playComputer();
        }
    }
    private static void computerTurn() {
        try{
            System.out.println("Computer's turn");
            player2.move(board, 1 + (random.nextInt(9)));
            board.display();
            if(board.playerWins()) exit(3);
            playComputer();
        }
        catch(InvalidPosition | InvalidSpace e){
            System.out.println("Position doesn't exist pls play to another position");
            computerTurn();
        }
    }
    private static void welcome() {
        System.out.println("Welcome to the world best tictactoe game, pls enjoy carefully");       
    }
    private static void playHuman() {
        try{
            firstPlayer();
            secondPlayer();
        }
        catch(InvalidPosition | InvalidSpace e){
            System.out.println("Position doesn't exist pls play to another position");
            playHuman();
        }
    }
    private static void secondPlayer() {
        try{
            int position2 = inputInt("Enter position for Player2");
            player2.move(board, position2);
            board.display();
            if(board.playerWins()) exit(3);
            playHuman();
        }
        catch(InvalidPosition | InvalidSpace | InputMismatchException e){
            System.out.println("Position doesn't exist pls play to another position");
            scanner.nextLine();
            secondPlayer();
        }
    }
    private static void firstPlayer() {
            try{
                int position = inputInt("Enter position for Player 1");
                count += 1;
                player1.move(board, position);
                board.display();
                if(board.playerWins()) exit(3);
                if(count >= 5){
                    System.out.println("The game is a tie");
                    exit(3);
                }
            }catch(InvalidPosition | InvalidSpace | InputMismatchException e) {
                System.out.println("Position doesn't exist pls play to another position");
                scanner.nextLine();
                firstPlayer();
            }
    }
    private static int inputInt(String prompt) {
        display(prompt);
        int newInput = scanner.nextInt();
        if(newInput <= 0 || newInput > 9 )throw new InputMismatchException("Wrong input");
        return newInput;
    }
    private static String input(String prompt){
        display(prompt);
        String yourInput = scanner.nextLine();
        if(!Objects.equals(yourInput, "1") && !Objects.equals(yourInput, "2") && !Objects.equals(yourInput, "3")) startGame();
        else if(yourInput.equals("1")){
            playHuman();
        } else if(yourInput.equals("2")){
            playComputer();
        }else {
            exit(3);
        }
        return yourInput;
    }
    private static void display(String prompt){
        System.out.println(prompt);
    }
}
