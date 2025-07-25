import java.time.LocalDateTime;
import java.util.ArrayList;

public class Log {
    private ArrayList<String> logList = new ArrayList<>();

    public void addLog(String log)
    {
        logList.add(String.valueOf(LocalDateTime.now())+" : "+log);
    }

    public void printLogs()
    {
        System.out.println("\n");
        for(String x: logList)
        {
            System.out.println(x);
        }
        System.out.println("\n");
    }
}
