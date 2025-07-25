public class ExpressShipping implements ShippingStrategy {
    @Override
    public int getFee() {
        return 100;
    }

    @Override
    public int getHandlingTime() {
        return 1;
    }
}