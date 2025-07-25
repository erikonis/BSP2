import java.util.Date;

public interface Action {
    void execute();
}

class Jump implements Action {
    private Character user;

    public Jump(Character user) {
        this.user = user;
    }

    @Override
    public void execute() {
        Logger.getInstance().logEvent(new Date(), user.getName(), "Jump", null, true);
    }
}

class Ability implements Action {
    private Character user;
    private String name;

    public Ability(Character user, String name) {
        this.user = user;
        this.name = name;
    }

    @Override
    public void execute() {
        Logger.getInstance().logEvent(new Date(), user.getName(), "Ability: " + name, null, true);
    }
}

class TargetableAbility implements Action {
    private Character user;
    private Character target;
    private String name;
    private int power;

    public TargetableAbility(Character user, Character target, String name, int power) {
        this.user = user;
        this.target = target;
        this.name = name;
        this.power = power;
    }

    @Override
    public void execute() {
        if (target != null) {
            target.modifyHealth(power);
            Logger.getInstance().logEvent(new Date(), user.getName(), "Targetable Ability: " + name, target.getName(), true);
            if (target.getCurrentHealth() <= 0) {
                Logger.getInstance().logKillEvent(new Date(), user.getName(), target.getName());
            }
        } else {
            Logger.getInstance().logEvent(new Date(), user.getName(), "Targetable Ability: " + name, null, false);
        }
    }
}
