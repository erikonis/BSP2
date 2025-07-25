public enum ShippingMethod {
    EXPRESS(100, 1), PRIORITY(50, 3), CLASSIC(10, 5), NORUSH(0, 8);

    private final int fee;
    private final int handlingTime;

    ShippingMethod(int fee, int handlingTime) {
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
