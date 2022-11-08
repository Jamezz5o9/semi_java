package HugeInteger;

import java.util.Arrays;

public class HugeInteger {
    private final char[] newNum = new char[40];
    public String parse(String s) {
        int[] freshArr = new int[s.length()];
        String storeNumber = "";
        for(int i =0; i < s.length(); i++){
            char firsStoreNumber = s.charAt(i);
            newNum[i] += firsStoreNumber;

            //second approach
            storeNumber = String.valueOf(firsStoreNumber);
            freshArr[i] += Integer.parseInt(storeNumber);
        }
        return Arrays.toString(newNum);
    }

    public String getNewNum() {
        return Arrays.toString(newNum);
    }

    public int addNewNum(String simple){
        int addNum = 0;
        for(int i = 0; i < simple.length(); i++){
            char num = simple.charAt(i);
            String temp = num + "";
            addNum += Integer.parseInt(temp);
        }
        return addNum;
    }
}
