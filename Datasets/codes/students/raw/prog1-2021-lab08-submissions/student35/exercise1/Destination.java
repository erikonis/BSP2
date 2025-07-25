package exercise1;

public enum Destination {
    FRANCE ("France", 30),
    BELGIUM ("Belgium", 50),
    GERMANY ("Germany", 40),
    LUXEMBOURG ("Luxembourg", 0);
    private final String name;
    private final int cost;
    Destination(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    //enum for the set destinations, no new ones can be created otherwise, contains getters for the name of the destination and cost to ship there
    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
    
}
