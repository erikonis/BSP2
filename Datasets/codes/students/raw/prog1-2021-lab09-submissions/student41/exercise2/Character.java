package lu.uni.programming1.lab9.exercise2;

public class Character {
    private String name;
    private double maxHealth;
    private double currHealth;

    public Character(String name, double maxHealth, double currHealth){
        this.name = name;
        this.maxHealth = maxHealth;
        this.currHealth = currHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getCurrHealth() {
        return currHealth;
    }

    public void setCurrHealth(double currHealth) {
        this.currHealth = currHealth;
    }
    
    
}
