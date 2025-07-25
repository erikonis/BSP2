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
