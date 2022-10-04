package CreditCard;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static final CreditCard cardNew = new CreditCard();
    public static void main(String[] args) {
        checkValidity();
    }

    private static void checkValidity() {
        String mainMenu = """
                1 -> Check Card Validity
                2 -> Exit
                """;

        String newMain = input.next(mainMenu);
        switch (newMain){
            case "1" -> checkCard();
            case "2" -> exit(2);
        }

    }
    private static void checkCard() {
        System.out.println("Enter your card Number pls!!!");
        String card = input.nextLine();

        try{
            cardNew.isValid(card);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());

        }
    }
}
