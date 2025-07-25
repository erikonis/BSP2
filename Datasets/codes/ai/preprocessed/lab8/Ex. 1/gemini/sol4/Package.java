public class Package {
    private Recipient recipient;
    private String itemShipped;
    private ShippingMethod shippingMethod;

    public Package(Recipient recipient, String itemShipped, ShippingMethod shippingMethod) {
        this.recipient = recipient;
        this.itemShipped = itemShipped;
        this.shippingMethod = shippingMethod;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public String getItemShipped() {
        return itemShipped;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public double calculateTotalCost() {
        return recipient.getCountry().getBasePrice() + shippingMethod.getFee();
    }

    public void printShippingLabel() {
        System.out.println("--- Shipping Label ---");
        System.out.println("Recipient Name: " + recipient.getName());
        System.out.println("Address: " + recipient.getAddress());
        System.out.println("Country: " + recipient.getCountry().getName());
        System.out.println("Item Shipped: " + itemShipped);
        System.out.println("Shipping Method: " + shippingMethod.getName() + " (Fee: " + shippingMethod.getFee() + " EUR, Handling Time: " + shippingMethod.getHandlingTime() + " days)");
        System.out.println("Total Shipping Cost: " + calculateTotalCost() + " EUR");
        System.out.println("----------------------");
    }
}