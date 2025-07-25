import java.time.LocalDate;

public class Targetable extends Ability {
    int power;

    public Targetable(String name, int power) {
        super(name);
        this.power = power;
    }

    @Override
    public void execute(Character user) {
        boolean executed = false;
        register(user, executed);
    }
    
    public void execute(Character user, Character target) {
        boolean executed = (user.getHealth() <= 0) ? false : true;
        if (executed) {
            target.setHealth(target.getHealth() - power);
            register(user, executed, target);
        } else{
            register(user, executed);
        }
        
    }

    public void register(Character user, boolean executed, Character target) {
        String result = ""
        + String.format("Ability: %s / %s / user: %s / Action executed: %s",name,LocalDate.now(),user.getName(),executed);
        if (user.getHealth() <= 0) {
            result += String.format("\nUser: %s has died.", user.getName());
        }
        if (target.getHealth() <= 0 && !user.equals(target)) {
            result += String.format("\nTarget: %s has died.", user.getName());
        }
        if (executed == false) {
            result += String.format("\nAbility: %s has failed.", name);
        }
        if (user.equals(target)) {
            result += " Sadly, it's a suicide";
        }
        System.out.println(result);
        logList.add(result);
        
    }


    
}
