public abstract class Action {

    private Action action;
    private String name;
    private int damage;
    private Character target;
    private Character user;

    public Action(Character target) {
        this.target = target;
    }




    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Character getTarget() {
        return target;
    }

    public void setTarget(Character target) {
        this.target = target;
    }

    public Character getUser(){
        return user;
    }



}
 
 

    

