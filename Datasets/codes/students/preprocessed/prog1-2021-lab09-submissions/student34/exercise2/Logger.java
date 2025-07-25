import java.time.LocalDateTime;

public class Logger {

    String mylog;

    public Logger() {
        mylog="";
    }

    public void Log(String input) {
        String temp = input + " / " + LocalDateTime.now() + "\n";
        mylog+=temp;
    }

    public void PrintLog() {
        System.out.println(mylog);
    }

}
