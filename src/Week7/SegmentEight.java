package Week7;

import java.util.Scanner;

public class SegmentEight {
    public static int[][] segment = new int[5][4];
    public static void main(String[] args) throws InterruptedException, IllegalAccessException{
        newInput("11001110");
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
    public static void newInput(String newInput) throws IllegalAccessException, InterruptedException {
        char[] fill  = newInput.toCharArray();
        if(fill[fill.length - 1] == '0'){
            System.out.println("");
            return;
        }

        if(newInput.length() > 8){
           newInput =  newInput.substring(0, 8);
        }

        for(char i : fill){
            if(!(i == '1' || i == '0')){
                throw new IllegalAccessException("Only 1's and 0's are accepted");
            }
        }

        for(int i = 0; i < newInput.length(); i++){
            if(newInput.charAt(i) == '1'){
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

}
