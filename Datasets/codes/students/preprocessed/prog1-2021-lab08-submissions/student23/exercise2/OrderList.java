import java.util.HashSet;

public class OrderList {
    
    private HashSet<Order> orders;
    private String name;

    public OrderList(String name) {
        this.name = name;
        orders = new HashSet<>();
    } 

    public boolean checkItem(Order order) {
        for (Order singleOrder : orders) {
            if (order.equals(singleOrder)) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public void addItem(Order order) {
        if (checkItem(order)) {
            orders.add(order);
        }
        
    }

    public void order() {
        int items = 0;
        double total = 0;
        for (Order order : orders) {
            System.out.printf("\n\t%d. Order : %d %s x %.2f EURO = %.2f", ++items, order.getQuantity(), order.getProduct(), order.getUnitPrice(), order.getUnitPrice()*order.getQuantity());
            total += order.getUnitPrice()*order.getQuantity();
        }
        System.out.printf("\nThis is your order for %s. You ordered %d products. Your total is %.2f\n\n", name, items, total);
        
    }

}
