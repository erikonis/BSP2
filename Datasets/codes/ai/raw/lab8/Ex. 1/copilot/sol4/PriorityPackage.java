public class PriorityPackage extends Package {
    public PriorityPackage(String recipientName, String recipientAddress, String item, Country country) {
        super(recipientName, recipientAddress, item, country, ShippingMethod.PRIORITY);
    }

    @Override
    public int calculateTotalCost() {
        return country.getBasePrice() + 50;
    }

    @Override
    protected int getHandlingTime() {
        return 3;
    }
}
