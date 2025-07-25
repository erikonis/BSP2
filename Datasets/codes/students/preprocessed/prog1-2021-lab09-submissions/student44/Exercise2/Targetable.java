public class Targetable implements Actions {

    private String action = "";
    private Character target;
    private int power;

    public String getAction() {
        return action;
    }

    public Character getTarget() {
        return target;
    }

    public int getPower() {
        return power;
    }

    public Targetable(Character target, int power) {
        this.target = target;
        this.power = power;
    }

    @Override
    public void execute(Character c, Logs logs) {

        if (!c.equals(getTarget())) {

            if (getPower() > 0) {

                if (target.getCurrentHealth() < target.getMaxHealth()) {
                    target.setCurrentHealth(target.getCurrentHealth() + getPower());
                    action = c.getName() + " healed "+target.getName()+" and gave them " + getPower() + " HP.\n"
                            + target.getName() + " now has " + target.getCurrentHealth() + " HP.\n";
                    logs.add(action);
                }
            } else {
                if (target.getCurrentHealth() > 0) {
                    target.setCurrentHealth(target.getCurrentHealth() + getPower());
                    action = c.getName() + " attacked "+target.getName()+" and removed " + getPower() + " HP from them.\n "
                            + target.getName() + " now has " + target.getCurrentHealth() + " HP.\n";
                    logs.add(action);
                    if (target.getCurrentHealth() <= 0) {
                        action = target.getName() + " has been killed. Victory for " + c.getName() + "\n";
                        logs.add(action);
                    }
                } else {
                    action = "Action cannot be executed as " + target.getName() + " is already dead.\n";
                    logs.add(action);
                }
            }
        }

        else if (c.equals(getTarget())) {
            if (getPower() > 0) {
                target.setCurrentHealth(target.getCurrentHealth() + getPower());
                action = c.getName() + " healed themself and gained " + getPower() + " HP.\n"
                        + target.getName() + " now has " + target.getCurrentHealth() + " HP.\n";
                logs.add(action);
            } else {
                if (target.getCurrentHealth() > 0) {
                    target.setCurrentHealth(target.getCurrentHealth() + getPower());
                    action = c.getName() + " attacked themself. \n" + c.getName() + " removed " + getPower()
                            + " HP from themself. \n" + c.getName() + " now has " + c.getCurrentHealth() + " HP.\n";
                    logs.add(action);
                    if (c.getCurrentHealth() <= 0) {
                        action = target.getName() + " killed themself.\n";
                        logs.add(action);
                    }

                } else {
                    action = target.getName() + " has already killed themself.";
                    logs.add(action);
                }
            }
        }

    }

}
