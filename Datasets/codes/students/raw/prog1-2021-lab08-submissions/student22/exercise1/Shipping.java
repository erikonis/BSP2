package exercise1;

public class Shipping {
    private Client c;
    private Item i;
    private ShippingMethod sm;
    private Country co;

    Shipping(Client c, Item i, ShippingMethod sm){
        this.c = c;
        this.i = i;
        this.sm = sm;
        this.co = c.getCountry();
    }

    double getPrice(){
        return (sm.getPrice()+co.getPrice());
    }

    @Override
    public String toString() {
        return "Shipping for " + c.toString() 
        + ",\n\tItem: " + i.getName()
        + ",\n\tShipping method: " + sm.toString() 
        + ",\n\tTotal cost: " + getPrice() + " EUR";
    }

    

}
