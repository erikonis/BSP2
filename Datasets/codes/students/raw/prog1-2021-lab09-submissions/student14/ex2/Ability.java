import java.time.LocalDate;

public class Ability extends Action {
    private String name;

    public Ability(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // check if the player has enough life to execute the ability
    public void command(Character player) {
        if (0 > player.getCurrHealth()) {
            Log.add("the action ability has been failed" + " " + LocalDate.now() + " " + player.getName());
            Log.add("your player is dead" + " " + player.getName());
        } else {
            Log.add("the action ability has been exectued" + " " + LocalDate.now() + " " + player.getName());
        }
    }

    @Override
    public String toString() {
        return "Ability [name=" + name + "]";
    }

}