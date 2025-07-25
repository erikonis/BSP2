public class DeliveryType {
    private String shippingMethode;
    private int shippingFee = 0;
    private int shippingTime;

    public DeliveryType(String shippingMethode) {
        this.shippingMethode = shippingMethode;
    }

    public String getShippingMethode() {
        return shippingMethode;
    }

    public void setShippingMethode(String shippingMethode) {
        this.shippingMethode = shippingMethode;
    }

    public int getShippingFee() {
        shippingFee = 0;
        if (shippingMethode.equals("EXPRESS")) {
            shippingFee = 100;
        } else if (shippingMethode.equals("PRIORITY")) {
            shippingFee = 50;
        } else if (shippingMethode.equals("CLASSIC")) {
            shippingFee = 10;
        }
        return shippingFee;
    }

    public int getShippingTime() {
        shippingTime = 8;
        if (shippingMethode.equals("EXPRESS")) {
            shippingTime = 1;
        } else if (shippingMethode.equals("PRIORITY")) {
            shippingTime = 3;
        } else if (shippingMethode.equals("CLASSIC")) {
            shippingTime = 5;
        }
        return shippingTime;
    }

    @Override
    public String toString() {
        return "Shipping methode: " + shippingMethode + " [" + shippingFee +" EUR]. Handling in " + shippingTime + " day,\n";
    }

}
