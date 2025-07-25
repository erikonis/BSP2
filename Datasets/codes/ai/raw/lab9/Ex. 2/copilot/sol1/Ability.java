public class Ability extends Action {
    private String name;

    public Ability(Character user, String name) {
        super(user);
        this.name = name;
    }

    @Override
    public void execute() {
        Logger.getInstance().log(new Date(), user.getName() + " used ability: " + name);
    }
}
