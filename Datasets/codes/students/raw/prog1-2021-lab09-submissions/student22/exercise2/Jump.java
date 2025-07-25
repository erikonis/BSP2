package lu.uni.programming1.lab9.exercise2;

import java.time.LocalDate;

public class Jump implements Logs {

    public void execute(Character user) {
        boolean executed = (user.getHealth() <= 0) ? false : true;
        register(user,executed);
    }

    @Override
    public void register(Character user, boolean executed) {
        String result = ""
        + String.format("Action:  Jump   / %s / user: %s / Action executed: %s", LocalDate.now(),user.getName(),executed);
        if (executed == false) {
            result += String.format("\nUser: %s has died", user.getName());
        }
        System.out.println(result);
        logList.add(result);
    }
    
}
