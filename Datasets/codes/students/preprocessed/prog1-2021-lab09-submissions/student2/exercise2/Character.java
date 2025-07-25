public class Character {
    
    private String name;
    private int maxHealth;
    int curHealth;

    public Character(String name, int curHealth, int maxHealth){
        this.name=name;
        this.curHealth=curHealth;
        this.maxHealth=maxHealth;
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
    public int getCurHealth() {
        return curHealth;
    }
    public void setCurHealth(int curHealth) {
        this.curHealth = curHealth;
    }

    @Override
    public String toString() {
        return name+": "+curHealth+" / "+maxHealth+" HP";
    }

}
