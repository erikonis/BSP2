package lu.uni.programming1.lab9.exercise2;

import java.time.LocalDate;

public class Ability implements Action{

    protected String abilityName;

    public Ability(String abilityName) {
        this.abilityName = abilityName;
    }

    public String getAbilityName() {
        return abilityName;
    }

    public void setAbilityName(String abilityName) {
        this.abilityName = abilityName;
    }

    @Override
    public boolean execute(Character perso, Log logger) {
        if(perso.getCurrentHealth()>0){
            String sentence = LocalDate.now()+ ". " + perso.toString()+ " can "+ this.abilityName + ". SUCCESS." ;
            logger.addToLog(sentence);
            return true;
        }else{
            String sentence = LocalDate.now()+ ". " + perso.toString()+ " cannot "+ this.abilityName + " because he/she is dead. FAIL." ;
            logger.addToLog(sentence);
            return false;
        }
    }
    
}
