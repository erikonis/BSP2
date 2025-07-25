
public class Recipient {
    private String name;
    private String street;
    private String zipcode;
    private String city;
    private String country;

    public Recipient(String name, String street, String zipcode, String city, String country) {
        this.setName(name);
        this.setStreet(street);
        this.setZipcode(zipcode);
        this.setCity(city);
        this.setCountry(country);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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

    @Override
    public String toString(){
        return name + ", (" + street + ", " + zipcode + ", " + city + ", " + country + ")\n";
    }    
}
