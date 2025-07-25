public class TargetableAbility extends Ability{
    private Character target;
    private int value;

    public TargetableAbility(Character user, Character target, int value, String name) {
        super(user, name);
        this.target = target;
        this.value = value;
    }

    @Override
    public String exec() {
        if(target == null){
            return super.exec()+" but did not specify a target. - The action failed";
        }
        String msg = super.exec()+" on ";
        msg += target.equals(user) ? "himself" : target.getName();
        msg += ". The target was ";
        msg += value<0 ? "attacked" : "healed";
        msg += " for "+Math.abs(value)+" points.";
        msg += target.getCurrentHealth()+value<=0 ? " The target died of the attack." :"";
        target.setCurrentHealth(target.getCurrentHealth()+value);
        if(target.getCurrentHealth()>target.getMaximumHealth()){
            target.setCurrentHealth(target.getMaximumHealth());
        }
        if(target.getCurrentHealth()<0){
            target.setCurrentHealth(0);
        }
        return msg;
    }
}
