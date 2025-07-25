package lu.uni.programming1.lab8.exercise2;

public class Order {

    private String item;
    private double price;
    private int amount;
    private double totalprice;

    public Order(String item, double price, int amount) {
        this.item = item;
        this.price = price;
        this.amount = amount;
        totalprice = price * amount;
    }

    public String GetItem() {
        return item;
    }

    public double GetPrice() {
        return price;
    }

    public int GetAmount() {
        return amount;
    }

    public double GetTotalPrice() {
        return totalprice;
    }

    @Override
    public boolean equals(Object a) {
        if (a==this) {
            return true;
        }
        
        if (!(a instanceof Order)) {
            return false;
        }
        
        Order k = (Order)a;
        return (item == k.GetItem() && price == k.GetPrice() && amount == k.GetAmount());
    }

    @Override
    public int hashCode() {
        int value;
        value = amount + (int)price*1000 + item.hashCode();
        return value;
    }
    
}
