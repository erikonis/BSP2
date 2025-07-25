package lu.uni.programming1.lab8.exercise1;


public class Shipping {
    private String name;
    private String surname;
    private String address;
    private String item;
    private Country country; //uses enums as an atribute
    private ShippingMethod shipment; //uses enums as an atribute
    private int totalCost;
    private boolean ready;

    

    public Shipping (String name, String surname, String address, String item, Country country, ShippingMethod shipment){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.item = item;
        this.country = country;
        this.shipment = shipment;
        this.ready = false;
        totalCost =country.getShippingCost() + shipment.getFee();
        
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAddress(){
        return address;
    }
    public String getItem(){
        return item;
    }
    public int getTotalCost() {
        return totalCost;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public boolean getReady(){
        return ready;
    }
 

    @Override
    public String toString() {
    
        return "Shipping for " + name +" "+surname+", ("+address+","+country.name()
        +"),\n \t Item: " + item + ",\n \t Shipping method: "+shipment.name()
        +" ["+shipment.getFee()+" EUR]. Handling in "+shipment.getHandlingtime()
        +" day,\n \t total cost: " + totalCost+" EUR";
    }

    

    
}
