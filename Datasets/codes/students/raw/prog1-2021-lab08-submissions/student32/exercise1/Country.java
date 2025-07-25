package lu.uni.programming1.lab8.exercise1;

public enum Country {

    LUXEMBOURG(0), FRANCE(30), GERMANY(40), BELGIUM(50);

    private final double shipPrice;

    Country(double price) {
        this.shipPrice = price;
    }

    public double getCountryPrice() {
        return shipPrice;
    }

}