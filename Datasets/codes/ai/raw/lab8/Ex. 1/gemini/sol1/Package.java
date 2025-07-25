public class Package {
    private String recipientName;
    private String recipientAddress;
    private String itemShipped;
    private Country destinationCountry;
    private ShippingMethod shippingMethod;

    // Constructor, getters, and setters...

    public double calculateTotalCost() {
        double basePrice = 0;
        switch (destinationCountry) {
            case FRANCE:
                basePrice = 30;
                break;
            case BELGIUM:
                basePrice = 50;
                break;
            case GERMANY:
                basePrice = 40;
                break;
            case LUXEMBOURG:
                break; // Base price is 0
        }
        return shippingMethod.getFee() + basePrice;
    }

    public void printPackageDetails() {
        System.out.println("Recipient: " + recipientName + ", " + recipientAddress);
        System.out.println("Item: " + itemShipped);
        System.out.println("Shipping Method: " + shippingMethod + " (Fee: " + shippingMethod.getFee() + ", Handling Time: " + shippingMethod.getHandlingTime() + " days)");
        System.out.println("Total Cost: " + calculateTotalCost() + " EUR");
    }
}