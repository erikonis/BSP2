public class DefaultCostCalculator implements CostCalculator {
    @Override
    public double calculateCost(Recipient recipient, ShippingMethod shippingMethod) {
        return recipient.getCountry().getBasePrice() + shippingMethod.getFee();
    }
}