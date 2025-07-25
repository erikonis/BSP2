public class PackageDeliveryEnum {
    public static void processDelivery(String recipient, String address, Country country, String item, ShippingMethod method) {
        int totalCost = country.basePrice + method.fee;

        System.out.println("\n📦 Package Delivery Details:");
        System.out.println("Recipient: " + recipient);
        System.out.println("Address: " + address);
        System.out.println("Item: " + item);
        System.out.println("Shipping: " + method + " (" + method.handlingTime + " days, " + method.fee + " EUR)");
        System.out.println("Total Cost: " + totalCost + " EUR");
    }
}