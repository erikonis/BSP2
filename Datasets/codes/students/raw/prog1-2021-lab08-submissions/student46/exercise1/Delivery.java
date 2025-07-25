package exercise1;

public class Delivery {

    private Country c;
    private DeliveryType dt;
    private int priceCountry, priceDeliveryType, shippingTime;
    private Recipient r;
    private Item i;

    public Delivery(DeliveryType dt, Recipient r, Item i) {
        this.c = r.getAddress().getCountry();
        this.dt = dt;
        this.r = r;
        this.i = i;
    }

    private void getCountry() {
        switch (c) {
        case LUXEMBOURG:
            priceCountry = 0;
            break;
        case FRANCE:
            priceCountry = 30;
            break;
        case GERMANY:
            priceCountry = 40;
            break;
        case BELGIUM:
            priceCountry = 50;
            break;
        }
    }

    private void getDeliveryType() {
        switch (dt) {
        case CLASSIC:
            priceDeliveryType = 10;
            shippingTime = 5;
            break;
        case EXPRESS:
            priceDeliveryType = 100;
            shippingTime = 1;
            break;
        case NORUSH:
            priceDeliveryType = 0;
            shippingTime = 8;
            break;
        case PRIORITY:
            priceDeliveryType = 50;
            shippingTime = 3;
            break;
        }
    }

    public String toString() {
        getCountry();
        getDeliveryType();
        String tmp = (shippingTime == 1 ? " day" : " days");

        return "Shipping for " + r.getName() + ", (" + r.getAddress() + "),\n\tItem: " + i.getName()
                + ",\n\tShipping method: " + dt + "[" + priceDeliveryType + " EUR]. Handling in " + shippingTime + tmp
                + ",\n\tTOTAL cost: " + (priceCountry + priceDeliveryType) + " EUR";
    }
}
