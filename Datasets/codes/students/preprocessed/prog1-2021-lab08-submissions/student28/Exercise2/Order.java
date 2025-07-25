public class Order {
    String name;
    double price;
    int quantity;
    double result;

    public Order(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    @Override
    public String toString(){
        return "Order : " + this.quantity + " " + this.name + "x " + this.price + " EURO = " + this.quantity*this.price + "\n";
    }
}
