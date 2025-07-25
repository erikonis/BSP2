public class Character {
    private String name;
    private int maxHealth;
    private int currHealth;

    public Character(String name, int maxHealth, int currHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currHealth = currHealth;
    }

    public int getCurrHealth() {
        return currHealth;
    }
    public void setCurrHealth(int health) {
        if (currHealth + health > maxHealth){
            currHealth = maxHealth;
        }else if(currHealth - health < 0){
            currHealth = 0;
        }else{
            currHealth = health;
        }
    }

    @Override
    public String toString() {
        return "Character "+name+" has a current health of "+currHealth
        +" [Max Health: "+maxHealth+"]";
    }
}
