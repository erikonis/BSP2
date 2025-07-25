// Package.java (Modified to use interfaces)
public class Package {
    private Recipient recipient;
    private String itemShipped;
    private ShippingMethod shippingMethod;
    private CostCalculator costCalculator;
    private LabelPrinter labelPrinter;

    public Package(Recipient recipient, String itemShipped, ShippingMethod shippingMethod) {
        this(recipient, itemShipped, shippingMethod, new DefaultCostCalculator(), new DefaultLabelPrinter());
    }

    public Package(Recipient recipient, String itemShipped, ShippingMethod shippingMethod, CostCalculator costCalculator, LabelPrinter labelPrinter) {
        this.recipient = recipient;
        this.itemShipped = itemShipped;
        this.shippingMethod = shippingMethod;
        this.costCalculator = costCalculator;
        this.labelPrinter = labelPrinter;
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
        return costCalculator.calculateCost(recipient, shippingMethod);
    }

    public void printShippingLabel() {
        labelPrinter.printLabel(this);
    }
}