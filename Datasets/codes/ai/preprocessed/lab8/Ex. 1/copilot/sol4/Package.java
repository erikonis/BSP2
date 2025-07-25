public abstract class Package {
    protected String recipientName;
    protected String recipientAddress;
    protected String item;
    protected Country country;
    protected ShippingMethod shippingMethod;

    public Package(String recipientName, String recipientAddress, String item, Country country, ShippingMethod shippingMethod) {
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.item = item;
        this.country = country;
        this.shippingMethod = shippingMethod;
    }

    public abstract int calculateTotalCost();

    public void printDetails() {
        System.out.println("Recipient: " + recipientName);
        System.out.println("Address: " + recipientAddress);
        System.out.println("Item: " + item);
        System.out.println("Shipping Method: " + shippingMethod.name() + " (Handling Time: " + getHandlingTime() + " days)");
        System.out.println("Total Cost: " + calculateTotalCost() + " EUR");
    }

    protected abstract int getHandlingTime();
}