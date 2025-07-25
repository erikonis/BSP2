package lu.uni.programming1.lab8.exercise1;

public class Recipient {

    private String name, title, address;
    private Country country;

    public Recipient(String title, String name, String address, Country country) {
        this.name = name;
        this.title = title;
        this.address = address;
        this.country = country;
    }    

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAddress() {
        return this.address;
    }

    public Country getCountry() {
        return this.country;
    }

    @Override
    public String toString() {
        return getTitle() + ". " + getName() + ", (" + getAddress() + ", " + getCountry() + ")";
    }

}
