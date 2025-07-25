public enum Country {
    LUXEMBOURG("Luxembourg", 0),
    FRANCE("France", 30),
    BELGIUM("Belgium", 50),
    GERMANY("Germany", 40);

    private final String name;
    private final int basePrice;

    Country(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public int getBasePrice() {
        return basePrice;
    }
}