import java.util.ArrayList;

 public interface Logger{
    
    static ArrayList<Event>log= Test.log;

    public static void create(Event ev)
    {log.add(ev);}

    public static void print()
    {for(Event ev : log)
        System.out.println(ev);
    }


    public static ArrayList<Event> getLog() {
        return log;
    }


    }

    
    

