public class Package {
    private String recipientName;
    private String recipientAddress;
    private String item;
    private ShippingMethod shippingMethod;
    private Country destinationCountry;

    public Package(String recipientName, String recipientAddress, String item, ShippingMethod shippingMethod, Country destinationCountry) {
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.item = item;
        this.shippingMethod = shippingMethod;
        this.destinationCountry = destinationCountry;
    }

    public void printShippingDetails() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(shippingMethod, destinationCountry);
        int totalCost = calculator.calculateTotalCost();

        System.out.println("Recipient: " + recipientName);
        System.out.println("Address: " + recipientAddress);
        System.out.println("Item: " + item);
        System.out.println("Shipping Method: " + shippingMethod + " (Fee: " + shippingMethod.getFee() + " EUR, Handling time: " + shippingMethod.getHandlingTime() + " days)");
        System.out.println("Destination: " + destinationCountry);
        System.out.println("Base Price: " + destinationCountry.getBasePrice() + " EUR");
        System.out.println("Total Cost: " + totalCost + " EUR");
    }
}
