import java.time.LocalDate;
import java.util.Date;

public class Jump extends Action {

    private String text;
    public Jump(LocalDate date, Character character) {
        super(date, character);
        text="Jump used by "+character.getName()+". Date: "+date;
    }
    public String toString()
    {
        return text;
    }

  

 
    
}
