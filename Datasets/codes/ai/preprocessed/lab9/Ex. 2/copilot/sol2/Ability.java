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
        Logger.getInstance().log(new Date(), user.getName() + " used ability: " + name);
    }

    @Override
    public Character getUser() {
        return user;
    }
}