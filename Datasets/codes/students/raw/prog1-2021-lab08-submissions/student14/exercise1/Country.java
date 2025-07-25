package exercise1;

public enum Country {

    FRANCE (30),
    BELGIUM (50),
    GERMANY (40),
    LUXEMBOURG (0);

    private final int baseprice; 

    Country(int baseprice) {
        this.baseprice = baseprice;
    }

    public int getBaseprice() {
        return baseprice;
    }
}
