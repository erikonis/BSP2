public class Targetable extends Ability{
    Character target;
    int effect;

    public Targetable(Character person, Character target, int effect, String ability){
        super(person, ability);
        this.target = target;
        this.effect = effect;
    }

    @Override
    public String execute(){
        if (target == null || target.getCurHealth() < 0){
            return super.execute() + " but it failed.";
        }
        String log = super.execute() + " to ";
        if (effect< 0){
            log += "attack ";
        }
        else{
            log += "heal ";
        }
        if(target.equals(person)){
            log += "herself for ";
        }
        else {
            log += target.getName() + " for ";
        }
        target.setCurHealth(target.getCurHealth()+effect);
       
        log += Math.abs(effect) + " points. ";
        if (target.getCurHealth() <= 0){
            log += target.getName() + " died.";
        }
        if (target.getCurHealth() > target.curHealth){
            target.setCurHealth(target.curHealth);
        }
        if (target.getCurHealth()<0){
            target.setCurHealth(0);
        }

        return log;
    }
}
