package lu.uni.programming1.lab8.exercise1;

public class Address {
    private String street, city;
    private Country country;
    private int zip;


    public Address(String street, String city, Country country, int zip) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return street + ", " + zip + ", " + city + ", " + country; 
    }
}
