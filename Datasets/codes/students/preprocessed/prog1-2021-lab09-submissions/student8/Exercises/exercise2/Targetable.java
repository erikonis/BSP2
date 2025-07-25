import java.time.LocalDate;
import java.util.Date;

public class Targetable extends Action {
    private Character otherchar;
    private int power;
    private String text;

   

    public Targetable(LocalDate date, Character character, Character otherchar, int power) {
        super(date, character);
        this.otherchar = otherchar;
        this.power = power;
        otherchar.damage(power);
        if(otherchar.getCurrenthealth()!=0)
        {
        text=character.getName()+" attacked "+otherchar.getName()+" and did ("+power+") damage. "+otherchar.getName()+" has "+otherchar.getCurrenthealth()+" health left. Date :"+date;
        }
        else
        {
            text=character.getName()+" attacked "+otherchar.getName()+" and did ("+power+") damage. "+otherchar.getName()+" has "+otherchar.getCurrenthealth()+" health left and dies. Date :"+date;
        }
    }
    



   
    public Targetable(LocalDate date, Character character, int power) {
        super(date, character);
        this.power = power;
        character.damage(power);
        if(character.getCurrenthealth()!=0)
        {
        text=character.getName()+" attacked himself and did ("+power+") damage."+character.getName()+" has "+character.getCurrenthealth()+" health left. Date: "+date;
        }
        else
        {
            text=character.getName()+" attacked himself and did ("+power+") damage."+character.getName()+" has "+character.getCurrenthealth()+" health left and he dies. Date: "+date;
        }
    }
    public String toString()
    {
        return text;
    }





   
  



}
