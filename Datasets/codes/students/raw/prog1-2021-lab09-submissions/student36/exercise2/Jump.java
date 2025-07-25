package lu.uni.programming1.lab9.exercise2;

import java.time.LocalDate;

public class Jump implements Action {
    

    @Override
    public boolean execute(Character perso, Log logger) {
        if (perso.getCurrentHealth()>0){
            logger.addToLog(LocalDate.now()+ ". "+perso.toString()+"jump. SUCCESS.");
            return true;
        }else{
            logger.addToLog(LocalDate.now()+ ". "+perso.getName() + "is dead. FAIL.");
            return false;
        }
    }

    
}
