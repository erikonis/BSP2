package exercise2;

public class Order {

    //Instance variables
    String name;
    double unit_prc;
    int amount;

    //Constructor for initializing instance variables

    public Order(String name, double unit_prc, int amount) {
        this.name = name;
        this.unit_prc = unit_prc;
        this.amount = amount;
    }

    //overriding hashcode for custom hashcode based on all the instance variables.
    @Override
    public int hashCode() {
        int mul = (int) (unit_prc*amount);
        return mul+name.hashCode();
    }

    //overriding equals for checking equal of each instance variable.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Order){
            Order order = (Order) obj;
            return (order.name.equals(this.name) && order.unit_prc == this.unit_prc && order.amount==this.amount);
        }else {
            return false;
        }
    }
}
