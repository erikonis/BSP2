import java.time.LocalDate;

public class Targatable extends Actions{
    Character target;
    int power;
    Ability ability;

    public Targatable(Character user, Character target, int power) {
        super(user);
        this.target = target;
        this.power = power;
    }

    public Targatable(Character user, Character target, Ability ability) {
        super(user);
        this.target = target;
        this.ability = ability;
    }

    public void execute(){
        if(user.health>0){

            if(ability == null || target==null){
                if(target.health>power)
                    target.health -= power;
                else if(target != null)
                    target.health = 0;
                Logs();
            }
            else{
                Ability targetAbility = new Ability(target, ability.abilityName);
                targetAbility.execute();
            }
        }else
        Logs();
    }

    @Override
    public void Logs() {
        LocalDate today = LocalDate.now();
        if(user.health==0)
            System.out.println("["+today.toString()+"] "+user.name+" is dead");
        else if(target==null)
            System.out.println("["+today.toString()+"] Action was unsucessful, no target registerd");
        else if(target.health==0)
            System.out.println("["+today.toString()+"] "+user.name+" killed "+target.name);
        else
            System.out.println("["+today.toString()+"] "+user.name+" did "+power+" points of damage to "+target.name);
        
    }
    
}
