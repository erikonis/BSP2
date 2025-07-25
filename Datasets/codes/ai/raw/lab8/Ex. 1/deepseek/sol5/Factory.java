public class Factory {
    public static Country createCountry(String name) {
        switch (name) {
            case "France": return new Country(name, 30);
            case "Belgium": return new Country(name, 50);
            case "Germany": return new Country(name, 40);
            case "Luxembourg": return new Country(name, 0);
            default: throw new IllegalArgumentException("Invalid country");
        }
    }

    public static ShippingMethod createShippingMethod(String name) {
        switch (name) {
            case "EXPRESS": return new ShippingMethod(name, 100, 1);
            case "PRIORITY": return new ShippingMethod(name, 50, 3);
            case "CLASSIC": return new ShippingMethod(name, 10, 5);
            case "NORUSH": return new ShippingMethod(name, 0, 8);
            default: throw new IllegalArgumentException("Invalid shipping method");
        }
    }
}