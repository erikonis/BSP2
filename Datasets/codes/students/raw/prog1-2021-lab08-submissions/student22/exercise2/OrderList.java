package exercise2;

public class OrderList {

    private Order[] orders;
    private String storeName;
    private int size=0;

    public OrderList(String storeName) {
        this.storeName = storeName;
        orders= new Order[size];
    }

    private void reAddItems(int counter){
        Order[] newList = new Order[counter];
        for (int i = 0; i < counter; i++) {
            newList[i] = orders[i];
        }

        orders = new Order[counter];
        for (int i = 0; i < counter; i++) {
            orders[i] = newList[i];
        }
    }

    public void addItem(Order o){
        size += 1;
        Order[] newList = new Order[size];
        for (int i = 0; i < orders.length; i++) {
            newList[i] = orders[i];
        }
        newList[size-1] = o;

        orders = new Order[size];
        for (int i = 0; i < newList.length; i++) {
            orders[i] = newList[i];
        }
    }
    

    public String getStoreName() {
        return storeName;
    }

    double totalPrice(){
        double total = 0;
        for (Order order : orders) {
            if(order != null){
                total += order.getPrice()*order.getAmount();
            }
            
        }
        return total;
    }

    void removeDuplicate(){
        int counter = 0;
        for (int i = 0; i < orders.length-1; i++) {
            for (int j = i+1; j < orders.length; j++) {
                if(orders[i] != null && orders[i].equals(orders[j])){
                    orders[i] = null;
                    counter++;
                    break;
                }
            }
        }

        for (int i = 0; i < orders.length-1; i++) {
            if(orders[i] == null && orders[i+1] != null){
                orders[i] = orders[i+1];
                orders[i+1] = null;
            }    
        }
        reAddItems(orders.length-counter);
    }

    public void order(){
        removeDuplicate();
        System.out.println("Order List for " + getStoreName() + ". You have " + orders.length + " different products. Total cost is: " + totalPrice() + " EURO");
        for (int i = 0; i < orders.length-1; i++) {
            int orderNumber = i+1;
            System.out.println("\t" + orderNumber + ". Order : " + orders[i].getAmount() + " " + orders[i].getName() + " x " + orders[i].getPrice() + " EURO = " + orders[i].getTotalPrice() + " EURO");
        }
    }



}
