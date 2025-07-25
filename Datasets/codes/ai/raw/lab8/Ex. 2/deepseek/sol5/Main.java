import java.util.TreeSet;
import java.util.Comparator;
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

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getAmount() {
        return amount;
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
        return String.format("%d %s x %.2f EURO = %.1f EURO", 
            amount, productName, unitPrice, getTotalPrice());
    }
}

class OrderList {
    private String clientStore;
    private TreeSet<Order> orders;

    public OrderList(String clientStore) {
        this.clientStore = clientStore;
        // Custom comparator that uses all fields for ordering
        this.orders = new TreeSet<>(Comparator.comparing(Order::getProductName)
                                            .thenComparingDouble(Order::getUnitPrice)
                                            .thenComparingInt(Order::getAmount));
    }

    public void addItem(Order order) {
        orders.add(order);
    }

    public void order() {
        double totalCost = orders.stream()
                               .mapToDouble(Order::getTotalPrice)
                               .sum();

        System.out.printf("Order List for %s. You ordered %d different products. Total cost is: %.1f EURO%n",
                clientStore, orders.size(), totalCost);

        int index = 1;
        for (Order order : orders) {
            System.out.printf("%d. Order: %s%n", index++, order);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("Coke", 0.80, 100);
        Order o2 = new Order("KitKat", 0.70, 250);
        Order o3 = new Order("Orange]", 0.72, 350);
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
        w2.order();
    }
}