package lu.uni.programming1.lab8.exercise2;

public class Order {
    private String item;
    private double price;
    private int quantity;
    private double totalPrice;

    public Order(String item, double price, int quantity){
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        totalPrice = price * quantity;
    }
    public String getItem() {
        return item;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    @Override
    public String toString() {
        return "Order : " +quantity+ " "+item+" x "+price+" EURO = " + getTotalPrice() + " EURO ";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((item == null) ? 0 : item.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(quantity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalPrice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        Order objOrder = (Order) obj;
        if(objOrder.item.compareTo(item) == 0 && objOrder.price == price && objOrder.quantity == quantity)
            return true;
        else
            return false;

    }
}
