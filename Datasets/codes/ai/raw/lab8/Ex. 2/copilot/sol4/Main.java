import java.util.HashSet;
import java.util.Objects;

class Order {
    private String productName;
    private double unitPrice;
    private int amount;

    public Order(String productName, double unitPrice, int amount) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public double getTotalPrice() {
        return unitPrice * amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.unitPrice, unitPrice) == 0 &&
                amount == order.amount &&
                Objects.equals(productName, order.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, unitPrice, amount);
    }

    @Override
    public String toString() {
        return amount + " " + productName + " x " + unitPrice + " EURO = " + getTotalPrice() + " EURO";
    }
}

class OrderList {
    private String clientName;
    private HashSet<Order> orders;

    public OrderList(String clientName) {
        this.clientName = clientName;
        this.orders = new HashSet<>();
    }

    public void addItem(Order order) {
        orders.add(order);
    }

    public void printOrder() {
        double totalCost = 0;
        int index = 1;
        System.out.println("Order List for " + clientName + ". You ordered " + orders.size() + " different products.");
        for (Order order : orders) {
            System.out.println(index + ". Order: " + order);
            totalCost += order.getTotalPrice();
            index++;
        }
        System.out.println("Total cost is: " + totalCost + " EURO");
    }
}

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("Coke", 0.80, 100);
        Order o2 = new Order("KitKat", 0.70, 250);
        Order o3 = new Order("Orange", 0.72, 350);
        Order o4 = new Order("Snickers", 1.60, 150);
        Order o5 = new Order("Snickers", 1.60, 150);
        Order o6 = new Order("Coke", 0.80, 100);

        OrderList w2 = new OrderList("TheOne");
        w2.addItem(o1);
        w2.addItem(o2);
        w2.addItem(o3);
        w2.addItem(o4);
        w2.addItem(o5);
        w2.addItem(o6);
        w2.printOrder();
    }
}
