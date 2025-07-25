import lu.uni.programming1.lab9.exercise2.ALogger;
import lu.uni.programming1.lab9.exercise2.Character;

public class Ability extends Action {
    private String name;

    public Ability(Character usr, String name, int dmg) {
        super(usr, dmg);
        this.name = name;
    }

    @Override
    public void execute() {
        this.user.removeHP(this.dmg);
        ALogger.log(this, true);
    }

    @Override
    public String toString() {
        return this.user.toString() + " used ability '" + this.name + "' !";
    }
    
}
