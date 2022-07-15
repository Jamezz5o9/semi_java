package Week7;

import java.util.Objects;
import java.util.Scanner;

public class PayBill {
    public static void main(String[] args) {
        getInfo();
    }
    private static String name;
    private int item;
    private static String buy;
    private static int pieces;
    private static int calc;
    private static int userPerUnit;
    private static String addItems;
    private static int discount;
    private static Scanner input = new Scanner(System.in);

    public static void getInfo(){
        do{
            System.out.println("what is the customer name?");
            name = input.nextLine();

            System.out.println("What did the user buy?");
            buy = input.nextLine();

            System.out.println("How many pieces");
            pieces = input.nextInt();

            System.out.println("How much per unit");
            userPerUnit = input.nextInt();

            add();


        }while(Objects.equals(addItems, "No"));

        System.out.println("How much discount will he get");
        discount = input.nextInt();
    }

    public static void add(){
        System.out.println("Add more items");
        addItems = input.next();
        switch(addItems){
            case "YES":
               getInfo();
                break;

            case "No":
                System.out.println("Proceed to the next order");
                break;
        }

    }

    public static void getItem(){
        calc = userPerUnit * pieces;
    }
}



