public class Order {
    
    private String ItemName;
    private int totalCost;
    private ShippingMethod shippingMethod;

    public Order(String itemName, Country country, ShippingMethod shippingMethod) {
        this.ItemName = itemName;
        this.totalCost = country.getCountryPrice() + shippingMethod.getShippingFee();
        this.shippingMethod = shippingMethod;
    }

    public String getItemName() {
        return ItemName;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
}
