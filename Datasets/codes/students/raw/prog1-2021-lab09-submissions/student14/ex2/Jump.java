import java.time.LocalDate;

public class Jump extends Action {
    // check if the player has enought life to execute the jump
    public void command(Character player) {
        if (0 > player.getCurrHealth()) {
            Log.add("the action jump has been failed" + " " + LocalDate.now() + " " + player.getName());
            Log.add("your player is dead" + player.getName());
        } else {
            Log.add("the action jump has been exectued" + " " + LocalDate.now() + " " + player.getName());
        }
    }
}