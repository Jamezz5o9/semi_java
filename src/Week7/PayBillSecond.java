package Week7;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class PayBillSecond {
    private static final SimpleDateFormat simpledateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static final Date date = new Date();
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> itemsPurchased = new ArrayList<>();
    private static ArrayList<Integer> piecesPurchased = new ArrayList<>();
    private static ArrayList<Double> pricePerunit = new ArrayList<>();
    private static String customer;
    private static double discountGiven;
    private static double vat;
    private static double amount;
    private static double total;
    private static double finalAmount;
    private static String cashier;

    public static void main(String[] args) {
        outputProcessed();
    }

public static void outputProcessed(){
    setCustomer();
    addAnotherItems();
    slipStatement();
    moneyCollectedOnItems();
    receipt();

}
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
        double units = input.nextInt();
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
                break;
            default: cashierName();
                    setDiscountGiven();
        }

    }
    public static void cashierName(){
        System.out.println("What is your name");
        String cashierFullName = input.nextLine();
        if(!Objects.equals(cashierFullName, "")) {
            cashier = cashierFullName;
        }else {
            System.out.println("Name can't be left blank");
            cashierName();
        }
    }
    public static void setDiscountGiven(){
        System.out.println("How much discount will he get?");
        discountGiven = input.nextDouble();
    }
    public static void moneyCollectedOnItems(){
        System.out.println("How much did the customer give to you?");
        double amountPaid = input.nextDouble();
        if(amountPaid > 0.0){
            amount = amountPaid;
        } else{
            System.out.println("Amount paid can't be negative");
            moneyCollectedOnItems();

        }

    }
    public static double getPaidAmount(){
        return amount;
    }

    public static double getDiscountGiven(){
        return discountGiven / 100;
    }

    public static String getCashierName(){
        return cashier;
    }
    public static void slipStatement(){
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULEY WAY, SABO YABA. LAGOS");
        System.out.println("TEL: 03293828343");
        System.out.printf("Date: 20-May-22 5:22:49 pm%nCashier: %s%nCustomer Name: %s%n", getCashierName(), getCustomer());
        System.out.println("====================================================================");
        System.out.print("                   ");
        System.out.printf("%s%10s%10s%15s%n","ITEM","QTY","PRICE","TOTAL(NGN)");
        System.out.println("--------------------------------------------------------------------");
    }
    public static void slipDetails(){
        slipStatement();
        double totalPrice = 0;

        for(int i = 0; i < itemsPurchased.size(); i++){
            totalPrice = pricePerunit.get(i) * piecesPurchased.get(i);
            System.out.printf("%22s%11d%11.2f%11.2f%n",itemsPurchased.get(i), piecesPurchased.get(i), pricePerunit.get(i), (totalPrice));
        }
        System.out.println("---------------------------------------------------------------------");

        for(int i = 0; i < itemsPurchased.size(); i++){
            total +=  pricePerunit.get(i) * piecesPurchased.get(i);
        }

            double totalAndDiscount = total * getDiscountGiven();
            vat = total * 0.175;
            finalAmount = total - (totalAndDiscount + vat);

        System.out.printf("%50s: %10.2f%n%50s: %10.2f%n%50s: %10.2f%n", "SUB TOTAL", total, "DISCOUNT", totalAndDiscount,
                "VAT @ TOTAL", vat);
        System.out.println("==========================================================================");
        System.out.printf("%50s: %10.2f%n", "Bill Total", finalAmount);
        System.out.println("==========================================================================");
        System.out.printf("                 THIS IS NOT A RECEIPT KINDLY PAY %.2f%n", finalAmount);
        System.out.println("==========================================================================");
    }

    public static void receipt(){
        System.out.println("");
        System.out.printf("Purchased Date is %s", simpledateformat.format(date));
        slipDetails();
        double yourBalance = getPaidAmount() - finalAmount;
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%50s: %10.2f%n%50s: %10.2f%n%50s: %10.2f%n", "SUB TOTAL", total, "DISCOUNT", vat,
                "VAT @ TOTAL", vat);
        System.out.println("==========================================================================");
        System.out.printf("%50s: %10.2f%n", "Bill Total", finalAmount);
        System.out.printf("%51s: %9.2f%n", "Amount paid", getPaidAmount());
        System.out.printf("%47s: %11.2f%n", "Balance", yourBalance);
        System.out.println("==========================================================================");
        System.out.println("                   THANK YOU FOR YOUR PATRONAGE");
        System.out.println("==========================================================================");
    }

}
