public class PackageShipping {
    public static void main(String[] args) {
        Country country = Factory.createCountry("Luxembourg");
        ShippingMethod shippingMethod = Factory.createShippingMethod("EXPRESS");

        printShippingDetails("John Doe", "123 Main St, Luxembourg", "Laptop", country, shippingMethod);
    }

    public static void printShippingDetails(String name, String address, String item, Country country, ShippingMethod shippingMethod) {
        int totalCost = country.getBasePrice() + shippingMethod.getFee();
        System.out.println("Recipient: " + name);
        System.out.println("Address: " + address);
        System.out.println("Item: " + item);
        System.out.println("Shipping Method: " + shippingMethod.getName() + " (Fee: " + shippingMethod.getFee() + " EUR, Handling Time: " + shippingMethod.getHandlingTime() + " days)");
        System.out.println("Total Cost: " + totalCost + " EUR");
    }
}