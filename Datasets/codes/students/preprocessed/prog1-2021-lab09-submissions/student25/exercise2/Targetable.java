// import java.util.Scanner;
import java.time.LocalDateTime;

public class Targetable extends Ability {

    private Character target;
    private int power;

    public Targetable(Character user, String name, Character target, int power) {
        super(user, name);
        this.target = target;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public Character getTarget() {
        return target;
    }

    // @Override
    public void execute(Logger logger, boolean selfUse) {
        //default target is the classes target
        if (getUser().getHealth() > 0){
            Character target = this.target;

            // Scanner scanner = new Scanner(System.in);

            // System.out.print("Do you want to use the " + getName() + " ability on yourself? Answer with \"true\" or \"false\": ");
            if (selfUse) {
                target = getUser();
            }
            // scanner.close();

            //target survives
            if (target.getHealth() > 0 && target.getHealth() - power > 0) {
                target.setHealth(target.getHealth() - power);
                logger.createLog(getUser().getName() + " targeted the user " + target.getName() + " with the ability " + getName() + " with power " + getPower() + " at " + LocalDateTime.now());
            } 

            //target dies
            else if (target.getHealth() > 0) {
                target.setHealth(target.getHealth() - power);
                logger.createLog(getUser().getName() + " targeted the user " + target.getName() + " with the ability " + getName() + " with power " + getPower() + " at " + LocalDateTime.now());

                if (target.equals(getUser())) {
                    logger.createLog(target.getName() + " committed suicide");
                } else {
                    logger.createLog(getUser().getName() + " killed the user " + target.getName());
                }

            }

            //target already dead
            else {
                logger.createLog(getUser().getName() + " attempted to target the user " + target.getName() + " with the ability " + getName() + " with power " + getPower() + " but the target is already dead at " + LocalDateTime.now());
            }
        }

        //user is dead
        else {
            logger.createLog(getUser().getName() + " attempted to target the ability " + getName() + " with power " + getPower() + " but is already dead at " + LocalDateTime.now());
        }
    }
    
}
