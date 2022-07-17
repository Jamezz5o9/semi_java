package Week7;

import java.util.Arrays;
import java.util.Scanner;

public class studentGrade {
    private static Scanner sc;
    private static int[][] grades;
    private static double[] average;
    private static int[] total;
    private static int studentNumber;
    private static int subject;


    public static void studentArray(){
        int[][] newGrade;
        System.out.println("How many students are taking this course: ");
        studentNumber = sc.nextInt();
        System.out.println("How many subject are the student  taking: ");
        subject = sc.nextInt();
        grades = new int[studentNumber][subject];
    }

    public static void studentGrade(){
        for(int row = 0; row < grades.length; row++){
            for(int col = 0; col < grades[row].length; col++){
                System.out.printf("Enter your grade: %d", col + 1);
                int studentGradeInput = sc.nextInt();
                grades[row][col] = studentGradeInput;
            }
            System.out.println();
        }
    }

    public static void getStudentGradeOutput(){
            total = new int[studentNumber];
            average = new double [studentNumber];

            for(int row = 0; row < grades.length; row++){
                int newTotal = 0;
                double newAverage = 0;
                System.out.printf("student %d", row + 1);
                int position = 0;
                for(int col = 0; col < grades[row].length; col++){
                    newTotal += grades[row][col];
                    total[row] = newTotal;
                    newAverage = (double) newTotal / grades.length;
                    average[row] = newAverage;
                    position = getStudentPosition(newAverage);
                    System.out.printf("%9d", grades[row][col]);
                }
                System.out.printf("%8d", newTotal);
                System.out.printf("%8.2f", newAverage);
                System.out.printf("%8d", position);
                System.out.println();
        }
    }

    public static int getStudentPosition(double avg){
        Arrays.sort(average);
        int index = Arrays.binarySearch(average, avg);
        return (index + 1);
    }
}
