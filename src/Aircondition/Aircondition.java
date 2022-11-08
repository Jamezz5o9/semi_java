package Aircondition;

public class Aircondition {
    private boolean isOn;
    private int temp;


    public boolean isOn(){
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        temp = 16;

    }
    public void turnOff() {
        isOn = false;
    }
    public void increaseTemp(){
        if(isOn) temp++;
        if(temp > 30)temp = 30;
    }
    public int getTemp(){
        return temp;
    }

    public void decreaseTemp(){
        if(isOn) temp--;
        if(temp <= 16) temp = 16;
    }
}
