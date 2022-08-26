package ElevenQuestions;

import java.util.Arrays;

public class ElevenQuestions {

    public int largestElement(int[] array){
    int largest = array[0];
    for(int i = 0; i < array.length; i++){
        if(array[i] > largest){
            largest = array[i];
        }
    }
       return largest;
    }

    public String reverse(int[] arr){

        int[] reverse = new int[arr.length];
        int count = 0;
        for(int i = arr.length - 1 ; i >= 0; i-- ){
            reverse[count] = arr[i];
            count++;
        }
        return Arrays.toString(reverse);
    }

    public boolean elementInAList(int[] arr, int element){

        for(int i = 0; i < arr.length; i++){
            if(arr[i]  == element){
                return true;
            }
        }
        return  false;
    }

    public String oddPosition(int[] arr){
        String element = "";
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                element += arr[i];
            }

        }
        return element;
    }

    public String evenPosition(int[] arr){
        String element = "";
        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                element += arr[i];
            }
        }
        return element;
    }

    public int totalAmount(int[] array){
        int total = 0;
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        return total;
    }

    public boolean palindromeCheck(String name){
        String reverse = "";
        String newReverse = reverse.replaceAll("[^A-Za-z]+", "").toLowerCase();
        int new_length = name.length();
        for(int i = new_length - 1; i >= 0; i--){
            char newValue = name.charAt(i);
            newReverse += newValue;

            if(name.equals(newReverse)){
                return true;
            }
        }
        return false;
    }

    public int computeValueForLoop(){
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum += i;
        }
        return sum;
    }

    public int computeValueWhileLoop() {
        int count = 0;
        int sum = 0;
        while(count < 5){
            sum += count;
            count++;
        }
    return sum;
    }

    public int computeValueUsingDoWhileLoop(){
        int count = 0;
        int sum = 0;
        do{
            sum += count;
            count++;
        }while (count < 5);
        return sum;
    }

    public String concatenateArray(int[] array1, int[] array2, String[] array3) {

        String[] concat = new String[array1.length + array2.length + array3.length];
        int pos = 0;
        for (int k : array1) {
            concat[pos] = String.valueOf(k);
            pos++;
        }
        for(int i = 0; i < array2.length; i++){
            concat[pos] = String.valueOf(array2[i]);
            pos++;
        }
        for(String element: array3){
            concat[pos] = element;
            pos++;
        }
        return Arrays.toString(concat);
    }

    public String concatenateArray2(int[] array1, int[] array2) {

        int[] concat = new int[array1.length + array2.length];
        int pos = 0;
        for (int k : array1) {
            concat[pos] = k;
            pos++;
        }
        for(int i = 0; i < array2.length; i++){
            concat[pos] = array2[i];
            pos++;
        }

        return Arrays.toString(concat);
    }

    public String alternateArray(int[] array1, int[] array2){
        int[] concat = new int[array1.length + array2.length];
        int pos = 0;
       for(int i = 0;  i < array1.length; i++){
           concat[pos] = array1[i];
           pos++;
           concat[pos] = array2[i];
           pos++;
       }
       return Arrays.toString(concat);
    }
    public String alternateArray2(String[] array2, int[] array1){
        String[] concat = new String[array1.length + array2.length];
        int pos = 0;
        for(int i = 0;  i < array1.length; i++){
            concat[pos] = String.valueOf(array1[i]);
            pos++;
            concat[pos] = array2[i];
            pos++;
        }
        return Arrays.toString(concat);
    }
}
