public enum Country {
    LUXEMBOURG(0),
    FRANCE(30),
    BELGIUM(50),
    GERMANY(40);

    private final int basePrice;

    Country(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getBasePrice() {
        return basePrice;
    }
}
