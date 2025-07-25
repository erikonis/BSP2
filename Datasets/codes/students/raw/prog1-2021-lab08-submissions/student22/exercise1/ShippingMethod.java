package exercise1;


public enum ShippingMethod{
    EXP(100,"Express",1),PRI(50,"Priority",3),
    CLA(10,"Classic",5),NOR(0,"NoRush",8);

    private double price;
    private String method;
    private int days;

    ShippingMethod(double price, String method, int days){
        this.price = price;
        this.method = method;
        this.days = days;
    }
    public double getPrice(){
        return price;
    }
    public String getMethod() {
        return method;
    }
    public int getDays() {
        return days;
    }

    public String toString(){
        return name() + "[" + getPrice() + "EUR]. Handling in " + getDays() + " day(s)";
    }
    
}
