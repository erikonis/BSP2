public enum ShippingMethod {

    EXPRESS (100, 1),
    PRIORITY (50, 3),
    CLASSIC (10, 5),
    NORUSH (0, 8);

    private final int shippingFee;
    private final int shippingTime;

    private ShippingMethod(int shippingFee, int shippingTime) {
        this.shippingFee = shippingFee;
        this.shippingTime = shippingTime;
    }

    public int getShippingFee(){
        return shippingFee;
    }
    public int getShippingTime(){
        return shippingTime;
    }

    @Override
    public String toString() {
        return  this.name() +"["+ shippingFee +" EUR]. Handling in " + shippingTime + " day(s),";
    }

    

    
}
