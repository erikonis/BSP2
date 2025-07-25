package lu.uni.programming1.lab8.exercise1;

public enum Country {

    LUXEMBOURG (0),
    FRANCE (30),
    BELGIUM (50),
    GERMANY (40);

    private final int countryPrice;

    private Country(int countryPrice) {
        this.countryPrice = countryPrice;
    }

    public int getCountryPrice() { 
        return countryPrice; 
    }

}
