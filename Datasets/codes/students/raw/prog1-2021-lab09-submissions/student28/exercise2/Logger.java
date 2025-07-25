package lu.uni.programming1.lab9.exercise2;

public class Logger {
    
    private static Logger log;
    private String events = "";
    
    public static Logger getLogs() {
		if ( log == null)
			log = new Logger();
		return log;
	}

    public void storingEvents(String event){
        events += event + "\n";
    }

    public void printEvents(){
        System.out.println(events);
    }


    
}
