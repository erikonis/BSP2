public enum Country {
    LUXEMBOURG(0),
    FRANCE(30),
    BELGIUM(50),
    GERMANY(40);

    private int shippingCost;

    private Country(int shippingCost){
        this.shippingCost = shippingCost ;
    }
    public int getShippingCost() {
        return shippingCost;
    }
    
}
