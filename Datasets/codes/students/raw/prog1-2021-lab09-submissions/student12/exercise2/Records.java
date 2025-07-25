package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Records {

    private static Records record=null;

    List<Record> recordList=new ArrayList<Record>();

    public static Records getInstance() {
        if (record == null) {
            record = new Records();
        }
        return record;
    }

    public void addRecord(String record){
        Record log =new Record(record);
        recordList.add(log);
    }

    public String toString(){
        String str= "";
        for(Record record : recordList){
            str+=record.toString();
        }
        return str;
    }
}
