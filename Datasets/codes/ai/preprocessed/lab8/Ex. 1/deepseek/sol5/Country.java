public class Country {
    private String name;
    private int basePrice;

    public Country(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public int getBasePrice() {
        return basePrice;
    }
}