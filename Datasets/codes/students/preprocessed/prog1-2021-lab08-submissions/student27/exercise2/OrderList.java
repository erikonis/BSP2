import java.util.ArrayList;

public class OrderList {
    
    private String clientStore;
    private ArrayList<Order> orders = new ArrayList<Order>();

    public OrderList(String clientStore) {
        this.clientStore = clientStore;
    }

    public void addOrder(Order order) {
        if (!orders.contains(order)) {
            orders.add(order);
        }
    }

    public double totalPrice() {
        double price = 0;

        for ( Order order : orders ) {
            price += order.getPrice() * order.getAmount();
        }

        return price;
    }

    public void order() {
        String output = "";

        output += "Order List for " + clientStore + ". You ordered " + orders.size() + " different products. Total cost is: " + totalPrice() + " EURO\n";
        int count = 0;
        for (Order order: orders) {
            ++count;
            output += "\t" + count + ". Order : " + order.getAmount() + " " + order.getProduct() + " x " + order.getPrice() + " EURO = " + order.getPrice()*order.getAmount() + " EURO\n";
        }

        System.out.println(output);;
    }
    

}
