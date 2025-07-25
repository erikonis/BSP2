package lu.uni.programming1.lab9.exercise2;

import java.time.LocalDateTime;

public class Ability implements Action {
    
    private String name;
    private Character user;

    public Ability(Character user, String name) {
        this.user = user;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Character getUser() {
        return user;
    }

    public void execute(Logger logger) {
        if (user.getHealth() > 0) {
            logger.createLog(user.getName() + " used ability " + name + " at " + LocalDateTime.now());
        } else {
            logger.createLog(user.getName() + " attemped to use ablility " + name + " but is already dead at " + LocalDateTime.now());
        }
    }

}
