package Week8;

import java.time.LocalDateTime;

public class Entry {
    private String name;
    private String password;
    private String text;
    private LocalDateTime localDateTime;

    public Entry(String password, String name){
        this.password = password;
        this.name = name;
    }
    public Entry(LocalDateTime localDateTime, String text){
        this.localDateTime = localDateTime;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
    public String toString(){
        return localDateTime.format(Diary.dateTimeFormatter) + " " + text;
    }
}
