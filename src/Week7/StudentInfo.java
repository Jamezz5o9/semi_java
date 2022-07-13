package Week7;

import java.util.Scanner;

public class StudentInfo {


    public static void main(String[] args) {
       // getInput();
       // check();
        //outputChat();
       // lowestGrade();
        //outputSummary();
        check();
    }
    private  static Scanner input = new Scanner(System.in);
    private  static String schoolName;
    private static int[][] grades;
    private static int length;
    private static int student;

    public static void outputSummary(){
        getInput();
        outputChat();

        System.out.println("SUBJECT SUMMARY");
        System.out.println("Subject 1");


        System.out.printf("The highest scoring student is: student %d scoring %d%n", highestGrade());
        System.out.printf("The lowest scoring student is: student %d scoring %d%n", lowestGrade());

    }
    public static void getInput(){

        System.out.println("How many grade are you going to enter? ");
        length = input.nextInt();

        grades = new int[length][length];

        for(int counter = 0; counter < length; counter++){
            for(int column = 0; column < length; column++){
                System.out.printf("Enter your grade for Student %d%n", counter + 1);
                grades[counter][column] = input.nextInt();
            }

        }
        input.close();
        System.out.println("Your grades are");
        for(int counter = 0; counter < length; counter++){
            for(int column = 0; column < length; column++){
               System.out.print(grades[counter][column] + " ");
            }
            System.out.println();
        }
    }

    public static int highestGrade(){
        int highGrade = grades[0][0];

        for(int[] studentGrade : grades){
            for (int grade: studentGrade){
                if(grade > highGrade){
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    public static  int lowestGrade(){
        int lowGrade = grades[0][0];

        for(int[] studentGrade: grades){
            for(int grade: studentGrade){
                if(grade < lowGrade){
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }
    public static int position(int[] studentPosition){
        int first = 0;

        for(int grade : studentPosition){
            if(first > grade){
                first = 1;
            }
            if(first < grade){
                first= 2;
            } else {
                first = 3;
            }
        }
        return first;
    }
    public static int totalScore(int[] studentTotal){
        int total = 0;

        for(int grade : studentTotal){
            total += grade;
        }
        return total;
    }

    public static double average(int[] studentGrade){
        int total = 0;

        for(int grade: studentGrade){
                total+= grade;
        }
        return  (double) total / studentGrade.length;

    }
    public static void outputChat(){
        System.out.printf("%s%n%n", "THE FINAL GRADE DISTRIBUTION");
        System.out.println("==============================================================");

        System.out.print("STUDENT      ");


        for(int sub = 0; sub < grades[0].length; sub++){
            System.out.printf("SUB%d     ", sub + 1);
        }
        System.out.printf("%s   %5s   %5s%n", "TOT", "AVG", "POS");
        System.out.println("==============================================================");

        for(student = 0; student < grades.length; student++){
            System.out.printf("Student %d", student + 1);

            for(int james : grades[student]){
                System.out.printf("%8d", james);
            }

            int newTotal = totalScore(grades[student]);
            System.out.printf("%10d", newTotal);

            double average = average(grades[student]);
            System.out.printf("%9.2f", average);

            int pos = position(grades[student]);
            System.out.printf("%6d%n", pos);

            }
        System.out.println("==============================================================");
        System.out.println("==============================================================");
}


    public static int checkPosition(int first, int second, int third){

        int position = 0;
        if(first > second && first > third){
            position = 3;
        }
        if (second > first && second > third) {
            position = 2;
        }
        if(third > second && third > first){
            position = 1;
        }
        return position;
    }
//    public static void firstLoop(){
//        int max = grades[0][0];
//        int min = grades[0][0];
//        for( int row = 0; row < )
//    }

    public static void check1(){
        getInput();
        int max = grades[0][0];
        int min = grades[0][0];
        for(int row = 0; row < length; row++){
            for(int col = 0; col < length; col++){
                if(grades[row][col] > max){
                    max = grades[row][col];
                } else if (grades[row][col] < min) {
                    min = grades[row][col];
                }
            }

        }
        System.out.print("The highest num is " + max + " while the lowest is " + min);

    }
    public static void check(){
        getInput();
        int max = grades[0][0];
        int min = grades[0][0];
        for(int row = 0; row < 1; row++){
            for(int col = 0; col < length; col++){
                if(grades[row][col] > max){
                    max = grades[row][col];
                    System.out.printf("The highest num is %d%n", max);
               } else if (grades[row][col] < min) {
                    min = grades[row][col];
                    System.out.printf("The lowest num is %d", min);
                }
            }

        }
        System.out.print("The highest num is " + max + " while the lowest is " + min);

    }
  }