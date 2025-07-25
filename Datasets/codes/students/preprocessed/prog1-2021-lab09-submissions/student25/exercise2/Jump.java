import java.time.LocalDateTime;

public class Jump implements Action {

    private Character user;
    
    public Jump(Character user) {
        this.user = user;
    }

    public Character getUser() {
        return user;
    }

    public void execute(Logger logger) {
        if (user.getHealth() > 0) {
            logger.createLog(user.getName() + " jumped at " + LocalDateTime.now());
        } else {
            logger.createLog(user.getName() + " attemped to jump but is already dead at " + LocalDateTime.now());
        }
    }

}
