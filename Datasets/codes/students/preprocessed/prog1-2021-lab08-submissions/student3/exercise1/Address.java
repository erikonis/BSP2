public class Address {
    
    private String name;
    private String street;
    private int postalCode;
    private String city;
    
    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }
   
    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public Address(String name, String street, int postalCode, String city) {
        this.name = name;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }
    @Override
    public String toString() {
        return "Shipping for: "+Colors.ANSI_PURPLE + name +Colors.ANSI_RESET +", "+Colors.ANSI_PURPLE +postalCode+Colors.ANSI_RESET +
        ", "+Colors.ANSI_PURPLE +city+Colors.ANSI_RESET ;
    }
    
    
}
