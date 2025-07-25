public class Character {
    private String name;
    private int maximum_health;
    private int current_health;

    Character(String name,int maximum_health,int current_health){
        this.name = name;
        this.maximum_health = maximum_health;
        this.current_health = current_health;
    }


    public String getName() {
        return name;
    }
    public int getMaximum_health() {
        return maximum_health;
    }
    public int getCurrent_health() {
        return current_health;
    }
}

        
    
