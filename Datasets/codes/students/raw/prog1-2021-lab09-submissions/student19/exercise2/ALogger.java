package lu.uni.programming1.lab9.exercise2;

import java.time.LocalDate;
import java.util.ArrayList;

import lu.uni.programming1.lab9.exercise2.Actions.Action;
import lu.uni.programming1.lab9.exercise2.Actions.Targetable;


public abstract class ALogger {
    private static ArrayList<String> lst = new ArrayList<>();

    public static void log(Action a, boolean succeed) {

        String date = LocalDate.now().toString();
        
        String msg = date + " -> ";

        if (succeed) {
            //determine if someone dead

            boolean death = a.getUser().isDead();

            boolean targetDeath = false;

            if (a instanceof Targetable) {
                targetDeath = a.getTarget().isDead();
            }

            //Actually do the logging
            

            msg += a.toString();
            
            if (death) {
                msg += "\n\t" + a.getUser().getName() + " Died...";
            }
            if (a instanceof Targetable && targetDeath) {
                msg += "\n\t" + a.getTarget().getName() + " Died...";
            }

        } else {
            msg += "Action failled...";
        }

        lst.add(msg);
    }

    public static void printLog() {
        for(String a : lst) {System.out.println(a);}
    }
}
