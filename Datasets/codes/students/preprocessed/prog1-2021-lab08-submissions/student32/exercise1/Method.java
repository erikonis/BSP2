public enum Method {

    EXPRESS(100), PRIORITY(50), CLASSIC(10), NORUSH(0);

    private final double methodPrice;

    Method(double price) {
        this.methodPrice = price;
    }

    public double getMethodPrice() {
        return methodPrice;
    }

    public String shipping(Method method) {

        String shipment = " ";

        switch (method) {
        case EXPRESS:
            shipment = "Handling in 1 day,";
        case PRIORITY:
            shipment = "Handling in 3 days,";
        case CLASSIC:
            shipment = "Handling in 5 days,";
        case NORUSH:
            shipment = "Handling in 8 days,";

        }

        return shipment;
    }
}
