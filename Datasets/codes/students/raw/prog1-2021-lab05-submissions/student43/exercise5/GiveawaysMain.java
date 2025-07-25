package lu.uni.programming1.lab5.exercise5;

import java.util.Scanner;

public class GiveawaysMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Number of Giveaways
        System.out.println("What would be the total number of giveaways ?");
        int maxNumberOfGiveaways = scanner.nextInt();
        int localNumberOfGiveaways = maxNumberOfGiveaways / 3;

        Shop.maxNumberOfGiveaways = maxNumberOfGiveaways;
        Shop [] shop  = {new Shop(localNumberOfGiveaways), new Shop(localNumberOfGiveaways), new Shop(localNumberOfGiveaways)};
        

        // Set price

        while (Shop.maxNumberOfGiveaways!=0) {
            int price = (int) (Math.random() * 121); // 120+1

            Item item = new Item(price);
            System.out.println(maxNumberOfGiveaways == 0 ? 
            "No items/no giveaway" : "Your item price :" + item.getPrice());

            int numberOfShop= (int) (Math.random() * 3); 

            shop[numberOfShop].buy(item);

            System.out.println("National number of giveaways : " + Shop.maxNumberOfGiveaways);
            System.out.println("Number of giveaways for shop 1 : " + shop[0].getLocalNumberOfGiveaways() 
            + " \n Number of giveaways for shop 2 : " + shop[1].getLocalNumberOfGiveaways()  
            + " \n Number of giveaways for shop 3 : " + shop[2].getLocalNumberOfGiveaways() );
            System.out.println();
        }

        // Total giveaways

        scanner.close();

    }
}
