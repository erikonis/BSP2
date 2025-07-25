public enum Country {
    FRANCE(30), BELGIUM(50), GERMANY(40), LUXEMBOURG(0);

    private final int basePrice;

    Country(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getBasePrice() {
        return basePrice;
    }
}