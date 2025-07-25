import java.util.HashMap;
import java.util.Map;

public class PackageDelivery {
    private static final Map<String, Integer> BASE_PRICES = Map.of(
        "France", 30, "Belgium", 50, "Germany", 40, "Luxembourg", 0
    );

    private static final Map<String, ShippingMethod> SHIPPING_METHODS = Map.of(
        "EXPRESS", new ShippingMethod("EXPRESS", 100, 1),
        "PRIORITY", new ShippingMethod("PRIORITY", 50, 3),
        "CLASSIC", new ShippingMethod("CLASSIC", 10, 5),
        "NORUSH", new ShippingMethod("NORUSH", 0, 8)
    );

    public static void processDelivery(String recipient, String address, String country, String item, String method) {
        int basePrice = BASE_PRICES.getOrDefault(country, 0);
        ShippingMethod shipping = SHIPPING_METHODS.getOrDefault(method.toUpperCase(), new ShippingMethod("NORUSH", 0, 8));
        int totalCost = basePrice + shipping.fee;

        System.out.println("\n📦 Package Delivery Details:");
        System.out.println("Recipient: " + recipient);
        System.out.println("Address: " + address);
        System.out.println("Item: " + item);
        System.out.println("Shipping: " + shipping.name + " (" + shipping.handlingTime + " days, " + shipping.fee + " EUR)");
        System.out.println("Total Cost: " + totalCost + " EUR");
    }
}
