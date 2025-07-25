public enum Country {
    FRANCE(30), BELGIUM(50), GERMANY(40), LUXEMBOURG(0);
    public final int basePrice;
    Country(int basePrice) { this.basePrice = basePrice; }
}