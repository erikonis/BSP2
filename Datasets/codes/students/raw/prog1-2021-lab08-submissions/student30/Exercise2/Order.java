package Exercise2;

public class Order {
    private String Name;
    private double price;
    private int amount;
    //I made amount an integer because you can not buy 1/2 an item
    public Order(String name, double price, int amount) {
        Name = name;
        this.price = price;
        this.amount = amount;
    }
    public String getName() {
        return Name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getAmount() {
        return amount;
    }
    public double getTotal(){
        return (price*amount);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (Name == null) {
            if (other.Name != null)
                return false;
        } else if (!Name.equals(other.Name))
            return false;
        if (amount != other.amount)
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }
    @Override
    public String toString(){
        return amount + " " + Name + " x " + price + " EURO = " + getTotal() + " EURO";   
    }
}
