package exercise2;

/**
 * Character
 */
public class Player {
    private int maxhealth, currenthealth;
    private String name;
    // private Action action;
    // private Targetable targetable;
    // private Player target;
    public Player(int maxhealth, String name) {
    this.name = name;
    this.maxhealth = maxhealth;
    currenthealth = maxhealth;
    }
    public int getMaxhealth() {
        return maxhealth;
    }
    // public void setMaxhealth(int maxhealth) {
    //     this.maxhealth = maxhealth;
    // }
    public int getCurrenthealth() {
        return currenthealth;
    }
    public void modCurrenthealth(int modhealth) {
        // this.modhealth = modhealth;
        currenthealth = currenthealth + modhealth;
        currenthealth = Math.max(currenthealth, 0);
        currenthealth = Math.min(currenthealth, maxhealth);
    }
    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public void doAct(Action action){
        // this.action = action;
        action.act(this);}

    public void doTarget(Targetable targetable, Player target){
        // this.targetable = targetable;
        // this.target = target;
        targetable.targetact(this, target);
    }
    
}