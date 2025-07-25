public class Order {
    
    private String itemName;
    private double price;
    private int amount;

    public Order(String itemName, double price, int amount) {
        this.itemName = itemName;
        this.price = price;
        this.amount = amount;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public double total() {
        return price*amount;
    }

    public String toString() {
        return amount + " " + itemName + " x " + price + " EURO = " + total() + " EURO";
    }


    @Override
    public boolean equals(Object o ) {
        if (o == this)
            return true;
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        boolean check = (this.itemName.equals(order.itemName) && this.price == order.price && this.amount == order.amount);
        return check;
    }

    @Override
    public int hashCode() {
        return itemName.hashCode() + (int) price + amount;
    }

}
