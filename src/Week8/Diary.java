package Week8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;



public class Diary {
    private final Database database;
    private Entry entry;
    private final Scanner scanner = new Scanner(System.in);
    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/y HH:mm");
    public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("M/d/y");


    public Diary(){
        database = new Database();
    }

    public LocalDateTime readDateTime(){
        System.out.println("Enter date and time in this pattern mm/dd/yyyy hh:mm");
        LocalDateTime localDateTime;
        try{
            localDateTime = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        }catch(DateTimeParseException e){
            System.out.println("Error pls enter again");
            return readDateTime();

        }
        return localDateTime;
    }

    public LocalDate readDate(){
        System.out.println("Enter date in this pattern mm/dd/yyyy");
        LocalDate localDate;
        try{
            localDate = LocalDate.parse(scanner.nextLine(), dateFormatter);
        }catch(DateTimeParseException e){
            System.out.println("Error pls try again");
            return readDate();
        }
        return localDate;
    }

    public void userRegistration(){
        entry = new Entry("0000", "James");

        try{
            System.out.println("Please enter your user name");
            String newInput = scanner.nextLine();

            System.out.println("Please enter your password");
            String password = scanner.nextLine();

            entry.setName(newInput);
            entry.setPassword(password);
            System.out.println(entry.getName() + "is your new name");
            System.out.println();
        }catch(NullPointerException ignored){}

    }

    private void deleteEntry(){
        System.out.println("Entries that were matched with the same date and time will be deleted");
        LocalDateTime localDateTime = readDateTime();
       database.removeEntry(localDateTime);

    }

    public void addEntries(){
        LocalDateTime localDateTime = readDateTime();
        System.out.println("Add new info to your diary...");
        String text = scanner.nextLine();
        database.addEntry(localDateTime, text);
    }

    public void printEntries(LocalDate day){
        ArrayList<Entry> entries = database.findEntries(day.atStartOfDay(), false);
        for(Entry entry : entries){
            System.out.println(entry);
        }
    }

    public void searchEntry(){
        LocalDateTime localDateTime = readDate().atStartOfDay();
        ArrayList<Entry> entries = database.findEntries(localDateTime, false);
        if(entries.size() > 0){
            System.out.println("Entries found");
            for(Entry entry : entries){
                System.out.println(entry);
            }
        }else{
            System.out.println("Entries not found");
        }

        scanner.nextLine();
    }

    public void deleteUser(){
        System.out.println("Are you sure you want to?\n" +
                "All entries from this user will be lost\n" +
                "Yes/No");
        String in = scanner.nextLine();
        try{
            if(in.equalsIgnoreCase("yes")){
                System.out.println("Enter your name");
                String name = scanner.nextLine();

                System.out.println("Enter your password");
                String password = scanner.nextLine();

                if(name.equals(entry.getName()) && password.equals(entry.getPassword())){
                    entry.setName(null);
                    entry.setPassword(null);
                    System.out.println("Account has been successfully deleted");;
                    outputProcessed();
                }
            }

            else System.out.println("Oops..\n" +
                    "Wrong Credentials " +
                    "cannot delete account");
        }catch(NullPointerException ignored){}
    }
    public void output(){
        System.out.println();
        System.out.println();
        System.out.println("Welcome " + entry.getName());
        System.out.println("Today is " + LocalDateTime.now().format(dateTimeFormatter));
        System.out.println();

        System.out.println("Today:\n-------");
        printEntries(LocalDate.now());
        System.out.println();
        System.out.println("Tomorrow:\n-------");
        printEntries(LocalDate.now().plusDays(1));
        System.out.println();


    }

    public void outputProcessed(){
            System.out.println("Welcome");
            Diary dairy = new Diary();
            String userSelection = "0";

            dairy.userRegistration();


            while (!userSelection.equals("5")){
                dairy.output();
                System.out.println("""
                "Select a service from 1-5:
                1. Add entry
                2. Search diary
                3. Delete entry
                4. Delete user
                5. End""");

                Scanner scanner = new Scanner(System.in);

                userSelection= scanner.nextLine();

                switch (userSelection) {
                    case "1" -> dairy.addEntries();
                    case "2" -> dairy.searchEntry();
                    case "3" -> dairy.deleteEntry();
                    case "4" -> dairy.deleteUser();
                    case "5" -> System.out.println("Thank you!");
                    default -> System.out.println("Oops. Press any key to select another service");
                }
            }
        }


}

