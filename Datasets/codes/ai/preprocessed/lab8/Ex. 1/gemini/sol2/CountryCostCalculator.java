public class CountryCostCalculator implements CostCalculator {
    @Override
    public double calculateCost(Country country, ShippingMethod shippingMethod) {
        double basePrice = 0;
        switch (country) {
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
                break;
        }
        return shippingMethod.getFee() + basePrice;
    }
}