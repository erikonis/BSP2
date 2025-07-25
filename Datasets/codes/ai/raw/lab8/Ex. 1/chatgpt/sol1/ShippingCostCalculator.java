public class ShippingCostCalculator {
    private final ShippingMethod shippingMethod;
    private final Country country;

    public ShippingCostCalculator(ShippingMethod shippingMethod, Country country) {
        this.shippingMethod = shippingMethod;
        this.country = country;
    }

    public int calculateTotalCost() {
        return country.getBasePrice() + shippingMethod.getFee();
    }
}
