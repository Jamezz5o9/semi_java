package FEMI;

public class Main {
    public static void main(String[] args) {
        TimeFormatter newTime = new TimeFormatter();

        displayTime("After time object is created", newTime);

        newTime.setTime(23, 40, 34);
        displayTime("After calling set Time", newTime);

        try{
            newTime.setTime(99, 50, 70);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        displayTime("After calling time with invalid setTime", newTime);

    }
    private static void displayTime(String header, TimeFormatter time) {
        System.out.printf("%s%nUniversal Time: %s%nStandard Time: %s%n", header, time.toUniversalString(), time.toStandardTime());

    }


}
