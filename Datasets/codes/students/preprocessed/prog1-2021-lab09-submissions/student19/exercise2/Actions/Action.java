import lu.uni.programming1.lab9.exercise2.Character;

public abstract class Action {
    protected Character user;
    protected int dmg;

    public Action(Character usr, int dmg) {
        this.user = usr;
        this.dmg = dmg;
    }
    
    public void execute() {
        //nothing
    }

    public Character getUser() {return this.user;}

    public Character getTarget() {
        return null;
    }
}
