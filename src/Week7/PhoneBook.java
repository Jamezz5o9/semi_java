package Week7;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        phoneBookDetails();
    }
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<String> addresses = new ArrayList<>();
    private static ArrayList<String> phoneNumbers = new ArrayList<>();
    private static ArrayList<String> emails = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void getName(){
        String newName = "";
        System.out.println("Please enter your name");
        newName = input.nextLine();
        if (!Objects.equals(newName, "")) {
            names.add(newName);
        } else{
            System.out.println("field can't be left blank");
            getName();
        }
    }
    public static void getAddress(){
        String newAddress = "";
        System.out.println("Please enter your full address");
        newAddress = input.nextLine();
        if(newAddress != ""){
            addresses.add(newAddress);
        } else{
            System.out.println("Please input your address details, space can't be left blank");
            getAddress();
        }
    }
    public static void getPhoneNumber(){
        String newPhoneNumber = "";
        System.out.println("Enter your Phone Number");
        newPhoneNumber = input.nextLine();
        if(newPhoneNumber != ""){
            phoneNumbers.add(newPhoneNumber);
        } else {
            System.out.println("Field can't be left blank");
            getPhoneNumber();
        }
    }
    public static void getEmail(){
        String newEmail = "";
        System.out.println("Enter your email" );
        newEmail = input.nextLine();
        if(newEmail != ""){
            emails.add(newEmail);
        } else{
            System.out.println("Field can't be left blank");
            getEmail();
        }
    }
    public static void phoneBookDetails(){
        getName();
        getAddress();
        getPhoneNumber();
        getEmail();
        System.out.println("Add more contacts? yes or no? ");
        String details = input.nextLine();
        switch (details){
            case "YES", "yes", "Yes"  -> phoneBookDetails();
            default -> displayPhonebook();
        }
    }
    public static void displayPhonebook(){
        System.out.println();
        for (int info = 0; info < names.size(); info++){
            System.out.println("=========================================");
            System.out.printf("Name: %s%n", names.get(info));
            System.out.println("-----------------------------------------");
            System.out.printf("Address: %s%n", addresses.get(info));
            System.out.println("-----------------------------------------");
            System.out.printf("Telephone: %s%n", phoneNumbers.get(info));
            System.out.println("-----------------------------------------");
            System.out.printf("Email: %s%n", emails.get(info));
            System.out.println("=========================================");
            System.out.println();
        }
    }
}
