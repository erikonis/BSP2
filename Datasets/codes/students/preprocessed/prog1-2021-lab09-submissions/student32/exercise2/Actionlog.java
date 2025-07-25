import java.util.ArrayList;

public class Actionlog {
    private int x, s;
    // private ArrayList<String> l = new ArrayList<String>();
    private ArrayList<String> log = new ArrayList<String>();
    public Actionlog() {
        x = 0;
        
        log.add("List of actions");
    }
    
    public void Addlog(ArrayList<String> l){
        // this.l = l;
        x = 0;
        s = l.size();
        while(x<s){
            log.add(l.get(x));
            x++;
        }
    }

    public void DisplayLog(){
        x = 0;
        s = log.size();
        System.out.println(log);
        while(x<s){
            System.out.println(log.get(x).toString());
            x++;
        }
    }
}
