package Week7;

import java.util.Scanner;

public class SegmentEight {
    public static int[][] segment = new int[5][4];
    public static void main(String[] args) throws InterruptedException, IllegalAccessException{
        newInput("10101111");
        newSegment();
    }

    public static void newSegment() throws InterruptedException{
        System.out.printf("%n");

            for(int [] i : segment){
                for(int j : i){
                    if(j == 1){
                        System.out.print("#  ");
                    }else {
                        System.out.print("   ");
                        Thread.sleep(300);
                    }
                }
                System.out.println();
            }
        }
    public static void fill(){
        segment[0][0] = 1;
        segment[0][1] = 1;
        segment[0][2] = 1;
        segment[0][3] = 1;
    }
    public static void fillB(){
        segment[0][3] = 1;
        segment[1][3] = 1;
        segment[2][3] = 1;
    }
    public static void fillC(){
        segment[2][3] = 1;
        segment[3][3] = 1;
        segment[4][3] = 1;
    }
    public static void fillD(){
        segment[4][0] = 1;
        segment[4][1] = 1;
        segment[4][2] = 1;
        segment[4][3] = 1;
    }
    public static void fillE(){
        segment[2][0] = 1;
        segment[3][0] = 1;
        segment[4][0] = 1;
    }
    public static void fillF(){
        segment[0][0] = 1;
        segment[1][0] = 1;
        segment[4][0] = 1;
    }
    public static void fillG() throws InterruptedException{
        segment[2][0] = 1;
        segment[2][1] = 1;
        segment[2][2] = 1;
        segment[2][3] = 1;
    }
    public static void newInput(String input) throws IllegalAccessException, InterruptedException {
        if(input.length() > 8){
            input = input.substring(0, 8);
        }
        char [] fill  = input.toCharArray();
        for(char i : fill){
            if(!(i == '1' || i == '0')){
                throw new IllegalAccessException("Only 1's and 0's are accepted");
            }
        }

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '1'){
                switch(i){
                    case 0 -> fill();
                    case 1 -> fillB();
                    case 2 -> fillC();
                    case 3 -> fillD();
                    case 4 -> fillE();
                    case 5 -> fillF();
                    case 6 -> fillG();
                }
            }
        }
    }
    public static void newSegment2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a digit to display");
        int new1 = input.nextInt();
        switch(new1){
            case 0 :
                System.out.println("_ \n| |\n|_|");
                break;

            case 1:
                System.out.println("|\n|\n");
                break;

            case 2:
                System.out.println("_ \n_|\n|_");
                break;
            case 3:
                System.out.println("_ \n_|\n_|");
                break;
            case 4:
                System.out.println("   \n|_|\n  |");
                break;
            case 5:
                System.out.println("_ \n|_\n_|");
                break;
            case 6:
                System.out.println("_ \n|_\n|_|");
                break;
            case 7:
                System.out.println("_ _\n   |\n   |");
                break;
            case 8:
                System.out.println("_ \n|_|\n|_|");
                break;
            case 9:
                System.out.println("_ \n|_|\n_|");
                break;
        }
    }

}
