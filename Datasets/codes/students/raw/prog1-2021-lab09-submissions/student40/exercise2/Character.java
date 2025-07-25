package lu.uni.programming1.lab9.exercise2;

public class Character {
    private String name;
    private int maxHP;
    private int currHP;

    public Character(String name, int maxHP) {
        this.name = name;
        this.maxHP = maxHP;
        currHP = maxHP;
    }

    public String getName() {
        return this.name;
    }

    public int getMaxHP() {
        return this.maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrHP() {
        if(currHP < 0){
            currHP = 0;
        }
        return this.currHP;
    }

    public void setCurrHP(int currHP) {
        this.currHP = currHP;
    }

}
