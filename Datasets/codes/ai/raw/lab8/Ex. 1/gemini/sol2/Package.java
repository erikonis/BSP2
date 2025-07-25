public class Package {
    private String recipientName;
    private String recipientAddress;
    private String itemShipped;
    private Country destinationCountry;
    private ShippingMethod shippingMethod;
    private CostCalculator costCalculator;

    public Package(CostCalculator costCalculator) {
        this.costCalculator = costCalculator;
    }

    public String getRecipientName() { return recipientName; }
    public void setRecipientName(String recipientName) { this.recipientName = recipientName; }
    public String getRecipientAddress() { return recipientAddress; }
    public void setRecipientAddress(String recipientAddress) { this.recipientAddress = recipientAddress; }
    public String getItemShipped() { return itemShipped; }
    public void setItemShipped(String itemShipped) { this.itemShipped = itemShipped; }
    public Country getDestinationCountry() { return destinationCountry; }
    public void setDestinationCountry(Country destinationCountry) { this.destinationCountry = destinationCountry; }
    public ShippingMethod getShippingMethod() { return shippingMethod; }
    public void setShippingMethod(ShippingMethod shippingMethod) { this.shippingMethod = shippingMethod; }


    public double calculateTotalCost() {
        return costCalculator.calculateCost(destinationCountry, shippingMethod);
    }

    public void printPackageDetails() {
        System.out.println("Recipient: " + recipientName + ", " + recipientAddress);
        System.out.println("Item: " + itemShipped);
        System.out.println("Shipping Method: " + shippingMethod + " (Fee: " + shippingMethod.getFee() + ", Handling Time: " + shippingMethod.getHandlingTime() + " days)");
        System.out.println("Total Cost: " + calculateTotalCost() + " EUR");
    }
}