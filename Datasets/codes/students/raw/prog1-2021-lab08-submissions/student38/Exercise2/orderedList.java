package lu.uni.programming1.lab8.Exercise2;

import java.util.ArrayList; // import the ArrayList class

public class orderedList {
    ArrayList<order> listOfOrders = new ArrayList<order>(); // Create an ArrayList object
    private String nameOfOrderList;
    private double priceOfOrder;

    public void addItem(order newItem) {
        boolean itemAlreadyExists = false; // checking for duplicates
        for (int i = 0; i < listOfOrders.size(); i++) {
            if (listOfOrders.get(i).equals(newItem)) {
                System.out.println("\nDuplicate order found!!");
                itemAlreadyExists = true;
            }
        }
        if (!itemAlreadyExists) { // add new item
            listOfOrders.add(newItem);
            priceOfOrder += newItem.getTotalPrice();
        }
    }

    public orderedList(String nameOfOrderList) {
        this.nameOfOrderList = nameOfOrderList;
        priceOfOrder = 0;
    }

    public void order() {
        System.out.println("\nOrder list for " + nameOfOrderList + ". You ordered " + listOfOrders.size()
                + " products. " + "Grand Total is : " + priceOfOrder + "€");
        for (int i = 1; i < listOfOrders.size(); i++) {
            System.out.println("Order: " + i + " = " + listOfOrders.get(i));
        }
    }
}