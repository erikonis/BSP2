package exercise1;

public enum ShippingMethods {
    EXPRESS(1,100),
    PRIORITY(3,50),
    CLASSIC(5,10),
    NORUSH(8,0);

    int transportTime,price;

    private ShippingMethods(int transportTime,int price) {
        this.transportTime = transportTime;
        this.price = price;
    }
    
}
