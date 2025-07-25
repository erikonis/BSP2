public class Package {
    private String recipientName;
    private String recipientAddress;
    private String item;
    private Country country;
    private ShippingMethod shippingMethod;

    public Package(String recipientName, String recipientAddress, String item, Country country, ShippingMethod shippingMethod) {
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.item = item;
        this.country = country;
        this.shippingMethod = shippingMethod;
    }

    public void printShippingDetails() {
        int totalCost = country.getBasePrice() + shippingMethod.getFee();
        System.out.println("Recipient: " + recipientName);
        System.out.println("Address: " + recipientAddress);
        System.out.println("Item: " + item);
        System.out.println("Shipping Method: " + shippingMethod.getName() + " (Fee: " + shippingMethod.getFee() + " EUR, Handling Time: " + shippingMethod.getHandlingTime() + " days)");
        System.out.println("Total Cost: " + totalCost + " EUR");
    }
}