import java.time.LocalDate;

public class Jump extends Actions implements log{
    public void execute(Character player) {
        String message = "";
        if (player.getCurrenhealth() <= 0) {
            message += String.format("The action jump has been chosen at %s by %s and has failed. ", LocalDate.now(), player.getName());
            message += String.format("\n%s is dead", player.getName());
            System.out.println(message);
        }
        else{
            message += String.format("The action jump has been chosen at %s by %s and the action has been executed", LocalDate.now(), player.getName());
            System.out.println(message);
        }
        logmove(message);
    }
    @Override
    public void logmove(String message) {
        move.add(message);
        
    }
    
}
