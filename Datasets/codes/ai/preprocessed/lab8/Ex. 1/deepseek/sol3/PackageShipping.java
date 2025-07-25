public class PackageShipping {
    public static void main(String[] args) {
        String recipientName = "John Doe";
        String recipientAddress = "123 Main St, Luxembourg";
        String item = "Laptop";
        Country country = Country.LUXEMBOURG;
        ShippingMethod shippingMethod = ShippingMethod.EXPRESS;

        printShippingDetails(recipientName, recipientAddress, item, country, shippingMethod);
    }

    public static void printShippingDetails(String name, String address, String item, Country country, ShippingMethod shippingMethod) {
        int totalCost = country.getBasePrice() + shippingMethod.getFee();
        System.out.println("Recipient: " + name);
        System.out.println("Address: " + address);
        System.out.println("Item: " + item);
        System.out.println("Shipping Method: " + shippingMethod + " (Fee: " + shippingMethod.getFee() + " EUR, Handling Time: " + shippingMethod.getHandlingTime() + " days)");
        System.out.println("Total Cost: " + totalCost + " EUR");
    }
}