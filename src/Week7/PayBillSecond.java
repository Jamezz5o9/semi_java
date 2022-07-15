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

    }
}
