public class Order {

    private int totalCost = 0;
    private ShippingMethods shippingMethod;
    private int shippingPrice;
    private Country country;
    private Recipient recipient;
    private Item item;

    public Order(Recipient recipient, Item item, ShippingMethods shippingMethod){
        this.shippingMethod = shippingMethod;
        this.country = recipient.getCountry();
        this.recipient =recipient;
        this.item = item;
    }

    public ShippingMethods getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethods shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public int getTotalCost() {

        totalCost=country.getBaseprice()+shippingMethod.getShippingPrice();

        return totalCost;
    }

    public String toString() {
        int total=getTotalCost();
        return this.recipient.toString()+this.item.toString()+"Shipping method: "+getShippingMethod()+"["+shippingPrice+"EUR]."+this.getShippingMethod().getShippingDelay()+","+
        "\nTOTAL cost: "+total+"EUR";
    }
}
