public class Order {
    
    private String itemName;
    private double unitPrice;
    private int quantity;
    
    public Order(String itemName, double unitPrice, int quantity) {
        this.setItemName(itemName);
        this.setUnitPrice(unitPrice);
        this.setQuantity(quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean equals(Order orderToCompare) {

        return orderToCompare.getItemName().equals(getItemName())
            && orderToCompare.getQuantity()==getQuantity()
            && orderToCompare.getUnitPrice()==getUnitPrice();
    }

    public int hashCode(){
        return getItemName().hashCode() + getQuantity();
    }
}
