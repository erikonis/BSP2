package lu.uni.programming1.lab8.exercise1;

public enum Country {

    LUXEMBOURG (0),
    FRANCE (30),
    BELGIUM (50),
    GERMANY (40);

    private int cost;
    private Country(int cost) {
        this.cost = cost;
    }
    
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name();
    }
    
}
