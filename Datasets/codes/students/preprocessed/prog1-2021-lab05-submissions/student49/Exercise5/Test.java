import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("The total number of giveaways is:");
        Shop.maxNumberOfGiveaways = scanner.nextInt();

        Shop s1 = new Shop(Shop.maxNumberOfGiveaways / 3);
        Shop s2 = new Shop(Shop.maxNumberOfGiveaways / 3);
        Shop s3 = new Shop(Shop.maxNumberOfGiveaways - 2 * (Shop.maxNumberOfGiveaways / 3));

        System.out.println(Shop.maxNumberOfGiveaways);
        while (Shop.maxNumberOfGiveaways > 0) {
            int price = rand.nextInt(121);
            int shop = rand.nextInt(3) + 1;
            Item x = new Item(price);
            switch (shop) {
            case 1:
                System.out.println("Purchase at shop 1:");
                s1.buy(x);
                // System.out.println("The number of giveaways left at this shop after this
                // step: " + s1.getLocalNumberOfGiveaways());
                break;
            case 2:
                System.out.println("Purchase at shop 2:");
                s2.buy(x);
                // System.out.println("The number of giveaways left at this shop after this
                // step: " + s2.getLocalNumberOfGiveaways());
                break;

            case 3:
                System.out.println("Purchase at shop 3:");
                s3.buy(x);
                // System.out.println("The number of giveaways left at this shop after this
                // step: " + s3.getLocalNumberOfGiveaways());
                break;

            default:
                break;
            }
            // System.out.println("The number of giveaways left in total after this step: "
            // + Shop.maxNumberOfGiveaways);
        }
        System.out.println("The number of giveaways left in the end: " + Shop.maxNumberOfGiveaways);

        scanner.close();

    }

}
