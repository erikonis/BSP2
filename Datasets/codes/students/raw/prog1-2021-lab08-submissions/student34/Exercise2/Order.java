package Exercise2;

public class Order {


    String name;
    double price;
    int quantity;


    public Order() {
    }

    public Order(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order name(String name) {
        setName(name);
        return this;
    }

    public Order price(double price) {
        setPrice(price);
        return this;
    }

    public Order quantity(int quantity) {
        setQuantity(quantity);
        return this;
    }




    
}
