package lu.uni.programming1.lab9.exercise2;

public class Ability implements Action{
    
    public String name;

    public Ability(String name){
        this.name = name;
    }

    public Log doAction(Character user){
        String s = "";
        s +=    "Action: " + name + " User: " + user.getName() + " (" +  user.getCurrHP() + "/" + user.getMaxHP() + " HP)";
        return new Log(s);
    }
}
