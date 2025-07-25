package lu.uni.programming1.lab5.exercise5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] prices = {3.45, 2.53, 25.53, 56.85, 75, 99.99, 137.56, 399};
        int local = 5;
        int max = local*3;

        Shop shop1 = new Shop(local, max);
        Shop shop2 = new Shop(local, max);
        Shop shop3 = new Shop(local, max);

        Shop[] shops = {shop1, shop2, shop3};
        Item item;
        double price;
            for(int i = 0; i < 77; i++){
                for(int j = 0; j < 3; j++){
                    price = prices[(int)(Math.random()*7)];
                    item = new Item(price);
                    int prev = shops[j].getMaxNumberOfGiveaways();
                    shops[j].buy(item);
                    System.out.println("Giveaways in shop "+ (j+1) + " available: " + shops[j].getLocalNumberOfGiveaways());
                    System.out.println("Total giveaways available: " + shops[j].getLocalNumberOfGiveaways());
                    if(prev > shops[j].getMaxNumberOfGiveaways()){
                        shop1.setMaxNumberOfGiveaways(shops[j].getMaxNumberOfGiveaways());
                        shop2.setMaxNumberOfGiveaways(shops[j].getMaxNumberOfGiveaways());
                        shop3.setMaxNumberOfGiveaways(shops[j].getMaxNumberOfGiveaways());
                    }
                }
            }
        sc.close();
    }
}
