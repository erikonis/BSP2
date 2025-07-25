package lu.uni.programming1.lab9.Exercise2;

import java.time.LocalDate;

public class Jump extends Actions {

    public Jump(Character user) {
        super(user);
       
    }

    public void execute()
    { String ev = LocalDate.now() + ": Action 'Jump' used by " + super.user.getName();
    if (this.user.getCurrHealth()==0) {
        ev= ev+ " - FAIL! ( " + this.user.getName() + " is dead, ghosts cannot jump, just fly.. )";
    }
    else ev= ev+" - SUCCESS!";        
    Event e= new Event(ev);
    Logger.create(e);


}


    
}
