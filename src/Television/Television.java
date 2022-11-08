package Television;

public class Television {
    private int volume;
    private boolean isOn;
    private int channel;
    private int tempVolume;
    private boolean isMute;
    public void turnOn() {
        isOn = true;
        isAv();
    }

    public String isAv(){
        return "AV";
    }
    public boolean isOn(){
        return isOn;
    }

    public void turnOff(){
        isOn = false;
    }

    public boolean isMute(){
     return isMute;
    }
    public void mute(){
        isMute = true;
        if(isOn) volume = 0;
    }

    public void unMute(){
        isMute = false;
        volume = tempVolume;
    }

    public void increaseVolume(){
        isMute = false;
        if(volume > 7) volume = 7;
        if(isOn) volume++;
        tempVolume++;
    }

    public void decreaseVolume(){
        isMute = false;
        if(volume < 1) volume = 0;
        if(isOn) volume--;
        tempVolume--;
    }

    public void setChannel(int channel){
        if(isOn) this.channel = channel;
    }
    public void channelUp(){
        if(isOn) channel++;
    }
    public void channelDown(){
        if(isOn) channel--;
    }

    public int getVol(){
        return volume;
    }

    public int getChannel(){
        return channel;
    }


}
