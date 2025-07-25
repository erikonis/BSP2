package lu.uni.programming1.lab9.exercise2;

public class Jump extends Actions {

    public Jump(Character hero) {
        this.user=hero;
    }

    public void Execute(Logger log) {
        String temp = user.GetName() + " has jumped.";
        log.Log(temp);
    }
    
}
