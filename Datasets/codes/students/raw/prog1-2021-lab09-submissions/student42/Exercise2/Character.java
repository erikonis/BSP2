package lu.uni.programming1.lab9.Exercise2;

public class Character {
    private String name;
    private int maxHealth, currHealth;
    
    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        currHealth= maxHealth;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrHealth() {
        return currHealth;
    }

    public boolean editHealth(int value){
    currHealth-=value;
    if(currHealth<=0)
    {currHealth=Math.max(currHealth, 0);
    return true;}
    else 
    currHealth=Math.min(currHealth,maxHealth);
   return false;
    }
    
}
