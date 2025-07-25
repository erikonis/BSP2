public class Targetable extends Ability{

    private Character target;
    private int power;

    public Targetable(String name, Character player, Character target, int power) {
        super(name, player);
        this.target = target;
        this.power = power;
    }

    public Character getTarget() {
        return target;
    }

    public int getPower() {
        return power;
    }

    public String targetable(){
        Character player = super.getPlayer();
        if(player.equals(target) && power>0 || !player.equals(target) && power>0){
            Character c;
            if(player.equals(target)){
                c = player;
            }else{
                c = target;
            }
            int healed = 0;
            if((c.getCurrentHealthcounter()+power)<c.getMaxHealthcounter())
            {
                healed = power;
                c.setCurrentHealthcounter(c.getCurrentHealthcounter()+power);
            }
            else{
                healed = c.getMaxHealthcounter()-c.getCurrentHealthcounter();
                c.setCurrentHealthcounter(c.getMaxHealthcounter());

            }
            if(c.equals(player)){
                return "The character "+c.getName()+" used the ability " + super.getAbility() + " on himself. He healed " + healed + " points of his health.";
            }else{
                return "The character " +player.getName()+" used the ability " + super.getAbility() + "on the character "+c.getName()+". He healed " + healed + " points of his health.";
            }
            
        }
        if(player.equals(target) && power<0 || !player.equals(target) && power<0){
            Character c;
            if(player.equals(target)){
                c = player;
            }else{
                c = target;
            }
            if((c.getCurrentHealthcounter()+power)>0)
            {
                if(c.equals(player)){
                    c.setCurrentHealthcounter(c.getCurrentHealthcounter()+power);
                return "The character "+ c.getName()+" used the ability " + super.getAbility() + "on himself. He made " + power + " damage to himself.";
                }else{
                    c.setCurrentHealthcounter(c.getCurrentHealthcounter()+power);
                    return "The character "+ player.getName()+" used the ability " + super.getAbility() + " on " +c.getName() + ". He made " + power + " damage";
                }
            }
            else{
                c.setCurrentHealthcounter(0);                
                if(c.equals(player)){
                    return "The character "+ c.getName()+ " used the ability " + super.getAbility() + " on himself and sadly killed himself";
                }
                else{
                    return "The character "+player.getName()+" used the abilitiy "+ super.getAbility()+" on the character " + c.getName()+" and killed him";
                }
                
            }
            
        }
        return null;
        
    
    }
}
