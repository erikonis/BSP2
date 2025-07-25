public class Address {

    private String Streetname;
    private int streetNumber;
    private int postcode;
    private String city;
    private String country;

    public Address(String streetname, int streetNumber, int postcode, String city, String country) {
        Streetname = streetname;
        this.streetNumber = streetNumber;
        this.postcode = postcode;
        this.city = city;
        this.country = country;
    }

    public String getStreetname() {
        return Streetname;
    }

    public void setStreetname(String streetname) {
        Streetname = streetname;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address, the streetname is  " + Streetname + ", the city is " + city + ", the country is " + country
                + ", the postcode is "
                + postcode + " and the streetNumber is " + streetNumber + " ";
    }

}