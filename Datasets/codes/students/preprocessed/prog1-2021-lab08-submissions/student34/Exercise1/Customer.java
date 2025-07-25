import java.util.ArrayList;

public class Customer {

    public String name;
    public String address;
    public String country;
    public String handlingPreference;
    ArrayList<Item> basket = new ArrayList<Item>();


    public Customer (String name, String address, String country, String handlingPreference) { this.name= name; this.address=address; this.country=country; this.handlingPreference=handlingPreference; }

    
}
