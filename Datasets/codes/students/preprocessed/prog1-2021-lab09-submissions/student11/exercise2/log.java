import java.time.LocalDate;
import java.util.ArrayList;

public class log {

    private ArrayList<action> actionLog = new ArrayList<action>(0);
    private ArrayList<LocalDate> dateLog = new ArrayList<LocalDate>(0);

    public log() {}

    public void addAction(action newAction)
    {
        actionLog.add(newAction);
        dateLog.add(LocalDate.now());
    }

    public void printLog()
    {
        for (int i = 0; i < actionLog.size(); i++)
        {
            System.out.println(actionLog.get(i).toString());
        }
    }

    public void printLogWithDate()
    {
        for (int i = 0; i < actionLog.size(); i++)
        {
            System.out.println(actionLog.get(i).toString() + "   ------   Date:   " + dateLog.get(i));
        }
    }
    
}
