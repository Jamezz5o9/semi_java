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
}
