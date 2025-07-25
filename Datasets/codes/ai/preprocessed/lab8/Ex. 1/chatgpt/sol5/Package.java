public class Package {
    private final Recipient recipient;
    private final String item;
    private final ShippingMethod shippingMethod;

    public Package(Recipient recipient, String item, ShippingMethod shippingMethod) {
        this.recipient = recipient;
        this.item = item;
        this.shippingMethod = shippingMethod;
    }

    public void printPackageInfo() {
        int basePrice = recipient.getCountry().getBasePrice();
        int fee = shippingMethod.getFee();
        int totalCost = basePrice + fee;

        System.out.println("Recipient: " + recipient.getName());
        System.out.println("Address: " + recipient.getAddress() + ", " + recipient.getCountry());
        System.out.println("Item: " + item);
        System.out.println("Shipping Method: " + shippingMethod + " (Fee: " + fee + " EUR, Handling Time: " +
                shippingMethod.getHandlingTime() + " days)");
        System.out.println("Total Cost: " + totalCost + " EUR");
    }
}