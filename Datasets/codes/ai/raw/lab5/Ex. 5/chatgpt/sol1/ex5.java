// File: ex5.java
import java.util.Random;

public class ex5 {
    static class Item {
        private double price;

        public Item(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    static class Shop {
        private int localNumberOfGiveaways;
        static int maxNumberOfGiveaways;

        public Shop(int localNumberOfGiveaways) {
            this.localNumberOfGiveaways = localNumberOfGiveaways;
        }

        public void buy(Item item) {
            System.out.println("Price of purchased item: " + item.getPrice() + "€");

            if (localNumberOfGiveaways <= 0) {
                System.out.println("No more giveaways left in this shop.");
                return;
            }

            if (maxNumberOfGiveaways <= 0) {
                System.out.println("No more giveaways left at national level.");
                return;
            }

            Random random = new Random();
            double chance = 0;

            if (item.getPrice() < 20) {
                chance = 0.02;
            } else if (item.getPrice() <= 100) {
                chance = 0.05;
            } else {
                chance = 0.10;
            }

            if (random.nextDouble() < chance) {
                System.out.println("Congratulations, you won a giveaway!");
                localNumberOfGiveaways--;
                maxNumberOfGiveaways--;
            } else {
                System.out.println("No giveaway this time.");
            }
        }
    }

    public static void main(String[] args) {
        int totalGiveaways = 30;
        Shop.maxNumberOfGiveaways = totalGiveaways;

        Shop shop1 = new Shop(totalGiveaways / 3);
        Shop shop2 = new Shop(totalGiveaways / 3);
        Shop shop3 = new Shop(totalGiveaways / 3);

        Random random = new Random();

        while (Shop.maxNumberOfGiveaways > 0) {
            int shopChoice = random.nextInt(3);
            double price = random.nextDouble() * 120;
            Item item = new Item(price);

            if (shopChoice == 0) {
                shop1.buy(item);
            } else if (shopChoice == 1) {
                shop2.buy(item);
            } else {
                shop3.buy(item);
            }
        }

        System.out.println("Giveaways left in Shop 1: " + shop1.localNumberOfGiveaways);
        System.out.println("Giveaways left in Shop 2: " + shop2.localNumberOfGiveaways);
        System.out.println("Giveaways left in Shop 3: " + shop3.localNumberOfGiveaways);
        System.out.println("Giveaways left at national level: " + Shop.maxNumberOfGiveaways);
    }
}
