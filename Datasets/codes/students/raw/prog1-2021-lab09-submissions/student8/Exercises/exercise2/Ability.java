import java.time.LocalDate;
import java.util.Date;

public class Ability extends Action{
    private String name;
    private String text;

    public Ability(LocalDate date, Character character, String name) {
        super(date, character);
        this.name = name;
        text=getClass().getName()+" "+name+" used by "+character.getName()+". Date: "+date;

    }
    public String toString()
    {
        return text;
    }

 
    

}
