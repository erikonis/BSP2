import java.time.LocalDate;

public class Targetable extends Ability{

    private int value;
    private Character target;

    public Targetable(String abilityName, int value, Character target) {
        super(abilityName);
        this.value = value;
        this.target = target;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean execute(Character perso, Log logger) {

        if(target.getCurrentHealth()>0){    
            target.setCurrentHealth(target.getCurrentHealth()-this.value);

            if (target.getCurrentHealth()>0){
                String sentence = 
                LocalDate.now()+ ". "+target.toString()+ " has undergone " 
                +getAbilityName()+" used by "+perso.toString()
                +". SUCCESS.";
                logger.addToLog(sentence);
                return true;
            }else{
                String sentence = 
                LocalDate.now()+ ". "+target.getName()+" is dead because "+perso.getName()+" used "+getAbilityName()+". SUCCESS.";
                logger.addToLog(sentence);
                return true;
            }
        }else{
            String sentence = LocalDate.now()+ ". "+target.getName()+" is already dead. "+perso.getName()+" cannot perform "+getAbilityName()+". FAIL.";
            logger.addToLog(sentence);
            return false;
        }
        
    }
    
    
}
