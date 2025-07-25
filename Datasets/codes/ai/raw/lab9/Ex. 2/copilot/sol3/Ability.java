import java.util.Date;

public class Ability implements Action {
    private Character user;
    private String name;

    public Ability(Character user, String name) {
        this.user = user;
        this.name = name;
    }

    @Override
    public void execute() {
        EventManager.getInstance().notify(new Event(user, "Ability: " + name, null, true));
    }

    @Override
    public Character getUser() {
        return user;
    }
}
