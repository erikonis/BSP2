package lu.uni.programming1.lab9.Exercise2;

import java.time.LocalDate;

public class Ability extends Actions {
    private String name;

    public Ability(Character user, String name) {
        super(user);
        this.name = name;
       
    }

    public void execute(){
    String ev= LocalDate.now() + ": Ability '" + this.getName() + "' used by " + super.user.getName();
    if (this.user.getCurrHealth()==0) 
        ev=ev+ " - FAIL! ( " + this.user.getName() + " is dead, ghosts cannot cast abilites..yet? )";
    else
    ev=ev+ " - SUCCESS!";        
    Event e= new Event(ev);
    Logger.create(e);
     }

    public String getName() {
        return name;
    }


    

}
