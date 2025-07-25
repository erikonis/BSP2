public class Character {

    private String name;
    private int maxhealth;
    private int currenthealth;
    
    
    public Character(String name, int maxhealth, int currenthealth) {
        this.name = name;
        this.maxhealth = maxhealth;
        this.currenthealth = currenthealth;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getMaxhealth() {
        return maxhealth;
    }


    public void setMaxhealth(int maxhealth) {
        this.maxhealth = maxhealth;
    }


    public int getCurrenthealth() {
        return currenthealth;
    }


    public void setCurrenthealth(int currenthealth) {
        this.currenthealth = currenthealth;
    }

    
   
    
}
