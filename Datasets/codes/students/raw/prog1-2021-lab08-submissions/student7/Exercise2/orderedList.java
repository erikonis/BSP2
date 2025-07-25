package lu.uni.programming1.lab8.Exercise2;

import java.util.ArrayList;

public class orderedList {
    ArrayList<order> ordersList = new ArrayList<order>();
    private String orderListName;
    private double orderPrice;

    public void addItem(order newItem) {
        boolean preExistedItem = false;
        for (int i = 0; i < ordersList.size(); i++) {
            if (ordersList.get(i).equals(newItem)) {
                System.out.println("\nDuplicate found");
                preExistedItem = true;
            }
        }
        if (!preExistedItem) {
            ordersList.add(newItem);
            orderPrice += newItem.getTotalPrice();
        }
    }

    public orderedList(String orderListName) {
        this.orderListName = orderListName;
        orderPrice = 0;
    }

    public void order() {
        System.out.println("\nOrder list for " + orderListName + ".You ordered " + ordersList.size() + " products. "
                + "Total cost is :" + orderPrice);
        for (int i = 0; i < ordersList.size(); i++) {
            System.out.println(i + ". Order : " + ordersList.get(i));
        }
    }
}