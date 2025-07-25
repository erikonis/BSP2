package lu.uni.programming1.lab9.exercise3.Exercise2;

public class Character {
    String name;
    int maxHealth;
    int curHealth;

    public Character(String name, int maxHealth, int curHealth){
        this.name = name;
        this.maxHealth = maxHealth;
        this.curHealth = curHealth;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMaxHealth(){
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth){
        this.maxHealth = maxHealth;
    }

    public int getCurHealth(){
        return curHealth;
    }

    public void setCurHealth(int curHealth){
        this.curHealth = curHealth;
    }


}
