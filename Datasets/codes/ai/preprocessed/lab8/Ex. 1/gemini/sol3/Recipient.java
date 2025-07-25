public class Recipient {
    private String name;
    private String address;
    private Country country;

    public Recipient(String name, String address, Country country) {
        this.name = name;
        this.address = address;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Country getCountry() {
        return country;
    }
}