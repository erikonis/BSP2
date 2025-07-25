public enum ShippingMethods {

    EXPRESS ("1 day",100),
    PRIORITY ("3 days",50),
    CLASSIC ("5 days",10),
    NORUSH ("8 days",0);

    private final String shippingDelay; 
    private final int shippingPrice;

    ShippingMethods(String shippingDelay, int shippingPrice) {
        this.shippingDelay = shippingDelay;
        this.shippingPrice = shippingPrice;
    }

    public int getShippingPrice() {
        return shippingPrice;
    }

    public String getShippingDelay() {
        return shippingDelay;
    }

}
