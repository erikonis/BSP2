package lu.uni.programming1.lab8.Exercise2;

public class Order {
    private String item;
    private double unitPrice;
    private int quantity;
    private double totalPrice;

    public Order(String item, double unitPrice, int quantity) {
        this.item = item;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Order() {
    }

    public double getTotalPrice() {
        return totalPrice = getUnitPrice() * getQuantity();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((item == null) ? 0 : item.hashCode());
        result = prime * result + quantity;
        long temp;
        temp = Double.doubleToLongBits(totalPrice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(unitPrice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (item == null) {
            if (other.item != null)
                return false;
        } else if (!item.equals(other.item))
            return false;
        if (quantity != other.quantity)
            return false;
        if (Double.doubleToLongBits(totalPrice) != Double.doubleToLongBits(other.totalPrice))
            return false;
        if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Order : " + getQuantity() + " " + getItem() + " x " + getUnitPrice() + " EURO = "
                + String.format("%.1f", getTotalPrice()) + " EURO";
    }

}
