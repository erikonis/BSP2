package lu.uni.programming1.lab9.exercise2;

import java.util.ArrayList;

public class Logger {
    
    private ArrayList<Recorder> logs = new ArrayList<>();

    public void createLog(Recorder record)
    {
        logs.add(record);
    }

    public void printLogs()
    {
        for(Recorder record : logs)
        {
            System.out.println(record);
        }
    }

    
}
