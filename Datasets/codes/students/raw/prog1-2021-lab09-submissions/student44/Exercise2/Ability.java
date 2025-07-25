package lu.uni.programming1.lab9.Exercise2;

public class Ability implements Actions{
  
    
    private String ability;
    private String action = "";

    public String getAction() {
        return action;
    }

    public String getAbility() {
        return ability;
    }

    public Ability(String ability) {
        this.ability = ability;
    }

    @Override
    public void execute(Character c,Logs logs) {
        if(c.getCurrentHealth()>0){
        action=c.getName()+" used the ability "+getAbility()+".\n";
        logs.add(action); 
    }
        else {
            action="Action cannot be executed because "+c.getName()+" has died.\n";
            logs.add(action); 
        }
              
    }
    
}
