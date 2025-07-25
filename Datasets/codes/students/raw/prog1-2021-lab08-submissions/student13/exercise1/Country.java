package lu.uni.programming1.lab8.exercise1;

public enum Country {

    Luxembourg(0),
    France(30),
    Belgium(50),
    Germany(40);

    private int base;

    Country(int base) {
        this.base = base;
    }

    public int getCost() {
        return base;
    }
    
}
