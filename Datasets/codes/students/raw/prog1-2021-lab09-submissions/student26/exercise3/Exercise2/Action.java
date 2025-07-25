package lu.uni.programming1.lab9.exercise3.Exercise2;
import java.time.LocalDate;

public abstract class Action {
    Character person;

    public Action(Character person){
        this.person = person;
    }

    public String execute(){
        return LocalDate.now() + " " + person.getName();
    }
}
