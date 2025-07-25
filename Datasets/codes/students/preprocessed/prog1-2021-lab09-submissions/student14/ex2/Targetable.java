import java.time.LocalDate;

public class Targetable extends Action {
    private String name;
    private int value;

    public Targetable(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // check if player has enough life to execute the command "target"
    public void command(Character player, Character target) {
        if (player.getCurrHealth() > 0) {
            // remove life
            target.setCurrHealth(target.getCurrHealth() - value);
            // log
            Log.add("The action has been executed" + name + " " + LocalDate.now() + " " + player.getName() + " "
                    + target.getName());
            // when the target has died
            if (0 >= target.getCurrHealth()) {
                Log.add("your target has died" + " " + target.getName());
            }
        }
        // when the command could not been exectued
        else {
            Log.add("The action could not been executed" + " " + name + " " + LocalDate.now() + " " + player.getName()
                    + target.getName());
        }
    }
}