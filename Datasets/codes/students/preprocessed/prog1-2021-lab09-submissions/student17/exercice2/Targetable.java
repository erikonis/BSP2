import java.time.LocalDate;

public class Targetable extends Actions implements log{
    private int value;
    private String name;

    public Targetable(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public void execute(Character player, Character target) {
        if (player.getCurrenhealth() > 0) {
            target.setCurrenhealth(target.getCurrenhealth()-value);
            String message = String.format("The action %s has been chosen at %s by %s on %s and the action has been executed", name, LocalDate.now(), player.getName(), target.getName());
            if (target.getCurrenhealth() <= 0) {
                message += String.format("\n%s has died", target.getName());
            }
            if (player.getCurrenhealth() <= 0 && !player.equals(target)) {
                message += String.format("\n%s has died", player.getName());
            }
            System.out.println(message);
            logmove(message);
        }
        else{
            String message = String.format("The action %s has been chosen at %s by %s on %s and the action has failed", name, LocalDate.now(), player.getName(), target.getName());
            System.out.println(message);
            logmove(message);
        }
        
       
    }
    public void execute(Character player) {
        String message =String.format("The action %s has been chosen at %s by %s but it has failed. No target", name, LocalDate.now(), player.getName());
        System.out.println(message);
        logmove(message);
    }
    @Override
    public void logmove(String message) {
        move.add(message);
        
    }
}
