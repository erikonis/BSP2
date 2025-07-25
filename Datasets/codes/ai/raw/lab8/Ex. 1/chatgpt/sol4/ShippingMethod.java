public enum ShippingMethod {
    EXPRESS(100, 1),
    PRIORITY(50, 3),
    CLASSIC(10, 5),
    NORUSH(0, 8);

    private final int fee;
    private final int handlingTimeDays;

    ShippingMethod(int fee, int handlingTimeDays) {
        this.fee = fee;
        this.handlingTimeDays = handlingTimeDays;
    }

    public int getFee() {
        return fee;
    }

    public int getHandlingTimeDays() {
        return handlingTimeDays;
    }
}
