public class Character {
    // represents player's character
    private String name;
    private int maxHealth;
    private int currHealth;

    public Character(String name, int maxHealth, int currHealth) {
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

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrHealth() {
        return currHealth;
    }

    public void setCurrHealth(int currHealth) {
        this.currHealth = currHealth;
    }

    @Override
    public String toString() {
        return "Character [currHealth=" + currHealth + ", maxHealth=" + maxHealth + ", name=" + name + "]";
    }

}