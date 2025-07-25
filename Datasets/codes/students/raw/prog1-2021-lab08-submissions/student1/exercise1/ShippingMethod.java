package lu.uni.programming1.lab8.exercise1;

public enum ShippingMethod {
    EXPRESS(100, 1),
    PRIORITY(50, 3),
    CLASSIC(10, 5),
    NORUSH(0, 8);

    private int fee;
    private int handlingtime;

    private ShippingMethod(int fee, int handlingtime){
        this.fee = fee;
        this.handlingtime = handlingtime;
    }
    public int getFee() {
        return fee;
    }
    public int getHandlingtime() {
        return handlingtime;
    }

}
