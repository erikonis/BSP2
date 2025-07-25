public class Person {

    private String name;
    private String street;
    private String postalCode;
    private String city;
    private Country country;
    private String item;
    private Method method;

    public Person(String name, String street, String postalCode, String city, Country country, String item,
            Method method) {
        this.name = name;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.item = item;
        this.method = method;

    }

    public double totalCost() {
        double price;
        price = getCountry().getCountryPrice() + method.getMethodPrice();
        return price;
    }

    @Override
    public String toString() {
        return "Shipping for " + getName() + ", (" + getStreet() + ", " + getPostalCode() + ", " + getCity() + ", "
                + getCountry() + ")," + "\n  Item: " + item + "\n  Shipping method: " + method + "["
                + method.getMethodPrice() + "]. " + method.shipping(method) + "\n  TOTAL cost: " + totalCost() + " EUR";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

}
