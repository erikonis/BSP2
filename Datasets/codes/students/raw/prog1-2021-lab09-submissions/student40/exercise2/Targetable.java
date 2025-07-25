package lu.uni.programming1.lab9.exercise2;

public class Targetable extends Ability{
    
    public Targetable(String name){
        super(name);
    }


    public Log doAction(Character user, Character target, int value) {
        String s = "";

        target.setCurrHP(target.getCurrHP() + value);
        s += toString(user, target);
        s += isDead(user);
        if(!(user.equals(target))){
            s += isDead(target);
        }
        return new Log(s);
    }

    public String isDead(Character character){
        String s = "";

        if(character.getCurrHP()==0){
            s += " " + character.getName() + " was defeated by " + name;
        }
        return s;
    }

    public String toString(Character user, Character target) {
        return  "Action: " + name + 
                " User: " + user.getName() + " (" +  user.getCurrHP() + "/" + user.getMaxHP() + " HP)" +
                " Target: " + target.getName() + " (" + target.getCurrHP() + "/" + target.getMaxHP() + " HP)";
    }
}
