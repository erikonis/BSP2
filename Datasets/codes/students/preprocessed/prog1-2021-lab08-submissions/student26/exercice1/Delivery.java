
//enum class for Countries available
enum Country{
    LUXEMBOURG,
    FRANCE,
    BELGIUM,
    GERMANY
}
//enum class for Shipping types available
enum Shipping{
    EXPRESS,
    PRIORITY,
    CLASSIC,
    NORUSH
}

public class Delivery {

    String name;
    String address;
    String item;
    double cost;
    double shipping_charges = 0;
    Country country;
    Shipping shipping;
    String indays;

    public Delivery(String name, String address, String item,Country country,Shipping shipping) {
        this.name = name;
        this.address = address;
        this.item = item;
        this.country = country;
        this.shipping = shipping;

        switch (shipping){
            case EXPRESS -> {
                shipping_charges = 100.0;
                indays = "1 day";
            }
            case PRIORITY -> {
                shipping_charges = 50;
                indays = "3 days";
            }
            case CLASSIC -> {
                shipping_charges = 10;
                indays = "5 days";
            }
            case NORUSH -> {
                shipping_charges = 0;
                indays = "8 days";
            }
        }

        switch(country){
            case FRANCE -> cost = 30;
            case BELGIUM -> cost = 50;
            case GERMANY -> cost =40;
            case LUXEMBOURG -> cost = 0;
        }

    }

    public void ship(){

        double total = cost + shipping_charges;

        System.out.println("Shipping for " + name + ", (" + address+ "),");
        System.out.println("\t\tItem: " + item + "\n" + "\t\tShipping method: " + shipping + "[" + shipping_charges + " EUR]. Handling in " + indays + "," );
        System.out.println("\t\tTOTAL cost: " + total + " EUR");
    }


}
