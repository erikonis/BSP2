public class DefaultLabelPrinter implements LabelPrinter {
    @Override
    public void printLabel(Package pkg) {
        System.out.println("--- Shipping Label ---");
        System.out.println("Recipient Name: " + pkg.getRecipient().getName());
        System.out.println("Address: " + pkg.getRecipient().getAddress());
        System.out.println("Country: " + pkg.getRecipient().getCountry().getName());
        System.out.println("Item Shipped: " + pkg.getItemShipped());
        System.out.println("Shipping Method: " + pkg.getShippingMethod().getName() + " (Fee: " + pkg.getShippingMethod().getFee() + " EUR, Handling Time: " + pkg.getShippingMethod().getHandlingTime() + " days)");
        System.out.println("Total Shipping Cost: " + calculateCost(pkg) + " EUR");
        System.out.println("----------------------");
    }

    private double calculateCost(Package pkg) {
        CostCalculator calculator = new DefaultCostCalculator();
        return calculator.calculateCost(pkg.getRecipient(), pkg.getShippingMethod());
    }
}