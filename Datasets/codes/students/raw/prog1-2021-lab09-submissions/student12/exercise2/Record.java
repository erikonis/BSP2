package exercise2;

import java.time.LocalDate;

public class Record {
    
    LocalDate date;
    String log;

    public Record(String log) {
        this.date = LocalDate.now();
        this.log = log;
    }

    public String toString() {
        return date.toString()+": "+log;
    }
}
