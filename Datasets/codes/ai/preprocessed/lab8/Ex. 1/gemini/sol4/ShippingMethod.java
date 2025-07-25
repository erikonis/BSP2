public enum ShippingMethod {
    EXPRESS("EXPRESS", 1, 100),
    PRIORITY("PRIORITY", 3, 50),
    CLASSIC("CLASSIC", 5, 10),
    NORUSH("NORUSH", 8, 0);

    private final String name;
    private final int handlingTime;
    private final int fee;

    ShippingMethod(String name, int handlingTime, int fee) {
        this.name = name;
        this.handlingTime = handlingTime;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public int getHandlingTime() {
        return handlingTime;
    }

    public int getFee() {
        return fee;
    }
}