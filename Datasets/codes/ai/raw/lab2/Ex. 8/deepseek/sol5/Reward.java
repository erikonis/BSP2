package model;

public class Reward {
    private final String description;
    
    public Reward(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString() {
        return "- " + description;
    }
}