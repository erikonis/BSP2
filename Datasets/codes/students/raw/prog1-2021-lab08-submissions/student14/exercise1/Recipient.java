package exercise1;

public class Recipient {

    private String name;
    private String street;
    private int postalCode;
    private String city;
    private Country country;
    
    public Recipient(String name, String street, int postalCode, String city, Country country) {
        this.setName(name);
        this.setStreet(street);
        this.setPostalCode(postalCode);
        this.setCity(city);
        this.setCountry(country);
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Shipping for "+getName()+", "+"("+getStreet()+","+getPostalCode()+","+getCity()+","+getCountry()+"),\n";
    }
    
}
