package lu.uni.programming1.lab9.exercise2;

public class Character {
    
    private String name;
    private int maximumhealth;
    private int currenthealth;
    
    public Character(String name, int maximumhealth, int currenthealth) {
        this.name = name;
        this.maximumhealth = maximumhealth;
        this.currenthealth = currenthealth;
    }

    public String getName() {
        return name;
    }

    public int getMaximumhealth() {
        return maximumhealth;
    }

    public int getCurrenthealth() {
        return currenthealth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaximumhealth(int maximumhealth) {
        this.maximumhealth = maximumhealth;
    }

    public void setCurrenthealth(int currenthealth) {
        this.currenthealth = currenthealth;
    }

    
}
