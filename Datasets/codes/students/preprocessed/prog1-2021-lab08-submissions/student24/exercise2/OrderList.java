import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrderList {
    private int counter = 0;
    private Order[] list = new Order[6];
    private String name;

    public OrderList(String name) {
        this.name = name;
    }

    public void addItem(Order order) {
        list[counter] = order;
        counter += 1;
    }

    public void order() {
        List<Order> list2 = Arrays.asList(list);
        Set<Order> set = new HashSet<Order>(list2);
        int setLen = 0;
        double totalCost = 0;
        String steps = "";
        for (Order order : set) {
            totalCost += order.getQuantity() * order.getUnitPrice();
            double productCost = order.getQuantity() * order.getUnitPrice();
            setLen += 1;
            steps += String.format("%d. Order : %d %s x %.2f EURO = %.1f EURO\n", setLen, order.getQuantity(),
                    order.getProduct(), order.getUnitPrice(), productCost);
        }
        String result = String.format(
                "Order List for %s. You ordered %d different products. Total cost is: %.1f EURO\n\n", name, setLen,
                totalCost) + steps;
                
        System.out.println(result);

    }
}
