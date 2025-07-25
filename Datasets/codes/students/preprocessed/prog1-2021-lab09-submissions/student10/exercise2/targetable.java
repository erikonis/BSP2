public class targetable extends ability {
    private character target;
    private int power;

    public targetable(String nameOfAction, int power) {
        super(nameOfAction);
        this.target = null;
        this.power = power;
    }

    public void setTarget(character newTarget) {
        if (newTarget.stillAlive()) {
            this.target = newTarget;
        } else {
            logger.addLogMessage("Targeting failed!! : Target is already dead");
        }
    }

    public void execute(character user) {
        if (this.target == null) {//
            logger.addLogMessage("Action failed :\tInvalid target!!");
        } else {
            if (target.takeDamage(power)) { // If the guy is dead!!
                logger.addLogMessage("The user " + user + " killed " + target);
                target = null;// Remove a target if a guy was killed!!
            } else {
                logger.addLogMessage("The user " + user + " executed " + name + " on target " + target);
            }
        }
    }
}