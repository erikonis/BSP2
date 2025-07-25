public class Targetable implements Action{
    Action ability;
    Character player;
    Character target;
    double value;


    public Targetable(Character player, Action ability, double value, Character target){
        this.player = player;
        this.ability = ability;
        this.value = value;
        this.target = target;
    }

    public String execute(){
        if(value >= 0){
            if((target.getMaxHealth() - target.getCurrHealth()) >= value){
                target.setCurrHealth(target.getCurrHealth() + value);
            }
        }else{
            if((target.getCurrHealth() + value) >= 0){
                target.setCurrHealth(target.getCurrHealth() + value);
            }
        }
        String text = "";
        if(target.getCurrHealth() <= 0){
            text = "Your character " + target.getName() + " has died!";
        }else{
            text = "Your health has been modified by [" + value + "]" +
            " Current healht: " + target.getCurrHealth();
        }
        return text;
    }
}
