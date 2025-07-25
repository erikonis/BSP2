package lu.uni.programming1.lab9.exercise2.Actions;
import lu.uni.programming1.lab9.exercise2.ALogger;
import lu.uni.programming1.lab9.exercise2.Character;


public class Targetable extends Action {
    private String name;
    private boolean selfTarget;
    private Character target;
    private boolean succeed;

    public Targetable(Character usr, Character target, String name, boolean selfTarget, int dmg) {
        super(usr, dmg);

        this.name = name;
        this.selfTarget = selfTarget;
        
        if (selfTarget && target.equals(usr)) {
            this.target = target; 
            this.succeed = true;           
        } else if (!(target.equals(usr))) {
            this.target = target;
            this.succeed = true;
        } else {
            this.target = target;
            this.succeed = false;
        }
    }

    @Override
    public Character getTarget() {
        return this.target;
    }

    @Override
    public void execute() {
        if (succeed) {this.target.removeHP(this.dmg);}
        ALogger.log(this, succeed);
    }

    @Override
    public String toString() {
        return this.user.toString() + "Performed '" + this.name + "' on " + this.target.toString();
    }
    
}
