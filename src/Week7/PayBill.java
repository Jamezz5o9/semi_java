package Week7;

import java.util.Scanner;

public class PayBill {
    public static void main(String[] args) {
        getInfo();
    }
    private static String name;
    private static String buy;
    private static int pieces;
    private static int unit;
    private static int userPerUnit;
    private static int discount;
    private static Scanner input = new Scanner(System.in);

    public static void getInfo(){
        System.out.println("what is the customer name?");
        name = input.next();

        System.out.println("What did the user buy?");
        buy = input.next();

        System.out.println("How many pieces");
        pieces = input.nextInt();

        add();

        System.out.println("What did the user buy");
        name = input.next();

        System.out.println("How Many pieces");
        pieces = input.nextInt();

        System.out.println("How much per unit");
        userPerUnit = input.nextInt();

        add();

        System.out.println("What is your name");
        name = input.next();

        System.out.println("How much discount will he get");
        discount = input.nextInt();

    }

    public static void add(){
        System.out.println("Add more items");
        String addItems = input.next();
        switch(addItems){
            case "YES":
               getInfo();
                break;

            case "No":
                System.out.println("Proceed to the next order");
                getInfo();
                break;
        }
    }
}
