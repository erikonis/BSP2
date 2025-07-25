import java.util.Date;

public class TargetableAbility extends Ability {
    private Character target;
    private int power;

    public TargetableAbility(Character user, String name, Character target, int power) {
        super(user, name);
        this.target = target;
        this.power = power;
    }

    @Override
    public void execute() {
        boolean success = target != null;
        if (success) {
            target.modifyHealth(power);
            if (!target.isAlive()) {
                EventManager.getInstance().notify(new Event(target, "Killed by " + getUser().getName(), getUser(), true));
            }
        }
        EventManager.getInstance().notify(new Event(getUser(), "Targetable Ability: " + super.name, target, success));
    }
}