public class PackageShipping {
    public static void main(String[] args) {
        Country country = new Country("Luxembourg", 0);
        ShippingStrategy shippingStrategy = new ExpressShipping();

        printShippingDetails("John Doe", "123 Main St, Luxembourg", "Laptop", country, shippingStrategy);
    }

    public static void printShippingDetails(String name, String address, String item, Country country, ShippingStrategy shippingStrategy) {
        int totalCost = country.getBasePrice() + shippingStrategy.getFee();
        System.out.println("Recipient: " + name);
        System.out.println("Address: " + address);
        System.out.println("Item: " + item);
        System.out.println("Shipping Method: EXPRESS (Fee: " + shippingStrategy.getFee() + " EUR, Handling Time: " + shippingStrategy.getHandlingTime() + " days)");
        System.out.println("Total Cost: " + totalCost + " EUR");
    }
}