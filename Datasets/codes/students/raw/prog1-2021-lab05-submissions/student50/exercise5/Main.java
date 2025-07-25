package exercise5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a maximum amount of giveaways: ");
        int giveaway=scanner.nextInt();
        scanner.close();
        Shop shop1=new Shop(giveaway/3);
        Shop shop2=new Shop(giveaway/3);
        Shop shop3=new Shop(giveaway/3);

        while(giveaway>0){
            Random r= new Random();
            Item item1 = new Item(120*r.nextDouble());    
            shop1.buy(item1);
            Item item2 = new Item(120*r.nextDouble());    
            shop2.buy(item2);
            Item item3 = new Item(120*r.nextDouble());    
            shop3.buy(item3);
            giveaway-=3;
        }
    }
}
