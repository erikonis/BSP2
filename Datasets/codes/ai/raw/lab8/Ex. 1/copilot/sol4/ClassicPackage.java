public class ClassicPackage extends Package {
    public ClassicPackage(String recipientName, String recipientAddress, String item, Country country) {
        super(recipientName, recipientAddress, item, country, ShippingMethod.CLASSIC);
    }

    @Override
    public int calculateTotalCost() {
        return country.getBasePrice() + 10;
    }

    @Override
    protected int getHandlingTime() {
        return 5;
    }
}
