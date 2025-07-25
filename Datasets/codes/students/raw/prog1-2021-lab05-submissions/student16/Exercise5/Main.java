package Exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        

        Scanner scanner= new Scanner(System.in);
        int maxNumberOfGiveaways= scanner.nextInt();

        int giveawaysPerShop=maxNumberOfGiveaways/3;

        Shop shop1= new Shop(giveawaysPerShop);
        Shop shop2= new Shop(giveawaysPerShop);
        Shop shop3= new Shop(giveawaysPerShop);

        while(giveawaysPerShop>0)
        {
            double randomItemprice= (double) (Math.random()*(120-0+1));
            Item item= new Item(randomItemprice);
            shop1.buy(item);
        }
        giveawaysPerShop=maxNumberOfGiveaways/3;
        for(int i=0; i<giveawaysPerShop; i++)
        {
            double randomItemprice= (double) (Math.random()*(120-0+1));
            Item item= new Item(randomItemprice);
            shop2.buy(item);
        }
        giveawaysPerShop=maxNumberOfGiveaways/3;
        for(int i=0; i<giveawaysPerShop; i++)
        {
            double randomItemprice= (double) (Math.random()*(120-0+1));
            Item item= new Item(randomItemprice);
            shop3.buy(item);
        }
        System.out.println("Shop 1: " + giveawaysPerShop);
        System.out.println("Shop 2: " + giveawaysPerShop);
        System.out.println("Shop 3: " + giveawaysPerShop);
        //System.out.println("Shop 2: " + maxNumberOfGiveaways-giveawaysPerShop);

        scanner.close();
    }
}
