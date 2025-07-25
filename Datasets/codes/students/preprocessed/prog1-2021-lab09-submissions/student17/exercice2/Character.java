public class Character {
    private String name;
    private int maxhealth;
    private int currenhealth;

    public Character(String name, int maxhealth) {
        this.name = name;
        this.maxhealth = maxhealth;
        this.currenhealth = maxhealth;
    }

    public String getName() {
        return name;
    }

    public int getMaxhealth() {
        return maxhealth;
    }

    public int getCurrenhealth() {
        return currenhealth;
    }

    public void setCurrenhealth(int currenhealth) {
        this.currenhealth = currenhealth;
    }

    
    
}
