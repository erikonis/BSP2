package exercise2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the name of the costumer?");
        String costumerName = scanner.next();

        OrderList orderList = new OrderList(costumerName);

        int endOfOrder = 1;

        while (endOfOrder > 0) {
            System.out.println("Which product got requested?");
            String productName = scanner.next();

            System.out.println("How many of the product got requested?");
            int amount = scanner.nextInt();

            System.out.println("What is the unit price of the product?");
            double unitPrice = scanner.nextDouble();

            System.out.println("Got an other product requested? (yes or no)");
            String anOtherProduct = scanner.next();

            Order order = new Order(productName, unitPrice, amount);

            orderList.add(order);

            if(anOtherProduct.equals("no")){
                endOfOrder = -1;
            }
        }

        orderList.createArray();

        double totalCost= 0;
        for(int i=0; i<orderList.size(); i++){
            totalCost = totalCost + (orderList.alOrders[i].getAmount()*orderList.alOrders[i].getUnitPrice()) ;
        }

        System.out.println("Order List for " + costumerName + ". You ordered " + orderList.size() + " different products. Total cost is: " + totalCost +" EURO");
        for(int i=0; i<orderList.size(); i++){
            System.out.println("\t" + (i+1) + ". " + orderList.toString());
        }

        scanner.close();
    }
}
