package exercise2;

public class Targetable extends Ability {
    private int power;
    private Character target;

    public Targetable(Character character, String name, int power, Character target) {
        super(character, name);
        this.power = power;
        this.target = target;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Character getTarget() {
        return target;
    }

    public void setTarget(Character target) {
        this.target = target;
    }

    public String toString() {
        target.setCurrentHealth(Math.min(Math.max(target.getCurrentHealth() - power, 0), target.getMaxHealth()));
        return super.toString() + " on " + target + " for " + power + " damage.";
    }
}
