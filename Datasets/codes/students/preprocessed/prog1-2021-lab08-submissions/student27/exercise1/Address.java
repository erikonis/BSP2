public class Address {

    private Person person;
    private int number;
    private String street;
    private int postalCode;
    private String city;
    private String country;

    public Address(Person person, int number, String street, int postalCode, String city, String country) {
        this.person = person;
        this.number = number;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
    
    public String getCity() {
        return city;
    }

    public Person getPerson() {
        return person;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String getStreet() {
        return street;
    }

    public int getPostalCode() {
        return postalCode;
    }

}
