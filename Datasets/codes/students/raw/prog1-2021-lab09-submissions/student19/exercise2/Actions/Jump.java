package lu.uni.programming1.lab9.exercise2.Actions;

import lu.uni.programming1.lab9.exercise2.ALogger;

public class Jump extends Action{
    
    public Jump(lu.uni.programming1.lab9.exercise2.Character p1) {
        super(p1, 0);
    }
    
    @Override
    public String toString() {
        return this.user.toString() + "Jumped !";
        
    }

    @Override
    public void execute() {
        ALogger.log(this, true);
    }
}
