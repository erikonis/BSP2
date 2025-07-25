public class ShippingMethod {
    private String name;
    private int fee;
    private int handlingTime;

    public ShippingMethod(String name, int fee, int handlingTime) {
        this.name = name;
        this.fee = fee;
        this.handlingTime = handlingTime;
    }

    public int getFee() {
        return fee;
    }

    public int getHandlingTime() {
        return handlingTime;
    }
}