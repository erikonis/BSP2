public class Package {
    private final String item;
    private final Recipient recipient;
    private final ShippingMethod shippingMethod;

    public Package(String item, Recipient recipient, ShippingMethod shippingMethod) {
        this.item = item;
        this.recipient = recipient;
        this.shippingMethod = shippingMethod;
    }

    public int calculateTotalCost() {
        int basePrice = recipient.getCountry().getBasePrice();
        int shippingFee = shippingMethod.getFee();
        return basePrice + shippingFee;
    }

    public void printShippingLabel() {
        System.out.println("=== Package Shipping Info ===");
        System.out.println("Recipient: " + recipient.getName());
        System.out.println("Address: " + recipient.getAddress() + ", " + recipient.getCountry());
        System.out.println("Item: " + item);
        System.out.println("Shipping Method: " + shippingMethod +
            " (Fee: " + shippingMethod.getFee() + " EUR, " +
            "Handling Time: " + shippingMethod.getHandlingTimeDays() + " day(s))");
        System.out.println("Total Cost: " + calculateTotalCost() + " EUR");
        System.out.println("==============================");
    }
}