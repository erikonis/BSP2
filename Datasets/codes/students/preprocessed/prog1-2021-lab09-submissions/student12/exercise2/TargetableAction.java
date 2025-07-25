public class TargetableAction extends Ability implements Targetable{

    private int value;
    private Character target;

    Records record = Records.getInstance();

    public TargetableAction(AbilityName AbName,Character character,Character target,int value){
        super(AbName,character);
        this.setValue(value);
        this.target = target;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void execute() {
        executeOnTarget();
    }

    public void executeOnTarget(){
        super.execute(" on "+target.getName());
        target.setCurrentHealth(target.getCurrentHealth()+value);
    }
  
}
