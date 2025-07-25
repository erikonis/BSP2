
import java.util.ArrayList;

public class Log {

    ArrayList<String> log = new ArrayList<>();

    public void addToLog(String sentence){
        log.add(sentence);
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < log.size(); i++) {
            string += String.format("\n %s",log.get(i));
        }
        return string;
    }
}
