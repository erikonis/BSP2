package lu.uni.programming1.lab5.exercise5;

import java.util.Scanner;

public class Main { //test
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the total amount of giveaways available :");
        int maxNumberOfGiveaways = sc.nextInt();
        sc.close();
        Shop shop1, shop2, shop3;
        if(maxNumberOfGiveaways%3==0){
            shop1 = new Shop(maxNumberOfGiveaways/3, maxNumberOfGiveaways);
            shop2 = new Shop(maxNumberOfGiveaways/3, maxNumberOfGiveaways);
            shop3 = new Shop(maxNumberOfGiveaways/3, maxNumberOfGiveaways);
        }
        else{
            shop1 = new Shop(maxNumberOfGiveaways/3+1, maxNumberOfGiveaways);
            shop2 = new Shop(maxNumberOfGiveaways/3, maxNumberOfGiveaways);
            shop3 = new Shop(maxNumberOfGiveaways/3, maxNumberOfGiveaways);
        }
        while(maxNumberOfGiveaways>0){
            shop1.buy(new Item((int)(Math.random()*121)));
            shop2.buy(new Item((int)(Math.random()*121)));
            shop3.buy(new Item((int)(Math.random()*121)));
            maxNumberOfGiveaways = shop1.getLocalNumberOfGiveaways()+shop2.getLocalNumberOfGiveaways()+shop3.getLocalNumberOfGiveaways();
        }
        System.out.println("Number of giveaways in shop 1 : " + shop1.getLocalNumberOfGiveaways());
        System.out.println("Number of giveaways in shop 2 : " + shop2.getLocalNumberOfGiveaways());
        System.out.println("Number of giveaways in shop 3 : " + shop3.getLocalNumberOfGiveaways());
        System.out.println("Total number of giveaways left : " + maxNumberOfGiveaways);
    }
}
