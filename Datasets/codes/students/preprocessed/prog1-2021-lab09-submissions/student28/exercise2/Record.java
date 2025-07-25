import java.time.LocalDate;
import java.time.LocalTime;
public record Record(Character c,Character t) {
    
    public String action(Object o){
        String line =String.valueOf(LocalDate.now()) +" " +LocalTime.now()+ "\n";
        if(o instanceof executable){
            if(o instanceof Targetable){
                Targetable t = (Targetable)o;
                line += t.targetable();
            }
            else{
                if(o instanceof Targetable){
                    Ability a = (Ability)o;
                    line += a.useAbility();
                }
            }
        }

        
        return line;
    }
    public String action(Object o, Character c){
        String line = String.valueOf(LocalDate.now()) +" " +LocalTime.now()+ "\n";
        if(o instanceof Jump){
            Jump j = (Jump)o;
            line += j.jump(c);
        }
        return line;
    }
}
