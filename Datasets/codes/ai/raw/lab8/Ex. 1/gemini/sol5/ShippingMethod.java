public enum ShippingMethod {
    EXPRESS(1, 100),
    PRIORITY(3, 50),
    CLASSIC(5, 10),
    NORUSH(8, 0);

    private final int handlingTime;
    private final double fee;

    ShippingMethod(int handlingTime, double fee) {
        this.handlingTime = handlingTime;