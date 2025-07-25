public class ExpressPackage extends Package {
    public ExpressPackage(String recipientName, String recipientAddress, String item, Country country) {
        super(recipientName, recipientAddress, item, country, ShippingMethod.EXPRESS);
    }

    @Override
    public int calculateTotalCost() {
        return country.getBasePrice() + 100;
    }

    @Override
    protected int getHandlingTime() {
        return 1;
    }
}
