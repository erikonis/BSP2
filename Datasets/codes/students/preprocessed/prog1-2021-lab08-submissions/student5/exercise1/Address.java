public class Address {
    private String city;
    private String name;
    private String street;
    private int postalCode;

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
        this.city = city;
        this.name = name;
        this.street = street;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "\nShipping for: " + name + ", " + postalCode + ", " + city;
    }
}
