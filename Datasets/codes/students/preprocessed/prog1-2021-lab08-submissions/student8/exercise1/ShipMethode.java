public enum ShipMethode {
    EXPRESS(1,100),
    PRIORITY(3,50),
    CLASSIC(5,10),
    NORUSH(8,0);

    int day;
    double price;
    
    private ShipMethode(int day, double price) {
        this.day = day;
        this.price = price;
    }
}
