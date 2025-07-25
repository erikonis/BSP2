import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Logs {
    
    private List<String> logs = new ArrayList<String>();

    public List<String> getLog1() {
        return logs;
    }

    public Logs() {
    }

    public void add(String action){
        logs.add(action);
    }

    @Override
    public String toString() {
        String string="";
        for (int i=0; i<getLog1().size();i++){
             string += LocalDate.now()+": "+ getLog1().get(i)+"\n";}
        
        return string;
    }
    
    
}
 