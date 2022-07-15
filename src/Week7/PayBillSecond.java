package Week7;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PayBillSecond {
    private static Scanner input = new Scanner(System.in);
    private static String customer;
    private static ArrayList<String> itemsPurchased = new ArrayList<>();
    private static ArrayList<Integer> piecesPurchased = new ArrayList<>();
    private static ArrayList<Integer> pricePerunit = new ArrayList<>();
    private static double discount;
    private static double amount;
    private static double total;
    private static double finalPrice;
    private static String cashier;

    public static void setCustomer(){
        System.out.println("What's the customer name");
        String name = input.nextLine();
        if(!Objects.equals(name, "")){
            customer = name;
        } else {
            System.out.println("Please enter a valid name");
            setCustomer();
        }
    }
    public static String getCustomer(){
        return customer;
    }
    public static void purchasedItems(){
        System.out.println("what did the user buy?");
        String buy = input.nextLine();
        if(!Objects.equals(buy, "")){
            itemsPurchased.add(buy);
        }  else {
            System.out.println("Please enter a valid input");
            purchasedItems();
        }
    }
    public static void purchasedPieces(){
        System.out.println("How many pieces?");
        int pieces = input.nextInt();
        if(pieces > 0){
            piecesPurchased.add(pieces);
        } else{
            System.out.println("Please input the number of pieces bought");
            purchasedPieces();
        }
    }
    public static void purchasedUnits(){
        System.out.println("How much per unit");
        int units = input.nextInt();
        if(units > 0){
            pricePerunit.add(units);
        } else {
            System.out.println("Please input a valid units");
        }
    }

    public static void addAnotherItems(){
        purchasedItems();
        purchasedPieces();
        purchasedUnits();
        input.nextLine();
        System.out.println("Add new Items");
        String newInput = input.nextLine();
        switch(newInput){
            case "YES", "yes", "Yes" :
                addAnotherItems();
            default: cashierName();
                    setDiscountGiven();
        }

    }
    public static void cashierName(){
        System.out.println("What is your name");
        String cashierFullName =input.nextLine();
        if(!Objects.equals(cashierFullName, "")) {
            cashier = cashierFullName;
        }else {
            System.out.println("Please add your name");
            cashierName();
        }
    }
    public static void setDiscountGiven(){
        System.out.println("How much discount will he get?");
        int discountGiven = input.nextInt();
    }

    public static double getDiscountGiven(){
        return discount / 100;
    }

    public static String getCashierName(){
        return cashier;
    }
}
