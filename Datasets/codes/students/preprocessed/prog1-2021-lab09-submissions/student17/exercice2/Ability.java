import java.time.LocalDate;

public class Ability extends Actions implements log{
    private String name;

    public Ability(String name) {
        this.name = name;
    }
    public void execute(Character player) {
        String message = "";
        if (player.getCurrenhealth() <= 0) {
            message += String.format("The ability %s has been chosen at %s by %s and has failed. " , getName(), LocalDate.now(), player.getName());
            message += String.format("\n%s is dead", player.getName());
            System.out.println(message);
        }
        else{
            message += String.format("The ability %s has been chosen at %s by %s and the action has been executed" , getName(), LocalDate.now(), player.getName());
            System.out.println(message);
        }
        logmove(message);
    }
    public String getName() {
        return name;
    }
    @Override
    public void logmove(String message) {
        move.add(message);
        
    }
    
}
