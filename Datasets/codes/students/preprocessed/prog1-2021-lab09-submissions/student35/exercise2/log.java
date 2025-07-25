import java.util.ArrayList;
import java.util.Date;

public class log {
    private ArrayList<String> logMessages;

    public void addLogMessage(String newMessage) {
        Date d = new Date();// CURRENT Date
        logMessages.add(d + " : " + newMessage);
    }

    public log() { // Constructor
        logMessages = new ArrayList<String>();
    }

    public void printLog() {// Going through each message and printing it
        for (int i = 0; i < logMessages.size(); i++) {
            System.out.println(logMessages.get(i));
        }
    }
}