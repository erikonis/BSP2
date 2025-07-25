import java.util.ArrayList;

public class Logger {

    private ArrayList<String> logs = new ArrayList<String>();

    public Logger() {}

    public void createLog(String log) {
        logs.add(log);
    }

    @Override
    public String toString() {
        String output = "";

        for (String log : logs) {
            output += log + "\n";
        }

        return output;
    }

}
