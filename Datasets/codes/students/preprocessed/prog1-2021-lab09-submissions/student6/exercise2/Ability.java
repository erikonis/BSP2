import java.time.LocalDate;

public class Ability extends Actions{

    String abilityName;

    public Ability(Character user, String abilityName) {
        super(user);
        this.abilityName = abilityName;
    }

    public void execute() {
        if(user.health>0){

            int healingPoints= 20;
        if(user.maxHealth-user.health<healingPoints)
            healingPoints=user.maxHealth-user.health;
        user.health += healingPoints;
        }
        Logs();
    }
    
    @Override
    public void Logs() {
        LocalDate today = LocalDate.now();
        if(user.health==0)
            System.out.println("["+today.toString()+"] "+user.name+" is dead");
        else
            System.out.println("["+today.toString()+"] "+user.name+" healed : Health = "+user.health);
        
    }
    
}
