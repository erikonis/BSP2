public class PackageShipping {

    public static void main(String[] args) {
        String recipientName = "John Doe";
        String recipientAddress = "123 Main St, Luxembourg";
        String item = "Laptop";
        String country = "Luxembourg";
        String shippingMethod = "EXPRESS";

        printShippingDetails(recipientName, recipientAddress, item, country, shippingMethod);
    }

    public static void printShippingDetails(String name, String address, String item, String country, String shippingMethod) {
        int basePrice = getBasePrice(country);
        int shippingFee = getShippingFee(shippingMethod);
        int totalCost = basePrice + shippingFee;
        int handlingTime = getHandlingTime(shippingMethod);

        System.out.println("Recipient: " + name);
        System.out.println("Address: " + address);
        System.out.println("Item: " + item);
        System.out.println("Shipping Method: " + shippingMethod + " (Fee: " + shippingFee + " EUR, Handling Time: " + handlingTime + " days)");
        System.out.println("Total Cost: " + totalCost + " EUR");
    }

    private static int getBasePrice(String country) {
        switch (country) {
            case "France": return 30;
            case "Belgium": return 50;
            case "Germany": return 40;
            case "Luxembourg": return 0;
            default: throw new IllegalArgumentException("Invalid country");
        }
    }

    private static int getShippingFee(String shippingMethod) {
        switch (shippingMethod) {
            case "EXPRESS": return 100;
            case "PRIORITY": return 50;
            case "CLASSIC": return 10;
            case "NORUSH": return 0;
            default: throw new IllegalArgumentException("Invalid shipping method");
        }
    }

    private static int getHandlingTime(String shippingMethod) {
        switch (shippingMethod) {
            case "EXPRESS": return 1;
            case "PRIORITY": return 3;
            case "CLASSIC": return 5;
            case "NORUSH": return 8;
            default: throw new IllegalArgumentException("Invalid shipping method");
        }
    }
}