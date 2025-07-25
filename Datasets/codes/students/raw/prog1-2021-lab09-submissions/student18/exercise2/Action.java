package lab9.exercise2;

import java.time.LocalDate;

public abstract class Action {
    Character user;

    public Action(Character user) {
        this.user = user;
    }

    public String exec(){
        if(user.getCurrentHealth()<=0){
            return user.getName()+" wanted to use "+getClass().getSimpleName()+" but is dead. - The action failed";
        }
        else{
            return LocalDate.now()+" - "+user.getName();
        }
    }
}
