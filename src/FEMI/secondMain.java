package FEMI;

import java.util.Scanner;

import static java.lang.System.exit;


public class secondMain {
    private static final TimeFormatter time = new TimeFormatter();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        startTimeFormat();
    }
    public static void startTimeFormat(){
        String mainMenu = """
              Standard and Universal Time format
              1 -> Standard Time format
              2 -> Universal Time format
              3 -> Exit
              """;

        String startNew = input(mainMenu);
        switch (startNew){
            case "1" -> newStandard();
            case "2" -> newUniversal();
            case "3" -> exit(3);
        }
    }

    private static String input(String mainMenu) {
        displayNew(mainMenu);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static void displayNew(String mainMenu) {
        System.out.println(mainMenu);
    }

    private static void newUniversal() {
        checkHour();
        checkMins();
        checkSeconds();
        displayUniversal("Universal Format display", time);
    }

    private static void newStandard() {
        checkHour();
        checkMins();
        checkSeconds();
        displayStandard("Standard Format display", time);
    }

    private static void displayUniversal(String header, TimeFormatter t) {
        System.out.printf("%s%nStandard Time: %s%n", header, t.toUniversalString());

    }
    private static void displayStandard(String header, TimeFormatter t){
        System.out.printf("%s%nStandard Time: %s%n", header, t.toStandardTime());
    }
    private static void checkSeconds() {
        try{
            System.out.print("Enter seconds: ");
            int seconds = input.nextInt();
            time.setSeconds(seconds);

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            checkSeconds();
        }
    }

    private static void checkMins() {
        try{
            System.out.print("Enter minutes: ");
            int minutes = input.nextInt();
            time.setMinutes(minutes);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            checkMins();
        }
    }

    private static void checkHour() {
        try {
            System.out.print("Enter hour: ");
            int hour = input.nextInt();
            time.setHour(hour);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            checkHour();
        }

    }

}
