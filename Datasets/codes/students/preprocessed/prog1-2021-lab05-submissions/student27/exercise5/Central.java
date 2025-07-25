import java.util.Scanner;

public class Central {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many costumers are there?");
        int costumers = scanner.nextInt();

        System.out.println("Total numbers of giveaways");
        int totalNumberOfGiveaways = scanner.nextInt();
        int regionalNumberOfGiveaways = totalNumberOfGiveaways / 3;
        System.out.println();

        scanner.close();

        Shop shop1 = new Shop(regionalNumberOfGiveaways, totalNumberOfGiveaways);
        Shop shop2 = new Shop(regionalNumberOfGiveaways, totalNumberOfGiveaways);
        Shop shop3 = new Shop(regionalNumberOfGiveaways, totalNumberOfGiveaways);

        while (costumers > 0) {
            double random = (Math.random() * 100);

            Item item = new Item((int) (Math.random() * 121));

            if (random < 100) {
                if (random < 67) {
                    if (random < 33) {
                        System.out.print("Shop3: ");
                        shop3.buy(item);
                        System.out.println();
                    } else {
                        System.out.print("Shop2: ");
                        shop2.buy(item);
                        System.out.println();
                    }
                } else {
                    System.out.print("Shop1: ");
                    shop1.buy(item);
                    System.out.println();
                }
            }
            costumers = costumers - 1;

            totalNumberOfGiveaways = shop1.getLocalNumberOfGiveaways() + shop2.getLocalNumberOfGiveaways() + shop3.getLocalNumberOfGiveaways();
            shop1.setTotalNumberofGiveaways(totalNumberOfGiveaways);
            shop2.setTotalNumberofGiveaways(totalNumberOfGiveaways);
            shop3.setTotalNumberofGiveaways(totalNumberOfGiveaways);
        }

        System.out.println();
        System.out.println("There are " + shop1.getLocalNumberOfGiveaways() + " giveaways left in shop 1.");
        System.out.println("There are " + shop2.getLocalNumberOfGiveaways() + " giveaways left in shop 2.");
        System.out.println("There are " + shop3.getLocalNumberOfGiveaways() + " giveaways left in shop 3.");
        System.out.println("There are in total " + totalNumberOfGiveaways + " giveaways left.");
    }
}
