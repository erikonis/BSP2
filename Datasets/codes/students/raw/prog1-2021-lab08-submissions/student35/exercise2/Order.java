package exercise2;


public class Order {
    private int quantity;
    private double price, totalprice;
    private String name;
    Order(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        totalprice = quantity*price;}
    //constructor for an order, accepts a name, price for one item and quantity, also calculates the total price for all items
    //followed by getters for all of those variables
    public int getQuantity() {
        return quantity;
    }
    // public void setQuantity(int quantity) {
    //     this.quantity = quantity;
    // }
    public double getPrice() {
        return price;
    }
    // public void setPrice(double price) {
    //     this.price = price;
    // }
    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public double getTotalPrice(){
        return totalprice;
    }
    
}
