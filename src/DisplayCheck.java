import java.util.*;
public class DisplayCheck {
    public static void main(String[] args) {
        characterArr("112AB888CS");
        //checkCount(7);
        moveForward(7);
        DisplayCheck.display();
        List<String> list = List.of("112ABC2", "672X1", "9981XXC81");
        printIntInAList(list);
    }
    private static int[][] floor = new int[10][10];

    public static int[][] getFloor() {
        return floor;
    }
    public static void moveForward(int position){
        position = position - 1;
        int currentCol= 0;
        int currentRow = 0;
        for(int i = 0; i < position; i++){
            floor[currentRow][currentCol++] = 1;
        }
        System.out.println(currentCol);

    }

    public static void checkCount(int position){
        int count = 0;
        for(int i = 0; i < position; i++){
            count++;
        }
        System.out.println(count);
    }

    public static void display(){
        for(int i = 0; i < floor.length; i++){
            for(int j = 0; j < floor[i].length; j++){
                System.out.print(floor[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void printIntInAList(List<String> elements){
        int count = 0;
        for (String element : elements) {
            for (int j = 0; j < element.length(); j++) if (Character.isDigit(element.charAt(j))) count++;
        }
        System.out.println(count);
    }

    public static void characterArr(String element){
        char[] freshArr = new char[element.length()];
        for(int i = 0; i < element.length(); i++){
            freshArr[i] = element.charAt(i);
        }
        System.out.println(Arrays.toString(freshArr));
    }
}
