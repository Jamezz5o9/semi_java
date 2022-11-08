package Week8;

import java.util.ArrayList;
import java.time.LocalDateTime;


public class Database {
    private ArrayList<Entry> entries;

    public Database(){
        entries = new ArrayList<>();
    }

    public void addEntry(LocalDateTime localDateTime, String text){
        entries.add(new Entry(localDateTime, text));
    }

    public ArrayList<Entry> findEntries(LocalDateTime localDateTime, boolean byTime){
        ArrayList<Entry> found = new ArrayList<>();
        for(Entry entry : entries){
            if((byTime && (entry.getLocalDateTime().equals(localDateTime))) || ((!byTime) && (entry.getLocalDateTime().toLocalDate().equals(localDateTime.toLocalDate())))){
                found.add(entry);
            }
        }
        return found;
    }

    public void removeEntry(LocalDateTime localDateTime){
        ArrayList<Entry> found = findEntries(localDateTime, true);
        for(Entry entry : found){
            entries.remove(entry);
        }
    }

}
