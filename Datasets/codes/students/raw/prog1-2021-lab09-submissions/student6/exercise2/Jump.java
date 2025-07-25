package src.lu.uni.programming1.lab9.exercise2;

import java.time.LocalDate;

public class Jump extends Actions{

    public Jump(Character user) {
        super(user);
    }
    
    public void execute() {
        Logs();
    }

    @Override
    public void Logs() {
        LocalDate today = LocalDate.now();
        if(user.health==0)
            System.out.println("["+today.toString()+"] "+user.name+" is dead");
        else
            System.out.println("["+today.toString()+"] "+user.name+" jumped");
        
    }
}
