public class Order {

    private String item;
    private double priceUnit;
    private int amountItems;

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public double getPriceUnit() {
        return priceUnit;
    }
    public void setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit;
    }
    public int getAmountItems() {
        return amountItems;
    }
    public void setAmountItems(int amountItems) {
        this.amountItems = amountItems;
    }

    public Order (String item, double priceUnit, int amountItems){
        this.item=item;
        this.priceUnit=priceUnit;
        this.amountItems=amountItems;
    }

    @Override
    public String toString() {
        return "Order: "+ item +", amount: "+amountItems+" KG, Price/Unit: "+priceUnit+" EUR";
    }
        
}
