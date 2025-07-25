public class Character {
    private String name;
    private int maximumhealth,currenthealth;
   
    

    public Character(String name, int maximumhealth) {
        this.name = name;
        this.maximumhealth = maximumhealth;
        this.currenthealth = maximumhealth;
    }



    public void damage(int power)
    {
       currenthealth=currenthealth-power;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getMaximumhealth() {
        return maximumhealth;
    }



    public void setMaximumhealth(int maximumhealth) {
        this.maximumhealth = maximumhealth;
    }



    public int getCurrenthealth() {
        return currenthealth;
    }



    public void setCurrenthealth(int currenthealth) {
        this.currenthealth = currenthealth;
    }
    
    	


}
