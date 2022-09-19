package CreditCard;

public class CreditCard {
    public static void main(String[] args) {
        //String str = "67ab84t";
        //System.out.println(sumOfAllNumInAString("367"));

    }

    public boolean checkNumLength(String numLength) {
        return numLength.length() >= 13 && numLength.length() <= 16;
    }

    public boolean startWithFourForVisa(String beginWithFour) {
        boolean isFour = false;
        char[] newChar = beginWithFour.toCharArray();
        for(int i = 0; i < newChar.length; i++){
//            int newNum = beginWithFour.charAt(0);
//            if(newNum == '4') isFour = true;
            if(checkNumLength(beginWithFour) && newChar[0] == '4') isFour = true;
        }
        return isFour;
    }

    public boolean startWithFiveForMaster(String beginWithFive) {
        for(int i = 0; i < beginWithFive.length(); i++ ){
            if(checkNumLength(beginWithFive) && beginWithFive.charAt(0) == '5') return true;
        }
        return false;
    }

    public boolean startWithFiveSec(String beginWithFive) {
        if(beginWithFive.indexOf('5') == 0) return true;
        return false;
    }

    public boolean americanCard(String startThirtySeven) {
        boolean isAmericanCard = startThirtySeven.indexOf('3') == 0 && startThirtySeven.indexOf('7') == 1;
        if(isAmericanCard && checkNumLength(startThirtySeven)) return true;
        return false;
    }

    public boolean discoverCard(String startWithSix) {
        boolean isDiscoverCard = startWithSix.indexOf('6') == 0;
        if(isDiscoverCard && checkNumLength(startWithSix)) return true;
        return false;
    }

    public int sumOfDoubleEvenPlace(String number) {
        String total = "";
        String totalSecond = "";
        int result = 0;
        int secondResult = 0;
        String totalThird = "";
        for(int i = 0; i < number.length(); i++){
            total = "" + number.charAt(i);
            result = Integer.parseInt(total) * 2;
            if(i % 2 == 0 && result > 9){
                    total = String.valueOf(result);
                    totalSecond = "" + total.toCharArray()[0];
                    totalThird = "" + total.toCharArray()[1];
                    secondResult += Integer.parseInt(totalSecond) + Integer.parseInt(totalThird);
            }
            if(i % 2 == 0 && result <= 9){
                totalThird = "" + number.charAt(i);
                secondResult += Integer.parseInt(totalThird) * 2;
            }
        }

        return secondResult;
    }

    public static int addTwoChar(String input){
        int sum = 0;
        String temp = "0";
        for(int i = 0; i < input.length(); i++){
            char newSum = input.charAt(i);
            sum += newSum;
        }
        return sum;
    }

    public static int findSum(String input){
        int sum = 0;
        String temp = "0";

        for(int i =0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch))
                temp += ch;
            else {
                sum += Integer.parseInt(temp);

                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }
    public static int sumOfAllNumInAString(String num){
        String name = "";
        int sum = 0;
        int total = 0;
        for(int i = 0; i < num.length(); i++){
            name = "" + num.charAt(i);
            total += Integer.parseInt(name);
        }
        return total;
    }

    public int sumOfOddPlace(String number) {
        int total = 0;
        for(int i = 0; i < number.length(); i++){
            if(i % 2 != 0){
                char newNum = number.charAt(i);
                String num = "" + newNum;
                total += Integer.parseInt(num);
            }
        }
        return total;
    }

    public int sumOfEvenAndOdd(String number) {
       return sumOfOddPlace(number) + sumOfDoubleEvenPlace(number);
    }

    public boolean isValid(String number) {
        return sumOfEvenAndOdd(number) % 10 == 0;
    }


    public boolean getDigitForOdd(String number) {
        int total = 0;
        String firstNum = "";
        for(int i = 0; i < number.length(); i++){
            char newNum = number.charAt(i);
            firstNum = "" + newNum;
            total = Integer.parseInt(firstNum) * 2;

            if(i % 2 == 0 && total > 9) return true;

        }
        return false;
    }

    public long numberCheck(String number) {
        long numberFound = 0;
        int total = 0;
        String firstNum = "";
        String hold = "";
        String secondNum = "";
        String thirdNum = "";

        for(int i = 0; i < number.length(); i++){
            char newNum = number.charAt(i);
            firstNum = "" + newNum;
            total = Integer.parseInt(firstNum) * 2;

            if(i % 2 == 0 && total > 9){
                hold = String.valueOf(total);
                secondNum = "" + hold.toCharArray()[0];
                thirdNum = "" + hold.toCharArray()[1];
                numberFound += Integer.parseInt(secondNum) + Integer.parseInt(thirdNum);
            }

        }
            return numberFound;
        }

    public boolean prefixMatched(String number, String d) {
        for(int i =0; i < number.length(); i++){
            if( number.charAt(0) == '4') return true;
        }
        return false;
    }

    public int getSize(String number) {
        int counter = 0;
        for(int i = 0; i < number.length(); i++){
            counter++;
        }
        return counter;
    }

    public int getPrefix(String number, String k) {
        for(int i = 0; i < number.length(); i++){

        }
    }
}
