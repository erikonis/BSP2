public class TargetableAction extends AbilityAction{
    private Character target;
    private int power;

    public TargetableAction(Character player, String name, Character target, int power) {
        super(player, name);
        this.target = target;
        this.power = power;
    }

    public Character getTarget() {
        return target;
    }

    public void setTarget(Character target) {
        this.target = target;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void execute(){
        super.execute();
        if(super.getPlayer() != target){
            target.setCurrentHealth(target.getCurrentHealth()-getPower());
        }else{
            super.getPlayer().setCurrentHealth(super.getPlayer().getCurrentHealth()-getPower());
        }
    }

    
}
